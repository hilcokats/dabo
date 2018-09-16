package nl.kats.dabo.expansions.starterdecks.interrupts;

import nl.kats.dabo.dsl.CardBuilder;
import nl.kats.dabo.dsl.enums.Affiliation;

public final class ThePromise extends CardBuilder {

    @Override
    public void build() {
        interrupt("The Promise").collectorsId("promise")
                .when().facingDilemma()
                .select(c -> c.your().awayTeam().personnel().with(Affiliation.KLINGON))
                // TODO .perform(add skills and attributes from a personnel in your discard pile)
                .untilTheEndOfDilemma();
    }
}
