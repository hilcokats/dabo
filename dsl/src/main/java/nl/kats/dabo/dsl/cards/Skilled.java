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

	 T end();

}
