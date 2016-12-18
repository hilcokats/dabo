package nl.kats.dabo.expansions.starterdecks.klingon.dilemmas.planet;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.expansions.CardBuilder;

public class AuthenticateArtifacts extends CardBuilder {

    @Override
    public void build() {
        dilemma("Authenticate Artifacts")
                .collectorsId("1C8")
                .cost(2)
                .planet()
                .unless().youHaveAPersonnelWhoHas().anthropology().anthropology().or().archaeology().archaeology().end()
                .when().faced()
                .opponentsChoice().select(c->c.your().awayTeam().personnel().withAny(Skill.ANTHROPOLOGY, Skill.ARCHAEOLOGY))
                .toBeStopped()
                .alternatively()
                .select(c->c.your().awayTeam().personnel())
                .toBeStopped();
    }
}
