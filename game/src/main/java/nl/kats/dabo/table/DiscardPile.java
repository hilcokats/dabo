package nl.kats.dabo.table;

import nl.kats.dabo.dsl.cards.DefinedCard;

import java.util.Arrays;

public class DiscardPile extends CardList<DefinedCard> {

    public void placeBeneath(DefinedCard... card) {
        addAll(Arrays.asList(card));
    }

    public void placeOnTop(DefinedCard... card) {
        addAll(0, Arrays.asList(card));
    }

}
