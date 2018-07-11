package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.cards.dilemma.DilemmaType;

public class DilemmaWhenClause extends WhenClause<DilemmaType> {

    public DilemmaWhenClause(DilemmaType card) {
        super(card);
    }

    public DilemmaWhenClause(DilemmaType card, Predicate predicate) {
        super(card, predicate);
    }

    public Effect<DilemmaType> faced() {
        this.predicate = c -> c.you().play(c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

}
