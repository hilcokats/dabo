package nl.kats.dabo.dsl.cards.mission;

import nl.kats.dabo.dsl.cards.*;

public interface MissionType extends MinimalType<MissionType> {

	MissionType alphaQuadrant();

	MissionType gammaQuadrant();

	MissionType deltaQuadrant();

	Regional region();

	MissionType points(int i);

	Requirements<MissionType> requirements();

	Attemptable<MissionType> affiliations();

	Headquarters<MissionType> headquarters();

	MissionType span(int i);
	
	@Override
	MissionWhenClause when();

	MissionType planet();

	MissionType space();
}
