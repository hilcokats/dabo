package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.equipment.EquipmentCard;
import nl.kats.dabo.dsl.cards.event.EventCard;
import nl.kats.dabo.dsl.cards.interrupt.InterruptCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;
import nl.kats.dabo.dsl.cards.ship.ShipCard;
import nl.kats.dabo.dsl.enums.Affiliation;
import nl.kats.dabo.dsl.enums.Keyword;
import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.dsl.enums.Status;

import java.util.Collection;
import java.util.Optional;

public interface CardCollection<T extends DefinedCard> extends Collection<T> {

    Optional<DefinedCard> top();

    Optional<DefinedCard> bottom();

    CardCollection<PersonnelCard> personnel();

    CardCollection<ShipCard> ships();

    CardCollection<EquipmentCard> equipment();

    CardCollection<InterruptCard> interrupts();

    CardCollection<EventCard> events();

    CardCollection<MissionCard> missions();

    CardCollection<DilemmaCard> dilemmas();

    CardCollection<T> with(Affiliation affiliation);

    CardCollection<T> with(Keyword keyword);

    CardCollection<T> withAny(Keyword... keywords);

    CardCollection<T> withAll(Keyword... keywords);

    CardCollection<PersonnelCard> with(Skill skill);

    CardCollection<PersonnelCard> withAny(Skill... skills);

    CardCollection<PersonnelCard> withAll(Skill... skills);

    CardCollection<T> with(Status status);

    CardCollection<T> withAny(Status... statuses);

    boolean stop();

    boolean unstop();

    boolean discard();

    boolean removeFromTheGame();

    boolean shuffleAndReplace();

    CardCollection<T> selectedCards();

    default boolean contains(String cardName) {
        return this.stream().anyMatch(card -> card.getName().equals(cardName));
    }

}