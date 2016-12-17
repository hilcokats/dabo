package nl.kats.dabo.dsl.context;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;

/**
 * Created by Hilco on 15-12-16.
 */
public interface Combat {

    boolean join(CardCollection<PersonnelCard> personnel);

}
