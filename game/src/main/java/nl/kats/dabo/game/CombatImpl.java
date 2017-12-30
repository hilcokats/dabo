package nl.kats.dabo.game;

import nl.kats.dabo.dsl.CardCollection;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;
import nl.kats.dabo.dsl.context.Combat;

public class CombatImpl implements Combat {

    @Override
    public boolean join(CardCollection<PersonnelCard> personnel) {
        return false;
    }

}
