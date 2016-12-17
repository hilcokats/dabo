package nl.kats.dabo.dsl.cards.ship;

import nl.kats.dabo.dsl.cards.Affiliated;
import nl.kats.dabo.dsl.cards.Classified;
import nl.kats.dabo.dsl.cards.MinimalType;
import nl.kats.dabo.dsl.cards.StaffingRequirement;

public interface ShipType extends MinimalType<ShipType> {

	Classified classification();

	Affiliated<ShipType> affiliation();
	
	StaffingRequirement<ShipType> staffingRequirements();

	ShipType range(int value);

	ShipType weapons(int value);

	ShipType shields(int value);


}
