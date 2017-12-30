package nl.kats.dabo.table;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.cards.mission.MissionCard;

public class Spaceline extends CardList<MissionCard> {

    public Spaceline(CardCollection<DefinedCard> cards) {
        addAll(cards.missions());
    }

    public CardCollection<MissionCard> completed() {
        //TODO: implement
        return null;
    }

    public CardCollection<MissionCard> headquarters() {
        //TODO: implement
        return null;
    }
}
