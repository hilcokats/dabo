package nl.kats.dabo.dsl.context;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;

public interface Combat {

    boolean join(CardCollection<PersonnelCard> personnel);

}
