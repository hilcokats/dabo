package nl.kats.dabo.dsl.cards.ship;

import nl.kats.dabo.dsl.cards.Card;

public interface ShipCard extends Card {

	boolean staffed();

	void adjustRange(int range);
	
	void adjustWeapons(int weapons);
	
	void adjustShields(int shields);

}
