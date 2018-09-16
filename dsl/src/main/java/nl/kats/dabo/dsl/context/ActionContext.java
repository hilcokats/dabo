package nl.kats.dabo.dsl.context;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.Cards;
import nl.kats.dabo.dsl.cards.DefinedCard;

public interface ActionContext {

    /**
     * From the perspective of the CardBuilder, this is the card you are
     * currently defining.
     */
    DefinedCard self();

    /**
     * From the perspective of the CardBuilder, this is the card you are
     * currently defining.
     */
    default <T extends DefinedCard> T self(Class<T> t) {
        return t.cast(trigger());
    }

    /**
     * Returns the card that triggered the current Effect.
     */
    DefinedCard trigger();

    /**
     * Returns the player that commands the card that triggered the current
     * action.
     */
    You you();

    /**
     * Returns the property of the player referred to as you.
     */
    Cards your();

    /**
     * Returns the opponent of the player that commands the card that triggered
     * the current action.
     */
    Opponent opponent();

    /**
     * Returns the property of the player referred to as your opponent.
     */
    Cards opponents();

    /**
     * Returns true if there is ongoing combat, false otherwise.
     */
    boolean inCombat();

    /**
     * Returns true if there is ongoing engagement, false otherwise.
     */
    boolean inEngagement();

    /**
     * Returns the cards that were selected, either randomly or by one of the
     * players.
     */
    CardCollection<DefinedCard> selectedCards();

    boolean facingDilemma();

    boolean combatStarts();

    boolean engagementStarts();

    Engagement engagement();

    Combat combat();

}
