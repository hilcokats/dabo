package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.enums.Affiliation;

public interface AffiliatedCard extends DefinedCard {

    boolean is(Affiliation affiliation);

    boolean at(MissionCard mission);

    boolean inRegion(String region);

}
