package nl.kats.dabo.dsl.cards.personnel;

import nl.kats.dabo.dsl.cards.Affiliated;
import nl.kats.dabo.dsl.cards.MinimalType;
import nl.kats.dabo.dsl.cards.Skilled;
import nl.kats.dabo.dsl.cards.Taxoned;
import nl.kats.dabo.dsl.enums.Skill;

public interface PersonnelType extends MinimalType<PersonnelType> {

	Affiliated<PersonnelType> affiliation();
	
	Taxoned<PersonnelType> species();

	PersonnelType commander(String shipName);
	
	PersonnelType interlink(Skill skill);
	
	Skilled<PersonnelType> skills();

	PersonnelType integrity(int value);

	PersonnelType cunning(int value);

	PersonnelType strength(int value);
	
}
