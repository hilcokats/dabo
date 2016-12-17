package nl.kats.dabo.dsl.cards.interrupt;

import nl.kats.dabo.dsl.cards.CardDefinition;

public class InterruptDefinition extends CardDefinition<InterruptType> implements InterruptType {

	public InterruptDefinition(String title) {
		super(title);
	}

	public InterruptDefinition(String title, String subtitle) {
		super(title, subtitle);
	}

}
