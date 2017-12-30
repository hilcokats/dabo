package nl.kats.dabo.expansions.starterdecks.interrupts;

import nl.kats.dabo.dsl.CardBuilder;

public final class ThePromise extends CardBuilder {

    @Override
    public void build() {
        interrupt("The Promise").collectorsId("promise");
        //TODO
//                .perform(c -> addSkills(c.your().awayTeam().personnel().with(Affiliation.KLINGON)));
    }
}
