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
import java.util.Optional;

public class Game implements ActionContext {
    private final List<EitherPlayer> players;
    private final List<Card> actions = new ArrayList<>();

    private Combat combat = null;
    private Engagement engagement = null;

    public Game(List<String> deck1, List<String> deck2) throws CardNotFoundException {
        this.players = new ArrayList<EitherPlayer>() {{
            add(new Player(deck1));
            add(new Player(deck2));
        }};
    }

    public void play(Card card) {
        actions.add(card);
    }

    public void endTurn() {
        actions.clear();
    }

    public void restart() {
        actions.clear();
        players.get(0).restart();
        players.get(1).restart();
    }

    private Optional<Card> current() {
        return actions.isEmpty() ? Optional.empty() : Optional.of(actions.get(actions.size() - 1));
    }

    @Override
    public DefinedCard self() {
        return current().orElse(null);
    }

    @Override
    public DefinedCard trigger() {
        return current().orElse(null);
    }

    @Override
    public You you() {
        return current().isPresent() ? current().get().commander() : null;
    }

    @Override
    public Cards your() {
        return (Cards) you();
    }

    @Override
    public Opponent opponent() {
        return players.get(0).equals(you()) ? players.get(1) : players.get(0);
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
        return current().isPresent() ? current().get().selectedCards() : null;
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
