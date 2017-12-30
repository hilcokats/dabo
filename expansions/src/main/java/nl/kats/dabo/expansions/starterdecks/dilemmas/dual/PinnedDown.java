package nl.kats.dabo.expansions.starterdecks.dilemmas.dual;

import nl.kats.dabo.dsl.CardBuilder;

public final class PinnedDown extends CardBuilder {

    @Override
    public void build() {
        dilemma("Pinned Down")
                .collectorsId("1S43")
                .cost(2)
                .planet()
                .space()
                .when().faced()
                .randomly().select(c -> c.your().awayTeam().personnel())
                .toBeStopped()
                .additionally()
                //TODO: if nine remaining, etc
                .randomly().select(c -> c.your().awayTeam().personnel());
    }
}
