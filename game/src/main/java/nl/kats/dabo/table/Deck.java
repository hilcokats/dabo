package nl.kats.dabo.table;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.DefinedCard;

import java.util.Arrays;

public class Deck extends CardList<DefinedCard> {

    public Deck(CardCollection<DefinedCard> deck) {
        addAll(deck);
        removeAll(missions());
        removeAll(dilemmas());
    }

    public void placeBeneath(DefinedCard... card) {
        addAll(Arrays.asList(card));
    }

    public void placeOnTop(DefinedCard... card) {
        addAll(0, Arrays.asList(card));
    }

}
