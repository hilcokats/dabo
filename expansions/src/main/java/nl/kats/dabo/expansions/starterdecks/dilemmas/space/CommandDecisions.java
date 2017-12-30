package nl.kats.dabo.expansions.starterdecks.dilemmas.space;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.dsl.CardBuilder;

public final class CommandDecisions extends CardBuilder {

    @Override
    public void build() {
        dilemma("Command Decisions")
                .collectorsId("1S12")
                .cost(1)
                .space()
                .unless().youHaveAPersonnelWhoHas().leadership().or().officer().end()
                .when().faced()
                .yourChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.LEADERSHIP, Skill.OFFICER))
                .toBeStopped()
                .alternatively()
                .randomly().select(c->c.your().awayTeam().personnel())
                .toBeKilled();
    }
}
