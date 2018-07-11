package nl.kats.dabo.dsl.cards.personnel;

import nl.kats.dabo.dsl.SkillList;
import nl.kats.dabo.dsl.SpeciesList;
import nl.kats.dabo.dsl.cards.AffiliatedCardDefinition;
import nl.kats.dabo.dsl.cards.Skilled;
import nl.kats.dabo.dsl.cards.Taxoned;
import nl.kats.dabo.dsl.enums.Keyword;
import nl.kats.dabo.dsl.enums.Skill;

public class PersonnelDefinition extends AffiliatedCardDefinition<PersonnelType>
        implements PersonnelType {

    private String ship;
    private Skill interlink;

    private int integrity;
    private int cunning;
    private int strength;

    private SpeciesList<PersonnelType> species;
    private SkillList<PersonnelType> skills;

    public PersonnelDefinition(String title) {
        super(title);
    }

    public PersonnelDefinition(String title, String subtitle) {
        super(title, subtitle);
    }

    /* DSL methods */

    @Override
    public PersonnelType commander(String shipName) {
        this.ship = shipName;
        this.getKeywords().add(Keyword.COMMANDER);
        return this;
    }

    @Override
    public PersonnelType interlink(Skill skill) {
        this.interlink = skill;
        this.getKeywords().add(Keyword.COMMANDER);
        return this;
    }

    @Override
    public PersonnelType integrity(int value) {
        this.integrity = value;
        return this;
    }

    @Override
    public PersonnelType cunning(int value) {
        this.cunning = value;
        return this;
    }

    @Override
    public PersonnelType strength(int value) {
        this.strength = value;
        return this;
    }

    @Override
    public Taxoned<PersonnelType> species() {
        this.species = new SpeciesList<>(this);
        return this.species;
    }

    @Override
    public Skilled<PersonnelType> skills() {
        this.skills = new SkillList<>(this);
        return this.skills;
    }

    /* Getters */

    public int getIntegrity() {
        return integrity;
    }

    public int getCunning() {
        return cunning;
    }

    public int getStrength() {
        return strength;
    }

    public String getShip() {
        return ship;
    }

    public Skill getInterlink() {
        return interlink;
    }

    public SpeciesList<PersonnelType> getSpecies() {
        return species;
    }

    public SkillList<PersonnelType> getSkills() {
        return skills;
    }

}
