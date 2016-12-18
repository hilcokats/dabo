package nl.kats.dabo.dsl;

import java.util.Collection;
import java.util.Optional;

import nl.kats.dabo.dsl.cards.Card;
import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.context.Combat;
import nl.kats.dabo.dsl.context.Engagement;
import nl.kats.dabo.dsl.enums.SelectionMethod;

public interface ActionContext {

    /**
     * From the perspective of the CardBuilder, this is the card you are
     * currently defining.
     */
    Card self();

    /**
     * From the perspective of the CardBuilder, this is the card you are
     * currently defining.
     */
    default <T extends Card> T self(Class<T> t) {
        return t.cast(trigger());
    }

    /**
     * Returns the card that triggered the current Effect.
     */
    Card trigger();

    /**
     * Returns the player that commands the card that triggered the current
     * action.
     */
    You you();

    /**
     * Returns the property of the player referred to as you.
     */
    Property your();

    /**
     * Returns the opponent of the player that commands the card that triggered
     * the current action.
     */
    Opponent opponent();

    /**
     * Returns the property of the player referred to as your opponent.
     */
    Property opponents();

    /**
     * Returns true if there is ongoing combat, false otherwise.
     */
    boolean inCombat();

    /**
     * Returns true if there is ongoing engagement, false otherwise.
     */
    boolean inEngagement();

    /**
     * Returns the mission that was just completed. Null, if no such mission
     * exists.
     */
    Optional<MissionCard> completedMission();

    /**
     * Discards a certain amount of cards from a certain set, using the given
     * selection method.
     */
    boolean discard(Collection<Card> from, int amount, SelectionMethod selection);

    /**
     * Returns the cards that were selected, either randomly or by one of the
     * players.
     */
    CardCollection<Card> selectedCards();

    /**
     * Discard the selected cards.
     */
    boolean discardSelection();

    /**
     * Returns all cards that are currently being removed from the game.
     */
    CardCollection<Card> getRemovingFromGame();

    boolean combatStarts();

    boolean engagementStarts();

    Engagement engagement();

    Combat combat();
}
