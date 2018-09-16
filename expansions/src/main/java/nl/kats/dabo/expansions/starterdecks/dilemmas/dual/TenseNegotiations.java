package nl.kats.dabo.expansions.starterdecks.dilemmas.dual;

import nl.kats.dabo.dsl.CardBuilder;
import nl.kats.dabo.dsl.enums.Skill;

public final class TenseNegotiations extends CardBuilder {

    @Override
    public void build() {
        dilemma("Tense Negotiations")
                .collectorsId("1C54")
                .cost(3)
                .dual()
                .unless().youHaveAPersonnelWhoHas().diplomacy(2).or().leadership(2).end()
                .when().faced()
                .opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.DIPLOMACY, Skill.LEADERSHIP))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
