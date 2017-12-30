package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaDefinition;
import nl.kats.dabo.game.Player;

public class Dilemma extends Card implements DilemmaCard {
    private final DilemmaDefinition definition;

    public Dilemma(DilemmaDefinition definition, Player player) {
        super(definition, player);
        this.definition = definition;
    }

}
