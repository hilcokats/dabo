package nl.kats.dabo.dsl.cards;

public interface Skilled<T extends CardType> {

    Skilled<T> acquisition();

    Skilled<T> anthropology();

    Skilled<T> archaeology();

    Skilled<T> astrometrics();

    Skilled<T> biology();

    Skilled<T> diplomacy();

    Skilled<T> engineer();

    Skilled<T> exobiology();

    Skilled<T> geology();

    Skilled<T> honor();

    Skilled<T> intelligence();

    Skilled<T> law();

    Skilled<T> leadership();

    Skilled<T> medical();

    Skilled<T> navigation();

    Skilled<T> officer();

    Skilled<T> physics();

    Skilled<T> programming();

    Skilled<T> science();

    Skilled<T> security();

    Skilled<T> telepathy();

    Skilled<T> transporters();

    Skilled<T> treachery();

    Skilled<T> acquisition(int multiplier);

    Skilled<T> anthropology(int multiplier);

    Skilled<T> archaeology(int multiplier);

    Skilled<T> astrometrics(int multiplier);

    Skilled<T> biology(int multiplier);

    Skilled<T> diplomacy(int multiplier);

    Skilled<T> engineer(int multiplier);

    Skilled<T> exobiology(int multiplier);

    Skilled<T> geology(int multiplier);

    Skilled<T> honor(int multiplier);

    Skilled<T> intelligence(int multiplier);

    Skilled<T> law(int multiplier);

    Skilled<T> leadership(int multiplier);

    Skilled<T> medical(int multiplier);

    Skilled<T> navigation(int multiplier);

    Skilled<T> officer(int multiplier);

    Skilled<T> physics(int multiplier);

    Skilled<T> programming(int multiplier);

    Skilled<T> science(int multiplier);

    Skilled<T> security(int multiplier);

    Skilled<T> telepathy(int multiplier);

    Skilled<T> transporters(int multiplier);

    Skilled<T> treachery(int multiplier);

    T end();

}
