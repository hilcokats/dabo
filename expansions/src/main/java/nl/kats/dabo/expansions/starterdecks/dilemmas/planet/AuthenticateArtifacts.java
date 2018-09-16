package nl.kats.dabo.expansions.starterdecks.dilemmas.planet;

import nl.kats.dabo.dsl.CardBuilder;
import nl.kats.dabo.dsl.enums.Skill;

public final class AuthenticateArtifacts extends CardBuilder {

    @Override
    public void build() {
        dilemma("Authenticate Artifacts")
                .collectorsId("1C8")
                .cost(2)
                .planet()
                .unless().youHaveAPersonnelWhoHas().anthropology(2).or().archaeology(2).end()
                .when().faced()
                .opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.ANTHROPOLOGY, Skill.ARCHAEOLOGY))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
