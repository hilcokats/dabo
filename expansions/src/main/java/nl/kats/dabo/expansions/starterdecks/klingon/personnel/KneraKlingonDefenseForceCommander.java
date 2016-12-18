package nl.kats.dabo.expansions.starterdecks.klingon.personnel;

import nl.kats.dabo.dsl.CardBuilder;

public class KneraKlingonDefenseForceCommander extends CardBuilder {

    @Override
    public void build() {
        personnel("K'nera", "Klingon Defense Force Commander")
                .collectorsId("1S299")
                .unique()
                .cost(2)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().honor().law().officer().security().transporters().end()
                .icons().command().end()
                .integrity(6)
                .cunning(4)
                .strength(7);
    }
}
