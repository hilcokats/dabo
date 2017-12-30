package nl.kats.dabo.expansions.starterdecks.personnel;

import nl.kats.dabo.dsl.CardBuilder;

public final class Vorax extends CardBuilder {

    @Override
    public void build() {
        personnel("Vorax")
                .collectorsId("1C316")
                .cost(2)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().astrometrics().engineer().geology().programming().end()
                .icons().staff().end()
                .integrity(6)
                .cunning(5)
                .strength(7);
    }
}
