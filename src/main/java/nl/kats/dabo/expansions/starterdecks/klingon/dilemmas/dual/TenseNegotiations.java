package nl.kats.dabo.expansions.starterdecks.klingon.dilemmas.dual;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.expansions.CardBuilder;

public class TenseNegotiations extends CardBuilder {

    @Override
    public void build() {
        dilemma("Tense Negotiations")
                .collectorsId("1C54")
                .cost(3)
                .space()
                .planet()
                .unless().youHaveAPersonnelWhoHas().diplomacy().diplomacy().or().leadership().leadership().end()
                .when().faced()
                .opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.DIPLOMACY, Skill.LEADERSHIP))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
