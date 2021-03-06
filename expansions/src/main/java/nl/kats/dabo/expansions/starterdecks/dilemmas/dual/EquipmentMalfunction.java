package nl.kats.dabo.expansions.starterdecks.dilemmas.dual;

import nl.kats.dabo.dsl.CardBuilder;

public final class EquipmentMalfunction extends CardBuilder {

    @Override
    public void build() {
        dilemma("Equipment Malfunction")
                .collectorsId("1S25")
                .cost(1)
                .dual()
                .when().faced().select(c -> c.your().equipment()).perform(moveSelectedToOwnersHand()).end()
                .lore("Heh... must be the radiation");
    }
}
