package nl.kats.dabo.dsl;

import java.util.List;
import java.util.Optional;

import nl.kats.dabo.dsl.cards.Card;
import nl.kats.dabo.dsl.cards.equipment.EquipmentCard;
import nl.kats.dabo.dsl.cards.event.EventCard;
import nl.kats.dabo.dsl.cards.interrupt.InterruptCard;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;
import nl.kats.dabo.dsl.cards.ship.ShipCard;
import nl.kats.dabo.dsl.enums.Affiliation;
import nl.kats.dabo.dsl.enums.Keyword;
import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.dsl.enums.Status;

public interface CardCollection<T extends Card> extends List<T> {

    boolean contains(String cardName);

    Optional<Card> top();

    Optional<Card> bottom();

    CardCollection<PersonnelCard> personnel();

    CardCollection<ShipCard> ships();

    CardCollection<EquipmentCard> equipment();

    CardCollection<InterruptCard> interrupts();

    CardCollection<EventCard> events();

    CardCollection<T> with(Affiliation affiliation);

    CardCollection<T> withAny(Affiliation... affiliation);

    CardCollection<T> withAll(Affiliation... affiliation);

    CardCollection<T> with(Keyword keyword);

    CardCollection<T> withAny(Keyword... keyword);

    CardCollection<T> withAll(Keyword... keyword);

    CardCollection<PersonnelCard> with(Skill skill);

    CardCollection<PersonnelCard> withAny(Skill... skill);

    CardCollection<PersonnelCard> withAll(Skill... skill);

    CardCollection<T> with(Status status);

    CardCollection<T> withAny(Status... status);

    CardCollection<T> withAll(Status... status);

    boolean stop();

    boolean unstop();

    boolean discard();

    boolean removeFromTheGame();

    boolean shuffleAndReplace();
}