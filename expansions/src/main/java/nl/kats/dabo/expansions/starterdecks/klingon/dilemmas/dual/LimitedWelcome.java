package nl.kats.dabo.expansions.starterdecks.klingon.dilemmas.dual;

import nl.kats.dabo.dsl.CardBuilder;

public class LimitedWelcome extends CardBuilder {

    @Override
    public void build() {
        dilemma("Limited Welcome")
                .collectorsId("1S34")
                .cost(2)
                .space()
                .planet()
                .when().faced()
                    .select(c -> c.your().awayTeam().personnel())
                    .toBeStopped()
                .additionally()
                    .randomly(9).select(c -> c.your().awayTeam().personnel())
                    .toBeUnstopped()
                .end()
                .lore("I hope you’ll forgive the darkness. We are not comfortable in the light.");
    }
}
