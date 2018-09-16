package nl.kats.dabo.dsl.cards.dilemma;

import nl.kats.dabo.dsl.cards.DilemmaWhenClause;
import nl.kats.dabo.dsl.cards.Effect;
import nl.kats.dabo.dsl.cards.MinimalType;
import nl.kats.dabo.dsl.cards.Predicate;

public interface DilemmaType extends MinimalType<DilemmaType> {

    DilemmaType space();

    DilemmaType planet();

    DilemmaType dual();

    DilemmaType consume(int i);

    @Override
    DilemmaWhenClause when();

    UnlessClause<DilemmaType> unless();

    Effect<DilemmaType> unless(Predicate predicate);

}
