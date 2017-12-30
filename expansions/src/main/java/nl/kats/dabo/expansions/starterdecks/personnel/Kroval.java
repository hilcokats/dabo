package nl.kats.dabo.expansions.starterdecks.personnel;

import nl.kats.dabo.dsl.CardBuilder;

public final class Kroval extends CardBuilder {

    @Override
    public void build() {
        personnel("Kroval")
                .collectorsId("1C307")
                .cost(1)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().archaeology().geology().science().end()
                .icons().staff().end()
                .integrity(5)
                .cunning(5)
                .strength(6);
    }
}
