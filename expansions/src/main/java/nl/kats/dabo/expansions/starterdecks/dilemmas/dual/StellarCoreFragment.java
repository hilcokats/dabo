package nl.kats.dabo.expansions.starterdecks.dilemmas.dual;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.dsl.CardBuilder;

public final class StellarCoreFragment extends CardBuilder {

    @Override
    public void build() {
        dilemma("Stellar Core Fragment")
                .collectorsId("1C56")
                .cost(3)
                .planet()
                .space()
                .unless().youHaveAPersonnelWhoHas().physics().physics().or().science().science().end()
                .when().faced()
                .opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.PHYSICS, Skill.SCIENCE))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
