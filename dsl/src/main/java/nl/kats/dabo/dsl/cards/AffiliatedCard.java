package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.enums.Affiliation;
import nl.kats.dabo.dsl.enums.Region;

public interface AffiliatedCard extends DefinedCard {

    boolean is(Affiliation affiliation);

    boolean at(MissionCard mission);

    boolean inRegion(Region region);

}
