package nl.kats.dabo.dsl.cards.ship;

import nl.kats.dabo.dsl.cards.AffiliatedCard;

public interface ShipCard extends AffiliatedCard {

    boolean staffed();

    void adjustRange(int range);

    void adjustWeapons(int weapons);

    void adjustShields(int shields);

}
