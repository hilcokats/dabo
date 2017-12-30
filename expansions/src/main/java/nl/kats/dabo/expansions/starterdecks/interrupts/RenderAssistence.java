package nl.kats.dabo.expansions.starterdecks.interrupts;

import nl.kats.dabo.dsl.CardBuilder;

public final class RenderAssistence extends CardBuilder {

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
