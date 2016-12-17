package nl.kats.dabo.dsl.cards;

public interface Collectable<T extends CardType> {

    T collectorsId(String id);

}
