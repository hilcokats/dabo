package nl.kats.dabo.expansions.starterdecks.klingon.dilemmas.planet;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.expansions.CardBuilder;

public class Triage extends CardBuilder {

    @Override
    public void build() {
        dilemma("Triage")
                .collectorsId("1C52")
                .cost(1)
                .planet()
                .unless().youHaveAPersonnelWhoHas().biology().or().medical().end()
                .when().faced()
                .yourChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.BIOLOGY, Skill.MEDICAL))
                .toBeStopped()
                .alternatively()
                .randomly().select(c->c.your().awayTeam().personnel())
                .toBeKilled();
    }
}
