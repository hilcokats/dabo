package nl.kats.dabo.expansions.starterdecks.klingon.personnel;

import nl.kats.dabo.dsl.CardBuilder;

public class Tvis extends CardBuilder {

    @Override
    public void build() {
        personnel("T'vis")
                .collectorsId("1C315")
                .cost(2)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().diplomacy().honor().law().security().end()
                .icons().staff().end()
                .integrity(6)
                .cunning(5)
                .strength(7);
    }
}
