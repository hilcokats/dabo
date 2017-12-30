package nl.kats.dabo.expansions.starterdecks.personnel;

import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.dsl.CardBuilder;

public final class KahlestGhojmohOfWorf extends CardBuilder {

    @Override
    public void build() {
        personnel("Kahlest", "GhojmoH of Worf")
                .collectorsId("1S300")
                .unique()
                .cost(2)
                .affiliation().klingon()
                .species().klingon().end()
                .skills().anthropology().honor().medical().end()
                .integrity(7)
                .cunning(5)
                .strength(3)
                .whilst().inPlay()
                .select(c->c.your().awayTeam().personnel().with(Skill.HONOR))
                .perform(addCunning(1));
    }
}
