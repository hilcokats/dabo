package nl.kats.dabo.dsl.context;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;

import java.util.Optional;

public interface AnyPlayer {

    boolean scorePoints(int i);

    Optional<MissionCard> getAttemptedMission();

    Optional<MissionCard> getCompletedMission();

    Optional<DilemmaCard> getFacedDilemma();

    Optional<DefinedCard> getDrawnCard();

    Optional<DefinedCard> getPlayedCard();

    Optional<DefinedCard> getDiscardedCard();

    Optional<DefinedCard> getRemovedCard();

    CardCollection<DefinedCard> getCommandedCards();

    CardCollection<DefinedCard> getOwnedCards();

}
