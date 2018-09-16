package nl.kats.dabo.expansions.starterdecks.dilemmas.dual;

import nl.kats.dabo.dsl.CardBuilder;
import nl.kats.dabo.dsl.enums.Skill;

public final class Microbrain extends CardBuilder {

    @Override
    public void build() {
        dilemma("Microbrain")
                .collectorsId("1C32")
                .cost(3)
                .dual()
                .unless().youHaveAPersonnelWhoHas().exobiology(2).or().geology(2).end()
                .when().faced().opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.GEOLOGY, Skill.EXOBIOLOGY))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam())
                .toBeStopped();
    }
}
