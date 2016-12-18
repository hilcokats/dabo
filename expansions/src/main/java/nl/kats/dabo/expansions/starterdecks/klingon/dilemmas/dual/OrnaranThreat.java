package nl.kats.dabo.expansions.starterdecks.klingon.dilemmas.dual;

import nl.kats.dabo.dsl.CardBuilder;

public class OrnaranThreat extends CardBuilder {

    @Override
    public void build() {
        dilemma("Ornaran Threat")
                .collectorsId("1C41")
                .cost(4)
                .space()
                .planet()
                .unless().youHave().diplomacy().medical().or().security().security().end()
                .when().faced()
                .randomly().select(c->c.your().awayTeam().personnel())
                .toBeKilled()
                .alternatively()
                .randomly().select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
