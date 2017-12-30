package nl.kats.dabo.game;

import nl.kats.dabo.cards.Card;
import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.CardNotFoundException;
import nl.kats.dabo.dsl.Cards;
import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.context.ActionContext;
import nl.kats.dabo.dsl.context.Combat;
import nl.kats.dabo.dsl.context.EitherPlayer;
import nl.kats.dabo.dsl.context.Engagement;
import nl.kats.dabo.dsl.context.Opponent;
import nl.kats.dabo.dsl.context.You;

import java.util.ArrayList;
import java.util.List;

public class Game implements ActionContext {
    private final List<EitherPlayer> players;
    private final List<Card> actions = new ArrayList<>();

    Combat combat = null;
    Engagement engagement = null;

    public Game(List<String> deck1, List<String> deck2) throws CardNotFoundException {
        this.players = new ArrayList<EitherPlayer>() {{
            add(new Player(deck1));
            add(new Player(deck2));
        }};
    }

    private Card current() {
        return actions.isEmpty() ? null : actions.get(actions.size() - 1);
    }

    @Override
    public DefinedCard self() {
        return current();
    }

    @Override
    public DefinedCard trigger() {
        return current();
    }

    @Override
    public You you() {
        return (You) current().commander();
    }

    @Override
    public Cards your() {
        return (Cards) you();
    }

    @Override
    public Opponent opponent() {
        return players.get(0).equals(you()) ? (Opponent) players.get(1) : (Opponent) players.get(0);
    }

    @Override
    public Cards opponents() {
        return (Cards) opponent();
    }

    @Override
    public boolean inCombat() {
        return combat != null;
    }

    @Override
    public boolean inEngagement() {
        return engagement != null;
    }

    @Override
    public CardCollection<DefinedCard> selectedCards() {
        return ((CardCollection<DefinedCard>)trigger()).selectedCards();
    }

    @Override
    public boolean combatStarts() {
        if (combat == null) {
            combat = new CombatImpl();
            return true;
        }
        return false;
    }

    @Override
    public boolean engagementStarts() {
        if (engagement == null) {
            engagement = new EngagementImpl();
            return true;
        }
        return false;
    }

    @Override
    public Engagement engagement() {
        return engagement;
    }

    @Override
    public Combat combat() {
        return combat;
    }
}
