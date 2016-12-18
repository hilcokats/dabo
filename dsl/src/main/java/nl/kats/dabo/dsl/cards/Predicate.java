package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.ActionContext;

public interface Predicate {

    boolean matches(ActionContext context);

}
