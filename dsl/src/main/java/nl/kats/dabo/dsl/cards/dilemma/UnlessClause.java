package nl.kats.dabo.dsl.cards.dilemma;

import nl.kats.dabo.dsl.cards.Action;
import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.cards.Conditional;
import nl.kats.dabo.dsl.cards.Effect;
import nl.kats.dabo.dsl.cards.Predicate;
import nl.kats.dabo.dsl.cards.mission.Requirements;

public class UnlessClause<T extends CardType> extends Conditional<T> {

    private Requirements<T> requirements;
    private Action action;

    public UnlessClause(T card) {
        super(card);
    }

    public UnlessClause(T card, Predicate predicate) {
        super(card, predicate);
    }

    public Requirements<T> youHave() {
        this.requirements = new Requirements<>(card);
        this.effect = new Effect<>(card);
        return this.requirements;
    }

    public Requirements<T> youHaveAPersonnelWhoHas() {
        this.requirements = new Requirements<>(card);
        this.effect = new Effect<>(card);
        return this.requirements;
    }

    public Effect<T> youDo(Action action) {
        this.action = action;
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<T> getEffect() {
        return this.effect;
    }

    public Action getAction() {
        return action;
    }
}
