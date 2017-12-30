package nl.kats.dabo.expansions.starterdecks.missions.planet;

import nl.kats.dabo.dsl.CardBuilder;

public final class SensitiveSearch extends CardBuilder {

    @Override
    public void build() {
        mission("Sensitive Search")
                .collectorsId("")
                .unique()
                .alphaQuadrant()
                .affiliations().federation().ferengi().klingon().romulan().end()
                .planet()
                .requirements().programming().security().cunning().greaterThan(30).either().acquisition().or().honor().or().law().or().treachery().end()
                .span(2)
                .points(30)
                .lore("Nequencia system: Track the movements of an information broker who failed to arrive at a scheduled rendezvous.")
                .collectorsId("1S200");
    }

}
