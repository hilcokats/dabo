package nl.kats.dabo.dsl;

import java.util.Optional;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.Opponent;
import nl.kats.dabo.dsl.You;
import nl.kats.dabo.dsl.cards.Card;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;

public class DefaultPlayer implements You, Opponent {

	private Integer points;
	
	private CardCollection<Card> owned;
	private CardCollection<Card> commanded;
	
	private MissionCard attemptedMission;
	private MissionCard completedMission;
	private DilemmaCard facedDilemma;
	private Card drawnCard;
	private Card playedCard;
	private Card discardedCard;
	private Card removedCard;

	@Override
	public boolean scorePoints(int points) {
		this.points += points;
		return true;
	}
	
	@Override
	public Optional<MissionCard> getAttemptedMission() {
		if (attemptedMission!=null) {
			return Optional.of(attemptedMission);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public Optional<MissionCard> getCompletedMission() {
		if (completedMission!=null) {
			return Optional.of(completedMission);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public Optional<DilemmaCard> getFacedDilemma() {
		if (facedDilemma!=null) {
			return Optional.of(facedDilemma);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public Optional<Card> getDrawnCard() {
		if (drawnCard!=null) {
			return Optional.of(drawnCard);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public Optional<Card> getPlayedCard() {
		if (playedCard!=null) {
			return Optional.of(playedCard);
		} else {
			return Optional.empty();
		}
	}
		
	@Override
	public Optional<Card> getDiscardedCard() {
		if (discardedCard!=null) {
			return Optional.of(discardedCard);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public Optional<Card> getRemovedCard() {
		if (removedCard!=null) {
			return Optional.of(removedCard);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public CardCollection<Card> getCommandedCards() {
		return commanded;
	}
	
	@Override
	public CardCollection<Card> getOwnedCards() {
		return owned;
	}
	
}
