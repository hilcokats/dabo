package nl.kats.dabo.expansions.starterdecks.personnel;

import nl.kats.dabo.dsl.CardBuilder;

public final class Bamara extends CardBuilder {

    @Override
    public void build() {
        personnel("B'amara")
                .collectorsId("1C292")
                .affiliation().klingon()
                .species().klingon().end()
                .skills().biology().honor().medical().physics().programming().end()
                .integrity(6)
                .cunning(5)
                .strength(6)
                .icons().staff().end();
    }
}
