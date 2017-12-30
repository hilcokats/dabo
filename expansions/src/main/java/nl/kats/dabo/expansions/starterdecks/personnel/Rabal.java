package nl.kats.dabo.expansions.starterdecks.personnel;

import nl.kats.dabo.dsl.CardBuilder;

public final class Rabal extends CardBuilder {

    @Override
    public void build() {
        personnel("Rabal")
                .collectorsId("1C340")
                .cost(2)
                .affiliation().nonAligned()
                .species().hekaran().end()
                .skills().astrometrics().engineer().physics().programming().transporters().end()
                .icons().staff().end()
                .integrity(4)
                .cunning(6)
                .strength(5);
    }
}
