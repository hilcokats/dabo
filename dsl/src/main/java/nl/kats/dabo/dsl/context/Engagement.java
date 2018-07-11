package nl.kats.dabo.dsl.context;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.ship.ShipCard;

public interface Engagement {

    boolean join(CardCollection<ShipCard> cards);

}
