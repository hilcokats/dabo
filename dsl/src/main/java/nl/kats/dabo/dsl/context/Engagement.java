package nl.kats.dabo.dsl.context;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.ship.ShipCard;

/**
 * Created by Hilco on 15-12-16.
 */
public interface Engagement {

    boolean join(CardCollection<ShipCard> cards);

}
