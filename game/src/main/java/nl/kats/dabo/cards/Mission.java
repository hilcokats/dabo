package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.cards.mission.MissionDefinition;
import nl.kats.dabo.dsl.enums.Affiliation;
import nl.kats.dabo.dsl.enums.Region;
import nl.kats.dabo.game.Player;

public class Mission extends Card implements MissionCard {
    private final MissionDefinition definition;

    public Mission(MissionDefinition definition, Player player) {
            super(definition, player);
            this.definition = definition;
        }

    @Override
    public boolean isHeadquarters() {
        return false;
    }

    @Override
    public Region getRegion() {
        return definition.getRegion();
    }

    @Override
    public boolean is(Affiliation affiliation) {
        return false;
    }

    @Override
    public boolean at(MissionCard mission) {
        return false;
    }

    @Override
    public boolean inRegion(Region region) {
        return false;
    }
}
