package nl.kats.dabo.expansions.starterdecks.klingon.events;

import nl.kats.dabo.expansions.CardBuilder;

public class CryHavoc extends CardBuilder {

    @Override
    public void build() {
        event("Cry \"Havoc!\"")
                .collectorsId("1S83")
                .cost(3)
                .playsOn().core().end()
                .keywords().maneuver().end()
                .destroyTo()
                .toBeginEngagement();
    }
}
