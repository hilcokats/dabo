package nl.kats.dabo.expansions.starterdecks.klingon.interrupts;

import nl.kats.dabo.dsl.cards.Action;
import nl.kats.dabo.expansions.CardBuilder;

public class RenderAssistence extends CardBuilder {

    @Override
    public void build() {
        interrupt("Render Assistance")
                .collectorsId("1S136")
                .when().combatStarts()
                .select(c -> c.your().commanded().ships())
                .yourChoice()
                .perform(joinEngagement());
    }

}
