package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.Card;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;

public interface You extends Player {

	default boolean attempt(MissionCard mission) {
		return attempt(mission.getName());
	}
	
	default boolean complete(MissionCard mission) {
		return complete(mission.getName());
	}

	default boolean face(DilemmaCard dilemma) {
		return face(dilemma.getName());
	}

	default boolean draw(Card card) {
		return draw(card.getName());
	}

	default boolean play(Card card) {
		return play(card.getName());
	}

	default boolean discard(Card card) {
		return discard(card.getName());
	}

	default boolean removeFromGame(Card card) {
		return removeFromGame(card.getName());
	}

	default boolean command(Card card) {
		return command(card.getName());
	}
	
	default boolean own(Card card) {
		return own(card.getName());
	}

	default boolean attempt(String mission) {
		return getAttemptedMission().isPresent() && getAttemptedMission().get().getName().equals(mission);
	}
	
	default boolean complete(String mission) {
		return getCompletedMission().isPresent() && getCompletedMission().get().getName().equals(mission);
	}
	
	default boolean face(String dilemma) {
		return getFacedDilemma().isPresent() && getFacedDilemma().get().getName().equals(dilemma);
	}
	
	default boolean draw(String card) {
		return getDrawnCard().isPresent() && getDrawnCard().get().getName().equals(card);
	}
	
	default boolean play(String card) {
		return getPlayedCard().isPresent() && getPlayedCard().get().getName().equals(card);
	}
	
	default boolean discard(String card)  {
		return getDiscardedCard().isPresent() && getDiscardedCard().get().getName().equals(card);
	}
	
	default boolean removeFromGame(String card) {
		return getRemovedCard().isPresent() && getRemovedCard().get().getName().equals(card);
	}
	
	default boolean command(String card) {
		return getCommandedCards().stream().anyMatch(c -> c.getName().equals(card));
	}
	
	default boolean own(String card) {
		return getOwnedCards().stream().anyMatch(c -> c.getName().equals(card));
	}
	
	default boolean attemptMission() {
		return getAttemptedMission().isPresent();
	}
	
	default boolean completeMission() {
		return getCompletedMission().isPresent();
	}
	
	default boolean faceDilemma() {
		return getFacedDilemma().isPresent();
	}
	
	default boolean drawCard() {
		return getDrawnCard().isPresent();
	}

	default boolean playCard() {
		return getPlayedCard().isPresent();
	}
	
	default boolean discardCard() {
		return getDiscardedCard().isPresent();
	}

	default boolean removeCardFromGame() {
		return getRemovedCard().isPresent();
	}
	
}
