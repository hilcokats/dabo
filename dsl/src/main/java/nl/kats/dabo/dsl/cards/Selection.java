package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.ActionContext;
import nl.kats.dabo.dsl.CardCollection;

public interface Selection {

	@SuppressWarnings("rawtypes")
	CardCollection select(ActionContext context);
	
}