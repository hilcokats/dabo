package nl.kats.dabo.expansions.starterdecks.klingon.dilemmas.dual;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.expansions.CardBuilder;

public class Microbrain extends CardBuilder {

    @Override
    public void build() {
        dilemma("Microbrain")
                .collectorsId("1C32")
                .cost(3)
                .planet()
                .space()
                .unless().youHaveAPersonnelWhoHas().exobiology().exobiology().or().geology().geology().end()
                .when().faced().opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.GEOLOGY, Skill.EXOBIOLOGY))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam())
                .toBeStopped();
    }
}
