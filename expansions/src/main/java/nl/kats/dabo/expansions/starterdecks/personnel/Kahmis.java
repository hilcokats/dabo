package nl.kats.dabo.expansions.starterdecks.personnel;

import nl.kats.dabo.dsl.CardBuilder;

public final class Kahmis extends CardBuilder {

    @Override
    public void build() {
        personnel("Kahmis")
                .collectorsId("1C301")
                .cost(1)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().leadership().security().transporters().end()
                .icons().staff().end()
                .integrity(6)
                .cunning(4)
                .strength(7);
    }
}
