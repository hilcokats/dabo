package nl.kats.dabo.play;

import java.util.ArrayList;
import java.util.Optional;

import nl.kats.dabo.dsl.CardCollection;
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


public class DefaultCardCollection<T extends Card> extends ArrayList<T> implements CardCollection<T> {

    private static final long serialVersionUID = 5174088114324939310L;

    @Override
    public Optional<Card> top() {
        if (size() > 0) {
            return Optional.of(get(0));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Card> bottom() {
        if (size() > 0) {
            return Optional.of(get(size() - 1));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public CardCollection<PersonnelCard> personnel() {
        CardCollection<PersonnelCard> filteredCollection = new DefaultCardCollection<>();
        this.stream().filter(card -> card instanceof PersonnelCard).forEach(card -> filteredCollection.add((PersonnelCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<ShipCard> ships() {
        CardCollection<ShipCard> filteredCollection = new DefaultCardCollection<>();
        this.stream().filter(card -> card instanceof ShipCard).forEach(card -> filteredCollection.add((ShipCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<EquipmentCard> equipment() {
        CardCollection<EquipmentCard> filteredCollection = new DefaultCardCollection<>();
        this.stream().filter(card -> card instanceof EquipmentCard).forEach(card -> filteredCollection.add((EquipmentCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<InterruptCard> interrupts() {
        CardCollection<InterruptCard> filteredCollection = new DefaultCardCollection<>();
        this.stream().filter(card -> card instanceof InterruptCard).forEach(card -> filteredCollection.add((InterruptCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<EventCard> events() {
        CardCollection<EventCard> filteredCollection = new DefaultCardCollection<>();
        this.stream().filter(card -> card instanceof EventCard).forEach(card -> filteredCollection.add((EventCard) card));
        return filteredCollection;
    }

    @Override
    public CardCollection<T> with(Affiliation affiliation) {
        CardCollection<T> filteredCollection = new DefaultCardCollection<>();
        this.stream().filter(card -> card.is(affiliation)).forEach(((DefaultCardCollection<T>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<T> withAny(Affiliation... affiliation) {
        return null;
    }

    @Override
    public CardCollection<T> withAll(Affiliation... affiliation) {
        return null;
    }

    @Override
    public CardCollection<T> with(Keyword keyword) {
        CardCollection<T> filteredCollection = new DefaultCardCollection<>();
        this.stream().filter(card -> card.hasKeyword(keyword)).forEach(((DefaultCardCollection<T>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<T> withAny(Keyword... keyword) {
        return null;
    }

    @Override
    public CardCollection<T> withAll(Keyword... keyword) {
        return null;
    }

    @Override
    public CardCollection<PersonnelCard> with(Skill skill) {
        CardCollection<PersonnelCard> filteredCollection = new DefaultCardCollection<>();
        this.personnel().stream().filter(personnel -> personnel.hasSkill(skill)).forEach(((DefaultCardCollection<PersonnelCard>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<PersonnelCard> withAny(Skill... skill) {
        return null;
    }

    @Override
    public CardCollection<PersonnelCard> withAll(Skill... skill) {
        return null;
    }

    @Override
    public CardCollection<T> with(Status status) {
        CardCollection<T> filteredCollection = new DefaultCardCollection<>();
        this.stream().filter(card -> card.hasStatus(status)).forEach(((DefaultCardCollection<T>) filteredCollection)::add);
        return filteredCollection;
    }

    @Override
    public CardCollection<T> withAny(Status... status) {
        return null;
    }

    @Override
    public CardCollection<T> withAll(Status... status) {
        return null;
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public boolean unstop() {
        return false;
    }

    @Override
    public boolean discard() {
        return false;
    }

    @Override
    public boolean removeFromTheGame() {
        return false;
    }

    @Override
    public boolean shuffleAndReplace() {
        return false;
    }

    @Override
    public boolean contains(String cardName) {
        return this.stream().anyMatch(card -> card.getName().equals(cardName));
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Optional && ((Optional)object).isPresent()) {
            return this.stream().anyMatch(card -> ((Optional)object).get().equals(card));
        } else {
            return super.contains(object);
        }
    }
}
