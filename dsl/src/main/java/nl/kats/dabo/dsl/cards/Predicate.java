package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.context.ActionContext;

public interface Predicate {

    boolean matches(ActionContext context);

}
