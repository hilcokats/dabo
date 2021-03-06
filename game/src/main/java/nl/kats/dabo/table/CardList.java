package nl.kats.dabo.table;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.AffiliatedCard;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;


public class CardList<T extends DefinedCard> extends ArrayList<T> implements CardCollection<T> {

    private static final long serialVersionUID = 5174088114324939310L;

    private CardCollection<T> selectedCards = new CardList<>();

    @Override
    public Optional<DefinedCard> top() {
        return Optional.ofNullable(get(0));
    }

    @Override
    public Optional<DefinedCard> bottom() {
        return Optional.ofNullable(get(size() - 1));
    }

    @Override
    public CardCollection<PersonnelCard> personnel() {
        CardCollection<PersonnelCard> filteredCollection = new CardList<>();
        this.stream().filter(card -> card instanceof PersonnelCard).forEach(card -> filteredCollection.add((PersonnelCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<ShipCard> ships() {
        CardCollection<ShipCard> filteredCollection = new CardList<>();
        this.stream().filter(card -> card instanceof ShipCard).forEach(card -> filteredCollection.add((ShipCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<EquipmentCard> equipment() {
        CardCollection<EquipmentCard> filteredCollection = new CardList<>();
        this.stream().filter(card -> card instanceof EquipmentCard).forEach(card -> filteredCollection.add((EquipmentCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<InterruptCard> interrupts() {
        CardCollection<InterruptCard> filteredCollection = new CardList<>();
        this.stream().filter(card -> card instanceof InterruptCard).forEach(card -> filteredCollection.add((InterruptCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<EventCard> events() {
        CardCollection<EventCard> filteredCollection = new CardList<>();
        this.stream().filter(card -> card instanceof EventCard).forEach(card -> filteredCollection.add((EventCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<MissionCard> missions() {
        CardCollection<MissionCard> filteredCollection = new CardList<>();
        this.stream().filter(card -> card instanceof MissionCard).forEach(card -> filteredCollection.add((MissionCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<DilemmaCard> dilemmas() {
        CardCollection<DilemmaCard> filteredCollection = new CardList<>();
        this.stream().filter(card -> card instanceof DilemmaCard).forEach(card -> filteredCollection.add((DilemmaCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<T> with(Affiliation affiliation) {
        CardCollection<T> filteredCollection = new CardList<>();
        this.stream().filter(card -> card instanceof AffiliatedCard && ((AffiliatedCard)card).is(affiliation)).forEach
                (((CardList<T>)filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<T> with(Keyword keyword) {
        CardCollection<T> filteredCollection = new CardList<>();
        this.stream().filter(card -> card.hasKeyword(keyword)).forEach(((CardList<T>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<T> withAny(Keyword... keywords) {
        CardCollection<T> filteredCollection = new CardList<>();
        this.stream().filter(card -> card.hasAnyKeyword(keywords)).forEach(((CardList<T>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<T> withAll(Keyword... keywords) {
        CardCollection<T> filteredCollection = new CardList<>();
        this.stream().filter(card -> card.hasAllKeywords(keywords)).forEach(((CardList<T>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<PersonnelCard> with(Skill skill) {
        CardCollection<PersonnelCard> filteredCollection = new CardList<>();
        this.personnel().stream().filter(personnel -> personnel.hasSkill(skill)).forEach(((CardList<PersonnelCard>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<PersonnelCard> withAny(Skill... skills) {
        CardCollection<PersonnelCard> filteredCollection = new CardList<>();
        this.personnel().stream().filter(personnel -> personnel.hasAnykill(skills)).forEach(((CardList<PersonnelCard>)
                filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<PersonnelCard> withAll(Skill... skills) {
        CardCollection<PersonnelCard> filteredCollection = new CardList<>();
        this.personnel().stream().filter(personnel -> personnel.hasAllkills(skills)).forEach(((CardList<PersonnelCard>)
                filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<T> with(Status status) {
        CardCollection<T> filteredCollection = new CardList<>();
        this.stream().filter(card -> card.hasStatus(status)).forEach(((CardList<T>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<T> withAny(Status... statuses) {
        CardCollection<T> filteredCollection = new CardList<>();
        this.stream().filter(card -> card.hasAnyStatus(statuses)).forEach(((CardList<T>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public boolean stop() {
        boolean hasActive = this.stream().filter(card -> card.hasStatus(Status.ACTIVE)).count() > 0;
        this.forEach(DefinedCard::stop);
        return hasActive;
    }

    @Override
    public boolean unstop() {
        boolean hasStopped = this.stream().filter(card -> card.hasStatus(Status.STOPPED)).count() > 0;
        this.forEach(DefinedCard::stop);
        return hasStopped;
    }

    @Override
    public boolean discard() {
        this.forEach(DefinedCard::discard);
        return this.isEmpty();
    }

    @Override
    public boolean removeFromTheGame() {
        this.forEach(DefinedCard::removeFromTheGame);
        return this.isEmpty();
    }

    @Override
    public boolean shuffleAndReplace() {
        Collections.shuffle(this);
        return true;
    }

    @Override
    public CardCollection<T> selectedCards() {
        return selectedCards;
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Optional) {
            var optional = (Optional) object;
            return optional.isPresent() && this.stream().anyMatch(card -> optional.get().equals(card));
        } else {
            return super.contains(object);
        }
    }
}
