package nl.kats.dabo.expansions.starterdecks.dilemmas.dual;

import nl.kats.dabo.dsl.CardBuilder;

public final class OrnaranThreat extends CardBuilder {

    @Override
    public void build() {
        dilemma("Ornaran Threat")
                .collectorsId("1C41")
                .cost(4)
                .dual()
                .unless().youHave().diplomacy().medical().or().security(2).end()
                .when().faced()
                .randomly().select(c->c.your().awayTeam().personnel())
                .toBeKilled()
                .alternatively()
                .randomly().select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
