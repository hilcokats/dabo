package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.CardDefinition;
import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaDefinition;
import nl.kats.dabo.dsl.cards.equipment.EquipmentDefinition;
import nl.kats.dabo.dsl.cards.event.EventDefinition;
import nl.kats.dabo.dsl.cards.interrupt.InterruptDefinition;
import nl.kats.dabo.dsl.cards.mission.MissionDefinition;
import nl.kats.dabo.dsl.cards.personnel.PersonnelDefinition;
import nl.kats.dabo.dsl.cards.ship.ShipDefinition;
import nl.kats.dabo.game.Player;

public class CardFactory {

    public static DefinedCard getInstance(CardDefinition cardDefinition, Player player) {
        if (cardDefinition instanceof DilemmaDefinition) {
            return new Dilemma((DilemmaDefinition) cardDefinition, player);
        } else if (cardDefinition instanceof EquipmentDefinition) {
            return new Equipment((EquipmentDefinition) cardDefinition, player);
        } else if (cardDefinition instanceof EventDefinition) {
            return new Event((EventDefinition) cardDefinition, player);
        } else if (cardDefinition instanceof InterruptDefinition) {
            return new Interrupt((InterruptDefinition) cardDefinition, player);
        } else if (cardDefinition instanceof MissionDefinition) {
            return new Mission((MissionDefinition) cardDefinition, player);
        } else if (cardDefinition instanceof PersonnelDefinition) {
            return new Personnel((PersonnelDefinition) cardDefinition, player);
        } else if (cardDefinition instanceof ShipDefinition) {
            return new Ship((ShipDefinition) cardDefinition, player);
        } else {
            throw new IllegalArgumentException("Unknown card definition type");
        }
    }
}
