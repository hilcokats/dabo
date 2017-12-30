package nl.kats.dabo.game;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.ship.ShipCard;
import nl.kats.dabo.dsl.context.Engagement;

public class EngagementImpl implements Engagement {

    @Override
    public boolean join(CardCollection<ShipCard> cards) {
        return false;
    }

}
