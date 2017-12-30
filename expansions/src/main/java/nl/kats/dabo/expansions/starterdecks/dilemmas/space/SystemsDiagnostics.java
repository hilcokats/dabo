package nl.kats.dabo.expansions.starterdecks.dilemmas.space;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.dsl.CardBuilder;

public final class SystemsDiagnostics extends CardBuilder {

    @Override
    public void build() {
        dilemma("System Diagnostic")
                .collectorsId("1C53")
                .cost(2)
                .space()
                .unless().youHaveAPersonnelWhoHas().engineer().or().programming().end()
                .when().faced()
                .yourChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.ENGINEER, Skill.PROGRAMMING))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
