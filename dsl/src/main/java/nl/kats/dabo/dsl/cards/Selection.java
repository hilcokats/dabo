package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.context.ActionContext;

public interface Selection {

    @SuppressWarnings("rawtypes")
    CardCollection select(ActionContext context);

}
