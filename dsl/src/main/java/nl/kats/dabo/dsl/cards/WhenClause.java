package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.context.ActionContext;

public class WhenClause<T extends CardType> extends Conditional<T> {

    public WhenClause(T card) {
        super(card);
    }

    public WhenClause(T card, Predicate predicate) {
        super(card, predicate);
    }

    public Effect<T> played() {
        this.predicate = c -> c.you().play(c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> playedAnd(Predicate predicate) {
        this.predicate = c -> predicate.matches(c) && c.you().play(c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> discarded() {
        this.predicate = c -> c.you().discard(c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> discardedAnd(Predicate predicate) {
        this.predicate = c -> predicate.matches(c) && c.you().discard(c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> removedFromGame() {
        this.predicate = c -> c.you().removeFromGame(c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> removedFromGameAnd(Predicate self) {
        this.predicate = c -> predicate.matches(c) && c.you().removeFromGame(c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> facingDilemma() {
        this.predicate = ActionContext::facingDilemma;
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> combatStarts() {
        this.predicate = ActionContext::combatStarts;
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> engagementStarts() {
        this.predicate = ActionContext::engagementStarts;
        this.effect = new Effect<>(card);
        return this.effect;
    }
}
