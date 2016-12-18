package nl.kats.dabo.dsl;

import java.util.ArrayList;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.cards.StaffingRequirement;
import nl.kats.dabo.dsl.enums.Icon;

public class StaffingRequirementList<T extends CardType> extends ArrayList<Icon> implements StaffingRequirement<T> {

	private static final long serialVersionUID = -6423116798753691027L;

	private final T card;

	public StaffingRequirementList(T card) {
		this.card = card;
	}
	
	@Override
	public StaffingRequirement<T> command() {
		add(Icon.COMMAND);
		return this;
	}

	@Override
	public StaffingRequirement<T> staff() {
		add(Icon.STAFF);
		return this;
	}

	@Override
	public T end() {
		return card;
	}

}
