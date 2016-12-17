package nl.kats.dabo.expansions.starterdecks.klingon.personnel;

import nl.kats.dabo.expansions.CardBuilder;

public class KitrikTheTyrantMolor extends CardBuilder {

    @Override
    public void build() {
        personnel("Kitrik", "The Tyrant Molor")
                .collectorsId("1S303")
                .unique()
                .cost(2)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().exobiology().medical().programming().science().end()
                .icons().staff().end()
                .integrity(6)
                .cunning(5)
                .strength(6)
                .when().played()
                .select(c->c.your().deck())
                .toBeDownloaded();
    }
}
