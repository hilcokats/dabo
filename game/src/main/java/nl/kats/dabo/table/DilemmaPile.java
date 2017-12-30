package nl.kats.dabo.table;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.cards.dilemma.DilemmaCard;

import java.util.Arrays;

public class DilemmaPile extends CardList<DilemmaCard> {

    public DilemmaPile(CardCollection<DefinedCard> cards) {
        addAll(cards.dilemmas());
    }

    public void placeBeneath(DilemmaCard... dilemmas) {
        addAll(Arrays.asList(dilemmas));
    }

    public void placeOnTop(DilemmaCard... dilemmas) {
        addAll(0, Arrays.asList(dilemmas));
    }

}
