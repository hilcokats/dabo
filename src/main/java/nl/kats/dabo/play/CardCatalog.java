package nl.kats.dabo.play;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import nl.kats.dabo.dsl.cards.CardDefinition;
import nl.kats.dabo.dsl.cards.CardType;

@SuppressWarnings({ "serial", "rawtypes" })
public abstract class CardCatalog extends HashSet<CardDefinition> {

	public CardType get(String title) throws CardNotFoundException, NonUniqueCardNameException {
		Set<CardDefinition> matchingCards = this.stream().filter(c -> c.getTitle().equals(title)).collect(Collectors.toSet());
		if (matchingCards.isEmpty()) {
			throw new CardNotFoundException();
		} else if (matchingCards.size()>1) {
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
