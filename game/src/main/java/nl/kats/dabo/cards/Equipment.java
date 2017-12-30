package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.equipment.EquipmentCard;
import nl.kats.dabo.dsl.cards.equipment.EquipmentDefinition;
import nl.kats.dabo.game.Player;

public class Equipment extends Card implements EquipmentCard {
    private final EquipmentDefinition definition;

    public Equipment(EquipmentDefinition definition, Player player) {
        super(definition, player);
        this.definition = definition;
    }
}
