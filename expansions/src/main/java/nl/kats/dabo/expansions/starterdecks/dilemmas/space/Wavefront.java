package nl.kats.dabo.expansions.starterdecks.dilemmas.space;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.dsl.CardBuilder;

public final class Wavefront extends CardBuilder {

    @Override
    public void build() {
        dilemma("Wavefront")
                .collectorsId("1C60")
                .cost(2)
                .space()
                .unless().youHaveAPersonnelWhoHas().astrometrics().astrometrics().or().navigation().navigation().end()
                .when().faced()
                .opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.ASTROMETRICS, Skill.NAVIGATION))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
