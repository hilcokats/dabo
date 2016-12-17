package nl.kats.dabo.dsl.cards;

public abstract class Conditional<T extends CardType> {

    protected final T card;

    Predicate predicate;
    protected Effect<T> effect;

    protected Conditional(T card) {
        this(card, null);
    }

    protected Conditional(T card, Predicate predicate) {
        this.card = card;
        this.predicate = predicate;
        this.effect = new Effect<>(card);
    }
}
