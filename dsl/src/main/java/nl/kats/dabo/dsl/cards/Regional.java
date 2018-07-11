package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.cards.mission.MissionDefinition;
import nl.kats.dabo.dsl.cards.mission.MissionType;
import nl.kats.dabo.dsl.enums.Region;

public class Regional {

    private final MissionDefinition mission;

    public Regional(MissionDefinition mission) {
        this.mission = mission;
    }

    public MissionType badlands() {
        mission.region = Region.BADLANDS;
        return mission;
    }

    public MissionType bajorSystem() {
        mission.region = Region.BAJOR_SYSTEM;
        return mission;
    }

    public MissionType borderland() {
        mission.region = Region.BORDERLAND;
        return mission;
    }

    public MissionType cardassiaSystem() {
        mission.region = Region.CARDASSIA_SYSTEM;
        return mission;
    }

    public MissionType delphicExpanse() {
        mission.region = Region.DELPHIC_EXPANSE;
        return mission;
    }

    public MissionType demilitarizedZone() {
        mission.region = Region.DEMILITARIZED_ZONE;
        return mission;
    }

    public MissionType greatBarrier() {
        mission.region = Region.GREAT_BARRIER;
        return mission;
    }

    public MissionType ligosSystem() {
        mission.region = Region.LIGOS_SYSTEM;
        return mission;
    }

    public MissionType nekritExpanse() {
        mission.region = Region.NEKRIT_EXPANSE;
        return mission;
    }

    public MissionType neutralZone() {
        mission.region = Region.NEUTRAL_ZONE;
        return mission;
    }

    public MissionType omarionNebula() {
        mission.region = Region.OMARION_NEBULA;
        return mission;
    }

    public MissionType romulusSystem() {
        mission.region = Region.ROMULUS_SYSTEM;
        return mission;
    }

    public MissionType sector001() {
        mission.region = Region.SECTOR_001;
        return mission;
    }

    public MissionType stakoronSystem() {
        mission.region = Region.STAKORON_SYSTEM;
        return mission;
    }

    public MissionType theVoid() {
        mission.region = Region.THE_VOID;
        return mission;
    }

}