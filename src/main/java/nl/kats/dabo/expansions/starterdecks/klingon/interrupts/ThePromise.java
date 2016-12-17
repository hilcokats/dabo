package nl.kats.dabo.expansions.starterdecks.klingon.interrupts;

import nl.kats.dabo.expansions.CardBuilder;

public class ThePromise extends CardBuilder {

    @Override
    public void build() {
        interrupt("The Promise").collectorsId("promise");
        //TODO
//                .perform(c -> addSkills(c.your().awayTeam().personnel().with(Affiliation.KLINGON)));
    }
}
