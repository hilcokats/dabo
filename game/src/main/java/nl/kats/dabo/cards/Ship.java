package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.StaffingRequirementList;
import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.cards.ship.ShipCard;
import nl.kats.dabo.dsl.cards.ship.ShipDefinition;
import nl.kats.dabo.dsl.enums.Affiliation;
import nl.kats.dabo.dsl.enums.Region;
import nl.kats.dabo.game.Player;

public class Ship extends Card<Ship> implements ShipCard {
    private final ShipDefinition definition;

    private int rangeAdjustment = 0;
    private int weaponsAdjustment = 0;
    private int shieldsAdjustment = 0;

    public Ship(ShipDefinition definition, Player player) {
        super(definition, player);
        this.definition = definition;
    }

    @Override
    public boolean staffed() {
        var icons = (StaffingRequirementList<?>) definition.staffingRequirements();
        //TODO: implement
        //personnel().stream().filter(p -> p.getIcons());
        return false;
    }

    @Override
    public void adjustRange(int range) {
        rangeAdjustment += range;
    }

    @Override
    public void adjustWeapons(int weapons) {
        weaponsAdjustment += weapons;
    }

    @Override
    public void adjustShields(int shields) {
        shieldsAdjustment += shields;
    }

    @Override
    public boolean is(Affiliation affiliation) {
        return definition.getAffiliation().equals(affiliation);
    }

    @Override
    public boolean at(MissionCard mission) {
        return location != null && location.equals(mission);
    }

    @Override
    public boolean inRegion(Region region) {
        return location != null && location instanceof Mission && ((Mission)location).getRegion() != null &&
                ((Mission)location).getRegion().equals(region);
    }
}
