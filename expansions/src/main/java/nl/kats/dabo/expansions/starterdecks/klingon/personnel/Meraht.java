package nl.kats.dabo.expansions.starterdecks.klingon.personnel;

import nl.kats.dabo.expansions.CardBuilder;

public class Meraht extends CardBuilder {

    @Override
    public void build() {
        personnel("Meraht")
                .collectorsId("1C312")
                .cost(2)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().anthropology().exobiology().honor().intelligence().transporters().end()
                .integrity(6)
                .cunning(5)
                .strength(6);
    }
}
