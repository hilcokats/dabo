package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.CardPool;
import nl.kats.dabo.dsl.Player;
import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.enums.Affiliation;
import nl.kats.dabo.dsl.enums.Keyword;
import nl.kats.dabo.dsl.enums.Status;

public interface Card extends CardPool {

    Player owner();

    Player commander();

    boolean is(Affiliation federation);

    boolean at(MissionCard mission);

    boolean inRegion(String region);

    boolean hasKeyword(Keyword keyword);

    boolean hasStatus(Status status);

    String getName();

    String getSubtitle();

}
