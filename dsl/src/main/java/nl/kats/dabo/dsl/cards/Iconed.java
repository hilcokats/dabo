package nl.kats.dabo.dsl.cards;

public interface Iconed<T extends CardType> {

    Iconed<T> alternate();

    Iconed<T> command();

    Iconed<T> ds9();

    Iconed<T> earth();

    Iconed<T> future();

    Iconed<T> maquis();

    Iconed<T> past();

    Iconed<T> staff();

    Iconed<T> terok_nor();

    Iconed<T> the_next_generation();

    Iconed<T> the_original_series();

    Iconed<T> voyager();

    T end();

}
