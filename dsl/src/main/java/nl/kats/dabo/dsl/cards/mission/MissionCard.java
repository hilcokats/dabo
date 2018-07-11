package nl.kats.dabo.dsl.cards.mission;

import nl.kats.dabo.dsl.cards.AffiliatedCard;
import nl.kats.dabo.dsl.enums.Region;

public interface MissionCard extends AffiliatedCard {

    boolean isHeadquarters();

    Region getRegion();
}
