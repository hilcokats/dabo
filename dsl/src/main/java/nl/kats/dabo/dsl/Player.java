package nl.kats.dabo.dsl;

import java.util.Optional;

import nl.kats.dabo.dsl.cards.Card;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;

public interface Player {
	
	 boolean scorePoints(int i);

	 Optional<MissionCard> getAttemptedMission();
	
	 Optional<MissionCard> getCompletedMission();
	
	 Optional<DilemmaCard> getFacedDilemma();
	
	 Optional<Card> getDrawnCard();
	
	 Optional<Card> getPlayedCard();
		
	 Optional<Card> getDiscardedCard();
	
	 Optional<Card> getRemovedCard();
	
	 CardCollection<Card> getCommandedCards();
	
	 CardCollection<Card> getOwnedCards();
	
}
