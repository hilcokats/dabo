package nl.kats.dabo.expansions.starterdecks.klingon.dilemmas.planet;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.dsl.CardBuilder;

public class KoloranRaiders extends CardBuilder {

    @Override
    public void build() {
        dilemma("Kolaran Raiders")
                .collectorsId("1S35")
                .cost(1)
                .planet()
                .unless().youHaveAPersonnelWhoHas().leadership().or().security().end()
                .when().faced()
                .yourChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.LEADERSHIP, Skill.SECURITY))
                .toBeStopped()
                .alternatively()
                .randomly().select(c->c.your().awayTeam().personnel())
                .toBeKilled();
    }
}
