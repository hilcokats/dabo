package nl.kats.dabo.dsl.cards.personnel;

import nl.kats.dabo.dsl.cards.AffiliatedCard;
import nl.kats.dabo.dsl.enums.Skill;

public interface PersonnelCard extends AffiliatedCard {

    void adjustIntegrity(int i);

    void adjustCunning(int i);

    void adjustStrength(int i);

    int getListedIntegrity();

    int getListedCunning();

    int getListedStrength();

    int getEffectiveIntegrity();

    int getEffectiveCunning();

    int getEffectiveStrength();

    boolean hasSkill(Skill skill);

    boolean hasAnykill(Skill[] skills);

    boolean hasAllkills(Skill[] skills);
}
