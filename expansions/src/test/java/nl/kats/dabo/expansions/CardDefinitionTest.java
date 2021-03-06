package nl.kats.dabo.expansions;

import junit.framework.Assert;
import nl.kats.dabo.dsl.CardBuilder;
import nl.kats.dabo.dsl.CardCatalog;
import nl.kats.dabo.dsl.cards.CardDefinition;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.*;

public class CardDefinitionTest {

    /**
     * Builds each CardBuilder class under nl.kats.dabo.expansions, and checks whether each of these classes adds
     * exactly one card to the CardCatalog. It also checks whether the CardBuilder class is declared final, that their
     * title/subtitle and collectorsId are set and unique, as well as that no exceptions occur during the card build
     * process.
     */
    @Test
    public void testCardDefinitions() throws IOException, ClassNotFoundException {
        Map<String, String> cardTitles = new HashMap<>();
        Map<String, String> collectorIds = new HashMap<>();

        List<Class> classes = getClasses("nl.kats.dabo.expansions");

        int assertionsFailed = 0;
        int cardsFound = 0;

        for (Class clazz : classes) {
            CardCatalog.CARDS = new CardCatalog();

            try {
                if (CardBuilder.class.isAssignableFrom(clazz) && !Modifier.isAbstract(clazz.getModifiers()) && !clazz.isInterface()) {
                    Object object = clazz.newInstance();

                    if (object instanceof CardBuilder) {
                        cardsFound++;

                        if (!Modifier.isFinal(clazz.getModifiers())) {
                            assertionsFailed++;
                            System.err.println(clazz.getCanonicalName() + ": NOK - Class is not declared final");
                        }

                        CardBuilder cardBuilder = (CardBuilder) object;
                        cardBuilder.build();

                        if (CardCatalog.CARDS.isEmpty()) {
                            assertionsFailed++;
                            System.err.println(clazz.getCanonicalName() + ": NOK - Build method does not add a card to the catalog");
                        } else if (CardCatalog.CARDS.size() > 1) {
                            assertionsFailed++;
                            System.err.println(clazz.getCanonicalName() + ": NOK - Build method adds more than one card to the catalog");
                        } else {
                            CardDefinition card = CardCatalog.CARDS.iterator().next();

                            String cardTitle = (card.getTitle() + ", " + card.getSubtitle()).toLowerCase();
                            String collectorId = card.getCollectorsId();

                            if (cardTitle == null || cardTitle.startsWith(", ")) {
                                assertionsFailed++;
                                System.err.println(clazz.getCanonicalName() + ": NOK - DefinedCard title must be set");
                            } else if (cardTitles.keySet().contains(cardTitle)) {
                                assertionsFailed++;
                                System.err.println(clazz.getCanonicalName() + ": NOK - DefinedCard title must be unique. Already set in " + cardTitles.get(cardTitle));
                            } else if (collectorId == null || "".equals(collectorId)) {
                                assertionsFailed++;
                                System.err.println(clazz.getCanonicalName() + ": NOK - Collector id must be set");
                            } else if (collectorIds.keySet().contains(collectorId)) {
                                assertionsFailed++;
                                System.err.println(clazz.getCanonicalName() + ": NOK - Collector id must be unique. Already set in " + collectorIds.get(collectorId));
                            } else {
                                cardTitles.put(cardTitle, clazz.getCanonicalName());
                                collectorIds.put(collectorId, clazz.getCanonicalName());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                assertionsFailed++;
                System.err.println(clazz.getCanonicalName() + ": NOK - Exception caught in build() method: ");
                e.printStackTrace();
            }
        }

        if (cardsFound == 0) {
            Assert.fail("No card definitions found");
        } else if (assertionsFailed > 0) {
            Assert.fail("NOK - " + assertionsFailed + " out of " + cardsFound + " card definitions are not okay. See " +
                    "problem details above.");
        } else {
            System.err.println("OK - All " + cardsFound + " card definitions are okay.");
        }
    }

    /**
     * Scans all classes accessible from the context class loader, which belong to the given package and subpackages.
     */
    private List<Class> getClasses(String packageName) throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;

        String path = packageName.replace('.', '/');
        Enumeration resources = classLoader.getResources(path);

        List<File> dirs = new ArrayList<>();
        while (resources.hasMoreElements()) {
            URL resource = (URL) resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }

        List<Class> classes = new ArrayList();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }

        return classes;
    }

    /**
     * Recursive method used to find all classes in a given directory and subdirs.
     */
    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }

}
