package nl.kats.dabo.expansions;

import junit.framework.Assert;
import nl.kats.dabo.dsl.CardBuilder;
import nl.kats.dabo.dsl.CardCatalog;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CardTest {

    /**
     * Recursive method used to find all classes in a given directory and subdirs.
     */
    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }

        var files = directory.listFiles();
        for (var file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(
                        Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }

        return classes;
    }

    /**
     * Builds each CardBuilder class under nl.kats.dabo.expansions, and checks whether each of these classes adds
     * exactly one card to the CardCatalog. It also checks whether their title/subtitle and collectorsId are set and
     * unique, as well as that no exceptions occur during the card build process.
     */
    @Test public void testCardDefinitions() throws IOException, ClassNotFoundException {
        var cardTitles = new HashMap<String, String>();
        var collectorIds = new HashMap<String, String>();
        var classes = getClasses("nl.kats.dabo.expansions");
        var failedAssertions = 0;

        for (var clazz : classes) {
            CardCatalog.CARDS = new CardCatalog();

            try {
                if (CardBuilder.class.isAssignableFrom(clazz) && !Modifier.isAbstract(clazz.getModifiers()) &&
                    !clazz.isInterface()) {
                    var object = clazz.getDeclaredConstructor().newInstance();

                    if (object instanceof CardBuilder) {

                        var cardBuilder = (CardBuilder) object;
                        cardBuilder.build();

                        if (CardCatalog.CARDS.isEmpty()) {
                            failedAssertions++;
                            System.err.println(clazz.getCanonicalName() +
                                               ": NOK - Build method does not add a card to the catalog");
                        } else if (CardCatalog.CARDS.size() > 1) {
                            failedAssertions++;
                            System.err.println(clazz.getCanonicalName() +
                                               ": NOK - Build method adds more than one card to the catalog");
                        } else {
                            var card = CardCatalog.CARDS.iterator().next();
                            var cardTitle = (card.getTitle() + ", " + card.getSubtitle()).toLowerCase();
                            var collectorId = card.getCollectorsId();

                            if (cardTitle == null || cardTitle.startsWith(", ")) {
                                failedAssertions++;
                                System.err.println(clazz.getCanonicalName() + ": NOK - DefinedCard title must be set");
                            } else if (cardTitles.keySet().contains(cardTitle)) {
                                failedAssertions++;
                                System.err.println(clazz.getCanonicalName() +
                                                   ": NOK - DefinedCard title must be unique. Already set in " +
                                                   cardTitles.get(cardTitle));
                            } else if (collectorId == null || "".equals(collectorId)) {
                                failedAssertions++;
                                System.err.println(clazz.getCanonicalName() + ": NOK - Collector id must be set");
                            } else if (collectorIds.keySet().contains(collectorId)) {
                                failedAssertions++;
                                System.err.println(clazz.getCanonicalName() +
                                                   ": NOK - Collector id must be unique. Already set in " +
                                                   collectorIds.get(collectorId));
                            } else {
                                cardTitles.put(cardTitle, clazz.getCanonicalName());
                                collectorIds.put(collectorId, clazz.getCanonicalName());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                failedAssertions++;
                System.err.println(clazz.getCanonicalName() + ": NOK - Exception caught in build() method: ");
                e.printStackTrace();
            }
        }

        if (failedAssertions > 0) {
            Assert.fail(failedAssertions + " card definitions were NOT OKAY");
        } else {
            System.err.println("OK - All card definitions were okay");
        }
    }

    /**
     * Scans all classes accessible from the context class loader which belong to the given package and subpackages.
     */
    private List<Class> getClasses(String packageName) throws ClassNotFoundException, IOException {
        var classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;

        var path = packageName.replace('.', '/');
        var resources = classLoader.getResources(path);

        List<File> dirs = new ArrayList<>();
        while (resources.hasMoreElements()) {
            var resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }

        List<Class> classes = new ArrayList();
        for (var directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }

        return classes;
    }

}
