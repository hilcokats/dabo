package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.enums.Affiliation;

public abstract class AffiliatedCardDefinition<T extends CardType> extends CardDefinition<T> {

	protected AffiliatedCardDefinition(String title, String subtitle) {
		super(title, subtitle);
	}

	protected AffiliatedCardDefinition(String title) {
		super(title);
	}

	Affiliation affiliation;

	public Affiliated<T> affiliation() {
		return new Affiliated<>(this);
	}

	public Affiliation getAffiliation() {
		return affiliation;
	}
}
