package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.ActionContext;

public class WhileClause<T extends CardType> extends Conditional<T> {

    public WhileClause(T card) {
        super(card);
    }

    public WhileClause(T card, Predicate predicate) {
        super(card, predicate);
    }

    public Effect<T> inPlay() {
        this.predicate = c -> c.you().command(c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> inCombat() {
        this.predicate = ActionContext::inCombat;
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> inEngagement() {
        this.predicate = ActionContext::inEngagement;
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> facingDilemma() {
        this.predicate = c -> c.you().faceDilemma();
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> matchingCommanderOnBoard() {
        this.predicate = null; // TODO: FIXME
        this.effect = new Effect<>(card);
        return this.effect;
    }

}
