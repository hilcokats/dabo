package nl.kats.dabo.dsl.cards.event;

import nl.kats.dabo.dsl.cards.CardDefinition;

public class EventDefinition extends CardDefinition<EventType> implements EventType {

	public EventDefinition(String title) {
		super(title);
	}

	public EventDefinition(String title, String subtitle) {
		super(title, subtitle);
	}

}
