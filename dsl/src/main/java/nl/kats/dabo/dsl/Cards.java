package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.equipment.EquipmentCard;
import nl.kats.dabo.dsl.cards.event.EventCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;
import nl.kats.dabo.dsl.cards.ship.ShipCard;

public interface Cards {

    /**
     * Returns the deck of this player in the order that cards would normally be
     * drawn from it. That is, for a non-empty deck deck().get(0) returns the
     * top card.
     *
     * @return CardCollection
     */
    CardCollection<DefinedCard> deck();

    /**
     * Returns the hand of this player in the order that the cards were placed
     * in hand (drawn or taken back to hand).
     *
     * @return CardCollection<DefinedCard>
     */
    CardCollection<DefinedCard> hand();

    /**
     * Returns the discard pile of this player in the order that the cards were
     * discarded. That is, for a non-empty discard pile discardPile().get(0)
     * returns the bottom card.
     *
     * @return CardCollection<DefinedCard>
     */
    CardCollection<DefinedCard> discardPile();

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
    CardCollection<MissionCard> completedMissions();

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
     * @return CardCollection<DefinedCard>
     */
    CardCollection<DefinedCard> removedFromGame();

    /**
     * Returns the cards that this player currently commands, in
     * no particular order.
     *
     * @return CardCollection<DefinedCard>
     */
    CardCollection<DefinedCard> commanded();

    /**
     * Returns the cards that this player currently owns, in
     * no particular order.
     *
     * @return CardCollection<DefinedCard>
     */
    CardCollection<DefinedCard> owned();

    /**
     * Returns all cards owned by this player that currently attempt a mission
     * face a dilemma, or take part in combat, in no particular order. This includes
     * personnel and equipment as well as any cards that are played on these.
     *
     * @return CardCollection<DefinedCard>
     */
    CardCollection<PersonnelCard> awayTeam();

    /**
     * Returns all ships owned by this player that currently attempt a mission
     * face a dilemma, or take part in a battle, in no particular order. This
     * includes personnel and equipment aboard those ships as well as any cards
     * that are played on any of these.
     *
     * @return CardCollection<DefinedCard>
     */
    CardCollection<ShipCard> armada();

    /**
     * Returns all equipment owned by this player that is currently used in a mission attempt
     * or dilemma encounter, in no particular order.
     *
     * @return CardCollection<DefinedCard>
     */
    CardCollection<EquipmentCard> equipment();
}
