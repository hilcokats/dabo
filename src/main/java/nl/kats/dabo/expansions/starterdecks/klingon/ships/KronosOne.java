package nl.kats.dabo.expansions.starterdecks.klingon.ships;

import nl.kats.dabo.dsl.enums.Keyword;
import nl.kats.dabo.expansions.CardBuilder;

public class KronosOne extends CardBuilder {

    @Override
    public void build() {
        ship("Kronos One")
                .collectorsId("14R118")
                .unique()
                .cost(4)
                .affiliation().klingon()
                .staffingRequirements().command().staff().end()
                .classification().ktinga()
                .keywords().cloakingDevice().end()
                .icons().future().end()
                .whilst().matchingCommanderOnBoard()
                    .order()
                    .onceEachTurn()
                    .select(c -> c.your().dilemmaPile().with(Keyword.PERSISTENT))
                    .toBeKilled()
                    .additionally()
                    .perform(addRange(2))
                    .untilTheEndOfDilemma()
                    .additionally()
                    .perform(c->c.your().dilemmaPile().shuffleAndReplace())
                    .end()
                .range(7)
                .weapons(7)
                .shields(7);
    }
}
