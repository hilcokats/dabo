package nl.kats.dabo.expansions.starterdecks.ships;

import nl.kats.dabo.dsl.CardBuilder;

public final class IksKVort extends CardBuilder {

    @Override
    public void build() {
        ship("I.K.S. K'Vort")
                .collectorsId("1U399")
                .cost(4)
                .affiliation().klingon()
                .staffingRequirements().staff().staff().staff().end()
                .classification().kVort()
                .range(7)
                .weapons(8)
                .shields(7);
    }
}
