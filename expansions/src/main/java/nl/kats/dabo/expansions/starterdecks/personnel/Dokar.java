package nl.kats.dabo.expansions.starterdecks.personnel;

import nl.kats.dabo.dsl.CardBuilder;

public final class Dokar extends CardBuilder {

    @Override
    public void build() {
        personnel("Dokar")
                .collectorsId("1C295")
                .cost(1)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().biology().navigation().officer().end()
                .icons().command().end()
                .integrity(5)
                .cunning(4)
                .strength(7);
    }
}
