package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.CardDefinition;
import nl.kats.dabo.dsl.cards.CardType;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings({"serial", "rawtypes"})
public class CardCatalog extends HashSet<CardDefinition> {

	public static CardCatalog CARDS = new CardCatalog();

    public CardType get(String title) throws CardNotFoundException, NonUniqueCardNameException {
        Set<CardDefinition> matchingCards = this.stream().filter(c -> c.getTitle().equals(title)).collect(Collectors.toSet());
        if (matchingCards.isEmpty()) {
            throw new CardNotFoundException();
        } else if (matchingCards.size() > 1) {
            throw new NonUniqueCardNameException();
        } else {
            return matchingCards.iterator().next();
        }
    }

    public CardType get(String title, String subtitle) throws CardNotFoundException {
        Optional<CardDefinition> matchingCard = this.stream().filter(c -> c.getTitle().equals(title)).filter(c -> c.getSubtitle().equals(subtitle)).findFirst();
        if (matchingCard.isPresent()) {
            return matchingCard.get();
        } else {
            throw new CardNotFoundException();
        }
    }

}
