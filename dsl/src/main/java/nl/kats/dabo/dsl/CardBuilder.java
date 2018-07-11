package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.Collectable;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaDefinition;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaType;
import nl.kats.dabo.dsl.cards.equipment.EquipmentDefinition;
import nl.kats.dabo.dsl.cards.equipment.EquipmentType;
import nl.kats.dabo.dsl.cards.event.EventDefinition;
import nl.kats.dabo.dsl.cards.event.EventType;
import nl.kats.dabo.dsl.cards.interrupt.InterruptDefinition;
import nl.kats.dabo.dsl.cards.interrupt.InterruptType;
import nl.kats.dabo.dsl.cards.mission.MissionDefinition;
import nl.kats.dabo.dsl.cards.mission.MissionType;
import nl.kats.dabo.dsl.cards.personnel.PersonnelDefinition;
import nl.kats.dabo.dsl.cards.personnel.PersonnelType;
import nl.kats.dabo.dsl.cards.ship.ShipDefinition;
import nl.kats.dabo.dsl.cards.ship.ShipType;

public abstract class CardBuilder extends CardBuilderSupport {

    public abstract void build();

    public Collectable<PersonnelType> personnel(String title) {
        var card = new PersonnelDefinition(title);
        CardCatalog.CARDS.add(card);
        return card;
    }

    protected Collectable<PersonnelType> personnel(String title, String subtitle) {
        var card = new PersonnelDefinition(title, subtitle);
        CardCatalog.CARDS.add(card);
        return card;
    }

    public Collectable<ShipType> ship(String title) {
        var card = new ShipDefinition(title);
        CardCatalog.CARDS.add(card);
        return card;
    }

    protected Collectable<ShipType> ship(String title, String subtitle) {
        var card = new ShipDefinition(title, subtitle);
        CardCatalog.CARDS.add(card);
        return card;
    }

    protected Collectable<EquipmentType> equipment(String title) {
        var card = new EquipmentDefinition(title);
        CardCatalog.CARDS.add(card);
        return card;
    }

    public Collectable<EquipmentType> equipment(String title, String subtitle) {
        var card = new EquipmentDefinition(title, subtitle);
        CardCatalog.CARDS.add(card);
        return card;
    }

    protected Collectable<EventType> event(String title) {
        var card = new EventDefinition(title);
        CardCatalog.CARDS.add(card);
        return card;
    }

    public Collectable<EventType> event(String title, String subtitle) {
        var card = new EventDefinition(title, subtitle);
        CardCatalog.CARDS.add(card);
        return card;
    }

    protected Collectable<InterruptType> interrupt(String title) {
        var card = new InterruptDefinition(title);
        CardCatalog.CARDS.add(card);
        return card;
    }

    public Collectable<InterruptType> interrupt(String title, String subtitle) {
        var card = new InterruptDefinition(title, subtitle);
        CardCatalog.CARDS.add(card);
        return card;
    }

    public Collectable<MissionType> mission(String title) {
        var card = new MissionDefinition(title);
        CardCatalog.CARDS.add(card);
        return card;
    }

    protected Collectable<MissionType> mission(String title, String subtitle) {
        var card = new MissionDefinition(title, subtitle);
        CardCatalog.CARDS.add(card);
        return card;
    }

    protected Collectable<DilemmaType> dilemma(String title) {
        var card = new DilemmaDefinition(title);
        CardCatalog.CARDS.add(card);
        return card;
    }

    public Collectable<DilemmaType> dilemma(String title, String subtitle) {
        var card = new DilemmaDefinition(title, subtitle);
        CardCatalog.CARDS.add(card);
        return card;
    }

}
