package nl.kats.dabo.expansions.starterdecks.missions.space;

import nl.kats.dabo.dsl.CardBuilder;

public final class ExploreBlackCluster extends CardBuilder {

    @Override
    public void build() {
        mission("Explore Black Cluster")
                .collectorsId("1S167")
                .unique()
                .alphaQuadrant()
                .affiliations().klingon().romulan().end()
                .space()
                .requirements().astrometrics().leadership().physics().science().cunning().greaterThan(34).end()
                .span(2)
                .points(35)
                .lore("Sector 97: Conduct a survey of this region known for its violent and unpredictable gravitational wavefronts");
    }
}
