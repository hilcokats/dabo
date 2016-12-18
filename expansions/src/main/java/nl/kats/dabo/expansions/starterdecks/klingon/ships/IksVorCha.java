package nl.kats.dabo.expansions.starterdecks.klingon.ships;

import nl.kats.dabo.dsl.CardBuilder;

public class IksVorCha extends CardBuilder {

    @Override
    public void build() {
        ship("I.K.S. Vor'cha")
                .collectorsId("1S403")
                .cost(5)
                .affiliation().klingon()
                .staffingRequirements().command().staff().staff().staff().end()
                .classification().vorcha()
                .range(8)
                .weapons(9)
                .shields(8);
    }
}
