package nl.kats.dabo.expansions.starterdecks.missions.planet;

import nl.kats.dabo.dsl.CardBuilder;

public final class KithomerInvestigation extends CardBuilder {

    @Override
    public void build() {
        mission("Khitomer Investigation")
                .collectorsId("")
                .alphaQuadrant()
                .affiliations().klingon().romulan().end()
                .planet()
                .requirements()
                .programming().security().cunning().greaterThan(32)
                .either().honor(2).or().treachery(2)
                .end()
                .span(2)
                .points(35)
                .lore("Khitomer: For many turns, the truth about Kithomer has lain dormant... unknown... Thousands died on Khitomer... Their deaths must be avenged!")
                .collectorsId("1S183");
    }
}
