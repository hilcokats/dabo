package nl.kats.dabo.dsl.context;

import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;

public interface Opponent extends AnyPlayer {

	default boolean attempts(MissionCard mission) {
		return attempts(mission.getName());
	}
	
	default boolean completes(MissionCard mission) {
		return completes(mission.getName());
	}

	default boolean faces(DilemmaCard dilemma) {
		return faces(dilemma.getName());
	}

	default boolean draws(DefinedCard card) {
		return draws(card.getName());
	}

	default boolean plays(DefinedCard card) {
		return plays(card.getName());
	}

	default boolean discards(DefinedCard card) {
		return discards(card.getName());
	}

	default boolean removesFromGame(DefinedCard card) {
		return removesFromGame(card.getName());
	}

	default boolean commands(DefinedCard card) {
		return commands(card.getName());
	}
	
	default boolean owns(DefinedCard card) {
		return owns(card.getName());
	}

	default boolean attempts(String mission) {
		return getAttemptedMission().isPresent() && getAttemptedMission().get().getName().equals(mission);
	}
	
	default boolean completes(String mission) {
		return getCompletedMission().isPresent() && getCompletedMission().get().getName().equals(mission);
	}
	
	default boolean faces(String dilemma) {
		return getFacedDilemma().isPresent() && getFacedDilemma().get().getName().equals(dilemma);
	}
	
	default boolean draws(String card) {
		return getDrawnCard().isPresent() && getDrawnCard().get().getName().equals(card);
	}
	
	default boolean plays(String card) {
		return getPlayedCard().isPresent() && getPlayedCard().get().getName().equals(card);
	}
	
	default boolean discards(String card)  {
		return getDiscardedCard().isPresent() && getDiscardedCard().get().getName().equals(card);
	}
	
	default boolean removesFromGame(String card) {
		return getRemovedCard().isPresent() && getRemovedCard().get().getName().equals(card);
	}
	
	default boolean commands(String card) {
		return getCommandedCards().stream().anyMatch(c -> c.getName().equals(card));
	}
	
	default boolean owns(String card) {
		return getOwnedCards().stream().anyMatch(c -> c.getName().equals(card));
	}
	
	default boolean attemptsMission() {
		return getAttemptedMission().isPresent();
	}
	
	default boolean completesMission() {
		return getCompletedMission().isPresent();
	}
	
	default boolean facesDilemma() {
		return getFacedDilemma().isPresent();
	}
	
	default boolean drawsCard() {
		return getDrawnCard().isPresent();
	}

	default boolean playsCard() {
		return getPlayedCard().isPresent();
	}
	
	default boolean discardsCard() {
		return getDiscardedCard().isPresent();
	}

	default boolean removesCardFromGame() {
		return getRemovedCard().isPresent();
	}

}
