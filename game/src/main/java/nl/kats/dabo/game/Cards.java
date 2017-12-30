package nl.kats.dabo.game;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.table.CardSet;

public class Cards extends CardSet<DefinedCard> {

    public Cards(CardCollection<DefinedCard> cards) {
        addAll(cards);
    }

    public Cards() {
    }
}
