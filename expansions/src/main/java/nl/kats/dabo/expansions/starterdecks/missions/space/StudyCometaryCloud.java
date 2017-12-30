package nl.kats.dabo.expansions.starterdecks.missions.space;

import nl.kats.dabo.dsl.CardBuilder;

public final class StudyCometaryCloud extends CardBuilder {

    @Override
    public void build() {
        mission("Study Cometary Cloud")
                .collectorsId("1S201")
                .alphaQuadrant()
                .affiliations().dominion().ferengi().klingon().nonAligned().romulan().end()
                .space()
                .requirements().astrometrics().navigation().programming().cunning().greaterThan(34).either().acquisition().or().security().end()
                .span(2)
                .lore("Cruses system: Collect samples of the unusual particles in this system’s Oort cloud. Conduct research on their military or commercial potential.");
    }
}
