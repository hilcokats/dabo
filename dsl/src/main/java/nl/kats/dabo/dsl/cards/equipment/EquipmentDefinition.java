package nl.kats.dabo.dsl.cards.equipment;

import nl.kats.dabo.dsl.cards.CardDefinition;

public class EquipmentDefinition extends CardDefinition<EquipmentType> implements EquipmentType {

    public EquipmentDefinition(String title) {
        super(title);
    }

    public EquipmentDefinition(String title, String subtitle) {
        super(title, subtitle);
    }

}
