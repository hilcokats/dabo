package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;
import nl.kats.dabo.dsl.cards.personnel.PersonnelDefinition;
import nl.kats.dabo.dsl.enums.Affiliation;
import nl.kats.dabo.dsl.enums.Skill;
import nl.kats.dabo.game.Player;

public class Personnel extends Card implements PersonnelCard {
    private final PersonnelDefinition definition;

    public Personnel(PersonnelDefinition definition, Player player) {
        super(definition, player);
        this.definition = definition;
    }

    @Override
    public void adjustIntegrity(int i) {

    }

    @Override
    public void adjustCunning(int i) {

    }

    @Override
    public void adjustStrength(int i) {

    }

    @Override
    public int getListedIntegrity() {
        return 0;
    }

    @Override
    public int getListedCunning() {
        return 0;
    }

    @Override
    public int getListedStrength() {
        return 0;
    }

    @Override
    public int getEffectiveIntegrity() {
        return 0;
    }

    @Override
    public int getEffectiveCunning() {
        return 0;
    }

    @Override
    public int getEffectiveStrength() {
        return 0;
    }

    @Override
    public boolean hasSkill(Skill skill) {
        return false;
    }

    @Override
    public boolean hasAnykill(Skill[] skills) {
        return false;
    }

    @Override
    public boolean hasAllkills(Skill[] skills) {
        return false;
    }

    @Override
    public boolean is(Affiliation affiliation) {
        return false;
    }

    @Override
    public boolean at(MissionCard mission) {
        return false;
    }

    @Override
    public boolean inRegion(String region) {
        return false;
    }
}
