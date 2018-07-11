package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.CardDefinition;

import java.util.HashSet;
import java.util.stream.Collectors;

@SuppressWarnings({"serial", "rawtypes"})
public final class CardCatalog extends HashSet<CardDefinition> {

    public static CardCatalog CARDS = new CardCatalog();

    public CardDefinition get(String title) throws CardNotFoundException, NonUniqueCardNameException {
        var matchingCards = this.stream().filter(c -> c.getTitle().equals(title)).collect(Collectors.toSet());
        if (matchingCards.isEmpty()) {
            throw new CardNotFoundException();
        } else if (matchingCards.size() > 1) {
            throw new NonUniqueCardNameException();
        } else {
            return matchingCards.iterator().next();
        }
    }

    public CardDefinition get(String title, String subtitle) throws CardNotFoundException {
        return this.stream().filter(c -> c.getTitle().equals(title)).filter(c -> c
                .getSubtitle().equals(subtitle)).findFirst().orElseThrow(CardNotFoundException::new);
    }

    public CardDefinition getByCollectorsId(String collectorsId) throws CardNotFoundException {
        return this.stream().filter(c -> c.getCollectorsId().equals(collectorsId)).findFirst()
                .orElseThrow(CardNotFoundException::new);
    }

}
