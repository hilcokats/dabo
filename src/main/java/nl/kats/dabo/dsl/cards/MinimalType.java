package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.CardPools;

public interface MinimalType<T extends CardType> extends CardType {

    T unique();

    T cost(int cost);

    T allowedWhen(Predicate object);

    CardPools<T> playsOn();

    Described<T> keywords();

    Iconed<T> icons();

    WhenClause<T> when();

    Effect<T> when(Predicate predicate);

    WhileClause<T> whilst();

    Effect<T> whilst(Predicate predicate);

    Effect<T> destroyTo();

    T lore(String lore);

    T collectorsId(String collectorsId);

}
