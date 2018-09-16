package nl.kats.dabo.expansions.starterdecks.personnel;

import nl.kats.dabo.dsl.CardBuilder;
import nl.kats.dabo.dsl.enums.Skill;

public final class GowronLeaderOfTheHighCouncil extends CardBuilder {

    @Override
    public void build() {
        personnel("Gowron", "Leader of the High Council")
                .collectorsId("1S297")
                .unique()
                .cost(4)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().anthropology().honor().law().leadership(2).end()
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
