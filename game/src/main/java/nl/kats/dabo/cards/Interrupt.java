package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.interrupt.InterruptCard;
import nl.kats.dabo.dsl.cards.interrupt.InterruptDefinition;
import nl.kats.dabo.game.Player;

public class Interrupt extends Card implements InterruptCard {
    private final InterruptDefinition definition;

    public Interrupt(InterruptDefinition definition, Player player) {
            super(definition, player);
            this.definition = definition;
        }
}
