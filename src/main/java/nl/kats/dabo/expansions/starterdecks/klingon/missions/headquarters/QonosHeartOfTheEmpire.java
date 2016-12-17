package nl.kats.dabo.expansions.starterdecks.klingon.missions.headquarters;

import nl.kats.dabo.expansions.CardBuilder;

public class QonosHeartOfTheEmpire extends CardBuilder {

    @Override
    public void build() {
        mission("Qo'noS", "Heart of the Empire")
                .collectorsId("")
                .alphaQuadrant()
                .headquarters().klingon().nonAligned().end()
                .planet()
                .span(2)
                .lore("Qo'noS: Homeworld of the Klingon Empire. Its sharply tilted axis causes extreme seasonal changes. With but one major land mass, there was constant war before the time of Kahless. It is a place as hard and turbulent as the Klingons themselves.")
                .collectorsId("1S191");
    }
}
