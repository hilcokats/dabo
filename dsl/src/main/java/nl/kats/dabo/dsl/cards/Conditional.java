package nl.kats.dabo.dsl.cards;

public abstract class Conditional<T extends CardType> {

    protected final T card;
    protected Effect<T> effect;
    Predicate predicate;

    protected Conditional(T card) {
        this(card, null);
    }

    protected Conditional(T card, Predicate predicate) {
        this.card = card;
        this.predicate = predicate;
        this.effect = new Effect<>(card);
    }
}
