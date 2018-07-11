package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;
import nl.kats.dabo.dsl.cards.personnel.PersonnelDefinition;
import nl.kats.dabo.dsl.enums.Affiliation;
import nl.kats.dabo.dsl.enums.Region;
import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.game.Player;

public class Personnel extends Card implements PersonnelCard {
    private final PersonnelDefinition definition;

    private int integrityAdjustment = 0;
    private int cunningAdjustment = 0;
    private int strengthAdjustment = 0;


    public Personnel(PersonnelDefinition definition, Player player) {
        super(definition, player);
        this.definition = definition;
    }

    @Override
    public void adjustIntegrity(int i) {
        // TODO
    }

    @Override
    public void adjustCunning(int i) {
        // TODO
    }

    @Override
    public void adjustStrength(int i) {
        // TODO
    }

    @Override
    public int getListedIntegrity() {
        return definition.getIntegrity();
    }

    @Override
    public int getListedCunning() {
        return definition.getCunning();
    }

    @Override
    public int getListedStrength() {
        return definition.getStrength();
    }

    @Override
    public int getEffectiveIntegrity() {
        return getListedIntegrity() + integrityAdjustment;
    }

    @Override
    public int getEffectiveCunning() {
        return getListedCunning() + cunningAdjustment;
    }

    @Override
    public int getEffectiveStrength() {
        return getListedStrength() + strengthAdjustment;
    }

    @Override
    public boolean hasSkill(Skill skill) {
        return definition.getSkills().contains(skill);
    }

    @Override
    public boolean hasAnykill(Skill[] skills) {
        for (Skill skill : skills) {
            if (definition.getSkills().contains(skill)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasAllkills(Skill[] skills) {
        for (Skill skill : skills) {
            if (!definition.getSkills().contains(skill)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean is(Affiliation affiliation) {
        return definition.getAffiliation().equals(affiliation);
    }

    @Override
    public boolean at(MissionCard mission) {
        return location != null && (
                location.equals(mission) || location instanceof Ship && ((Ship) location).at(mission)
        );
    }

    @Override
    public boolean inRegion(Region region) {
        return location != null && (
                location instanceof Mission && ((Mission) location).getRegion().equals(region) ||
                location instanceof Ship && ((Ship) location).inRegion(region)
        );
    }
}
