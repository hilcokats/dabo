package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.context.EitherPlayer;
import nl.kats.dabo.dsl.enums.Keyword;
import nl.kats.dabo.dsl.enums.Status;

public interface DefinedCard {

    EitherPlayer owner();

    EitherPlayer commander();

    boolean hasKeyword(Keyword keyword);

    boolean hasAnyKeyword(Keyword[] keywords);

    boolean hasAllKeywords(Keyword[] keywords);

    boolean hasStatus(Status status);

    boolean hasAnyStatus(Status[] statuses);

    String getName();

    String getSubtitle();

    boolean stop();

    boolean unstop();

    boolean discard();

    boolean removeFromTheGame();

}
