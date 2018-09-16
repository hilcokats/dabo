package nl.kats.dabo.expansions.starterdecks.dilemmas.dual;

import nl.kats.dabo.dsl.CardBuilder;
import nl.kats.dabo.dsl.enums.Skill;

public final class StellarCoreFragment extends CardBuilder {

    @Override
    public void build() {
        dilemma("Stellar Core Fragment")
                .collectorsId("1C56")
                .cost(3)
                .dual()
                .unless().youHaveAPersonnelWhoHas().physics(2).or().science(2).end()
                .when().faced()
                .opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.PHYSICS, Skill.SCIENCE))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
