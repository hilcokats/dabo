package nl.kats.dabo.play;

import java.util.HashSet;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.cards.Iconed;
import nl.kats.dabo.dsl.enums.Icon;

public class IconList<T extends CardType> extends HashSet<Icon> implements Iconed<T> {

	private static final long serialVersionUID = -6423116798753691027L;

	private final T card;

	public IconList(T card) {
		this.card = card;
	}

	@Override
	public Iconed<T> alternate() {
		add(Icon.ALTERNATE);
		return this;
	}

	@Override
	public Iconed<T> command() {
		add(Icon.COMMAND);
		return this;
	}

	@Override
	public Iconed<T> ds9() {
		add(Icon.DS9);
		return this;
	}

	@Override
	public Iconed<T> earth() {
		add(Icon.EARTH);
		return this;
	}

	@Override
	public Iconed<T> future() {
		add(Icon.FUTURE);
		return this;
	}

	@Override
	public Iconed<T> maquis() {
		add(Icon.MAQUIS);
		return this;
	}

	@Override
	public Iconed<T> past() {
		add(Icon.PAST);
		return this;
	}

	@Override
	public Iconed<T> staff() {
		add(Icon.STAFF);
		return this;
	}

	@Override
	public Iconed<T> terok_nor() {
		add(Icon.TEROK_NOR);
		return this;
	}

	@Override
	public Iconed<T> the_next_generation() {
		add(Icon.THE_NEXT_GENERATION);
		return this;
	}

	@Override
	public Iconed<T> the_original_series() {
		add(Icon.THE_ORIGINAL_SERIES);
		return this;
	}

	@Override
	public Iconed<T> voyager() {
		add(Icon.VOYAGER);
		return this;
	}

	@Override
	public T end() {
		return card;
	}

}
