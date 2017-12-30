package nl.kats.dabo.game;

import nl.kats.dabo.cards.CardFactory;
import nl.kats.dabo.dsl.CardCatalog;
import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.CardNotFoundException;
import nl.kats.dabo.dsl.Cards;
import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;
import nl.kats.dabo.dsl.cards.equipment.EquipmentCard;
import nl.kats.dabo.dsl.cards.event.EventCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;
import nl.kats.dabo.dsl.cards.ship.ShipCard;
import nl.kats.dabo.dsl.context.EitherPlayer;
import nl.kats.dabo.table.Brig;
import nl.kats.dabo.table.CardList;
import nl.kats.dabo.table.Core;
import nl.kats.dabo.table.Deck;
import nl.kats.dabo.table.DilemmaPile;
import nl.kats.dabo.table.DiscardPile;
import nl.kats.dabo.table.Hand;
import nl.kats.dabo.table.OutOfTheGame;
import nl.kats.dabo.table.Spaceline;

import java.util.List;
import java.util.Optional;

public class Player implements EitherPlayer, Cards {

	private final Deck deck;
	private final DiscardPile discardPile;
	private final DilemmaPile dilemmaPile;
	private final Core core;
	private final Brig brig;
	private final OutOfTheGame outOfTheGame;
	private final Spaceline spaceline;
	private final Hand hand;

	private Integer points;
	
	private final nl.kats.dabo.game.Cards owned;
	private final nl.kats.dabo.game.Cards commanded;

	public Player(List<String> deckList) throws CardNotFoundException {
	    CardList<DefinedCard> cards = new CardList<>();
        for (String collectorsId : deckList) {
            cards.add(CardFactory.getInstance(CardCatalog.CARDS.getByCollectorsId(collectorsId), this));
        }

		this.owned = new nl.kats.dabo.game.Cards(cards);
		this.commanded = new nl.kats.dabo.game.Cards();

		this.deck = new Deck(cards);
		this.deck.shuffleAndReplace();

        this.spaceline = new Spaceline(cards);

        this.dilemmaPile = new DilemmaPile(cards);
        this.dilemmaPile.shuffleAndReplace();

        this.hand = new Hand();
        this.discardPile = new DiscardPile();
        this.brig = new Brig();
        this.core = new Core();
        this.outOfTheGame = new OutOfTheGame();

        this.points = 0;

        for (int i=0; i<7; i++) {
            deck.top();
        }
    }

	@Override
	public boolean scorePoints(int points) {
		this.points += points;
		return true;
	}
	
	@Override
	public Optional<MissionCard> getAttemptedMission() {
        MissionCard attemptedMission = null; //TODO: implement
        return Optional.ofNullable(attemptedMission);
	}
	
	@Override
	public Optional<MissionCard> getCompletedMission() {
        MissionCard completedMission = null; //TODO: implement
        return Optional.ofNullable(completedMission);
	}
	
	@Override
	public Optional<DilemmaCard> getFacedDilemma() {
        DilemmaCard facedDilemma = null; //TODO: implement
        return Optional.ofNullable(facedDilemma);
	}
	
	@Override
	public Optional<DefinedCard> getDrawnCard() {
        DefinedCard drawnCard = null; //TODO: implement
        return Optional.ofNullable(drawnCard);
	}
	
	@Override
	public Optional<DefinedCard> getPlayedCard() {
        DefinedCard playedCard = null; //TODO: implement
        return Optional.ofNullable(playedCard);
	}
		
	@Override
	public Optional<DefinedCard> getDiscardedCard() {
        DefinedCard discardedCard = null; //TODO: implement
        return Optional.ofNullable(discardedCard);
	}
	
	@Override
	public Optional<DefinedCard> getRemovedCard() {
        DefinedCard removedCard = null; //TODO: implement
        return Optional.ofNullable(removedCard);
	}
	
	@Override
	public CardCollection<DefinedCard> getCommandedCards() {
		return commanded;
	}
	
	@Override
	public CardCollection<DefinedCard> getOwnedCards() {
		return owned;
	}

	@Override
	public CardCollection<DefinedCard> deck() {
		return deck;
	}

	@Override
	public CardCollection<DefinedCard> hand() {
		return hand;
	}

	@Override
	public CardCollection<DefinedCard> discardPile() {
		return discardPile;
	}

	@Override
	public CardCollection<DilemmaCard> dilemmaPile() {
		return dilemmaPile;
	}

	@Override
	public CardCollection<DilemmaCard> drawnDilemmas() {
	    //TODO: implement
		return null;
	}

	@Override
	public CardCollection<EventCard> core() {
		return core;
	}

	@Override
	public CardCollection<MissionCard> missions() {
		return spaceline;
	}

	@Override
	public CardCollection<MissionCard> completedMissions() {
		return spaceline.completed();
	}

	@Override
	public CardCollection<MissionCard> headquarters() {
		return spaceline.headquarters();
	}

	@Override
	public CardCollection<DefinedCard> removedFromGame() {
		return outOfTheGame;
	}

	@Override
	public CardCollection<DefinedCard> commanded() {
		return commanded;
	}

	@Override
	public CardCollection<DefinedCard> owned() {
		return owned;
	}

	@Override
	public CardCollection<PersonnelCard> awayTeam() {
        //TODO: implement
		return null;
	}

	@Override
	public CardCollection<ShipCard> armada() {
        //TODO: implement
		return null;
	}

	@Override
	public CardCollection<EquipmentCard> equipment() {
		return commanded.equipment();
	}
}
