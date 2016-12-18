package nl.kats.dabo.dsl;

import java.util.List;

import nl.kats.dabo.dsl.cards.Card;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.equipment.EquipmentCard;
import nl.kats.dabo.dsl.cards.event.EventCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;

public interface Property {

    /**
     * Returns the deck of this player in the order that cards would normally be
     * drawn from it. That is, for a non-empty deck deck().get(0) returns the
     * top card.
     *
     * @return CardCollection
     */
    CardCollection<Card> deck();

    /**
     * Returns the hand of this player in the order that the cards were placed
     * in hand (drawn or taken back to hand).
     *
     * @return CardCollection<Card>
     */
    CardCollection<Card> hand();

    /**
     * Returns the discard pile of this player in the order that the cards were
     * discarded. That is, for a non-empty discard pile discardPile().get(0)
     * returns the bottom card.
     *
     * @return CardCollection<Card>
     */
    CardCollection<Card> discardPile();

    /**
     * Returns the dilemma pile of this player in the order that cards would
     * normally be drawn from it. That is, for a non-empty deck deck().get(0)
     * returns the top card.
     *
     * @return CardCollection<Dilemma>
     */
    CardCollection<DilemmaCard> dilemmaPile();

    /**
     * Returns the dilemmas that this player has just drawn, in no particular
     * order.
     *
     * @return CardCollection<Dilemma>
     */
    CardCollection<DilemmaCard> drawnDilemmas();

    /**
     * Returns the cards played in this player's core in the order that they
     * were played there.
     *
     * @return CardCollection<EventCard>
     */
    CardCollection<EventCard> core();

    /**
     * Returns the missions owned by this player alphabetically ordered per
     * quadrant, from alpha to delta quadrant.
     *
     * @return CardCollection<MissionCard>
     */
    CardCollection<MissionCard> missions();

    /**
     * Returns the missions commanded by this player were completed.
     *
     * @return CardCollection<MissionCard>
     */
    List<DilemmaCard> completedMissions();

    /**
     * Returns the missions owned by this player alphabetically ordered per
     * quadrant, from alpha to delta quadrant.
     *
     * @return CardCollection<MissionCard>
     */
    CardCollection<MissionCard> headquarters();

    /**
     * Returns the cards owned by this player that were removed from game, in
     * no particular order.
     *
     * @return CardCollection<Card>
     */
    CardCollection<Card> removedFromGame();

    /**
     * Returns the cards that this player currently commands, in
     * no particular order.
     *
     * @return CardCollection<Card>
     */
    CardCollection<Card> commanded();

    /**
     * Returns the cards that this player currently owns, in
     * no particular order.
     *
     * @return CardCollection<Card>
     */
    CardCollection<Card> owned();

    /**
     * Returns all cards owned by this player that currently attempt a mission
     * or face a dilemma, in no particular order. This includes personnel and
     * equipment as well as any cards that are played on these.
     *
     * @return CardCollection<Card>
     */
    CardCollection<Card> awayTeam();

    /**
     * Returns all ships owned by this player that currently attempt a mission
     * or face a dilemma, in no particular order. This includes personnel and
     * equipment aboard those ships as well as any cards that are played on any
     * of these.
     *
     * @return CardCollection<Card>
     */
    CardCollection<Card> armada();

    /**
     * Returns all equipment owned by this player that is currently used in a mission attempt
     * or dilemma encounter, in no particular order.
     *
     * @return CardCollection<Card>
     */
    CardCollection<EquipmentCard> equipment();
}
