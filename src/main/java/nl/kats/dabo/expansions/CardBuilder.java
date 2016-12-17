package nl.kats.dabo.expansions;

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
import nl.kats.dabo.play.CardCatalog;

public abstract class CardBuilder extends CardBuilderSupport {

    public static CardCatalog catalog;

    public abstract void build();

    public Collectable<PersonnelType> personnel(String title) {
        PersonnelDefinition card = new PersonnelDefinition(title);
        catalog.add(card);
        return card;
    }

    protected Collectable<PersonnelType> personnel(String title, String subtitle) {
        PersonnelDefinition card = new PersonnelDefinition(title, subtitle);
        catalog.add(card);
        return card;
    }

    public Collectable<ShipType> ship(String title) {
        ShipDefinition card = new ShipDefinition(title);
        catalog.add(card);
        return card;
    }

    protected Collectable<ShipType> ship(String title, String subtitle) {
        ShipDefinition card = new ShipDefinition(title, subtitle);
        catalog.add(card);
        return card;
    }

    protected Collectable<EquipmentType> equipment(String title) {
        EquipmentDefinition card = new EquipmentDefinition(title);
        catalog.add(card);
        return card;
    }

    public Collectable<EquipmentType> equipment(String title, String subtitle) {
        EquipmentDefinition card = new EquipmentDefinition(title, subtitle);
        catalog.add(card);
        return card;
    }

    protected Collectable<EventType> event(String title) {
        EventDefinition card = new EventDefinition(title);
        catalog.add(card);
        return card;
    }

    public Collectable<EventType> event(String title, String subtitle) {
        EventDefinition card = new EventDefinition(title, subtitle);
        catalog.add(card);
        return card;
    }

    protected Collectable<InterruptType> interrupt(String title) {
        InterruptDefinition card = new InterruptDefinition(title);
        catalog.add(card);
        return card;
    }

    public Collectable<InterruptType> interrupt(String title, String subtitle) {
        InterruptDefinition card = new InterruptDefinition(title, subtitle);
        catalog.add(card);
        return card;
    }

    public Collectable<MissionType> mission(String title) {
        MissionDefinition card = new MissionDefinition(title);
        catalog.add(card);
        return card;
    }

    protected Collectable<MissionType> mission(String title, String subtitle) {
        MissionDefinition card = new MissionDefinition(title, subtitle);
        catalog.add(card);
        return card;
    }

    protected Collectable<DilemmaType> dilemma(String title) {
        DilemmaDefinition card = new DilemmaDefinition(title);
        catalog.add(card);
        return card;
    }

    public Collectable<DilemmaType> dilemma(String title, String subtitle) {
        DilemmaDefinition card = new DilemmaDefinition(title, subtitle);
        catalog.add(card);
        return card;
    }

}
