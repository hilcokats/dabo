package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.ActionContext;

public interface Action {
	
	/**
	 * @return false if the action cannot be (fully) performed, true otherwise.
	 */
	boolean perform(ActionContext game);

}
