package nl.kats.dabo.expansions.starterdecks.klingon.personnel;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.expansions.CardBuilder;

public class GowronLeaderOfTheHighCouncil extends CardBuilder {

    @Override
    public void build() {
        personnel("Gowron", "Leader of the High Council")
                .collectorsId("1S297")
                .unique()
                .cost(4)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().anthropology().honor().law().leadership().leadership().end()
                .icons().command().end()
                .keywords().chancellor().end()
                .integrity(6)
                .cunning(5)
                .strength(8)
                .when().played()
                .select(c->c.your().deck().personnel().with(Skill.HONOR))
                .toBeDownloaded();
    }
}
