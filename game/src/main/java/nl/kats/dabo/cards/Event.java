package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.event.EventCard;
import nl.kats.dabo.dsl.cards.event.EventDefinition;
import nl.kats.dabo.game.Player;

public class Event extends Card implements EventCard {
    private final EventDefinition definition;

    public Event(EventDefinition definition, Player player) {
        super(definition, player);
        this.definition = definition;
    }
}
