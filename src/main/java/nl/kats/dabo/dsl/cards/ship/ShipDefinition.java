package nl.kats.dabo.dsl.cards.ship;

import nl.kats.dabo.dsl.cards.AffiliatedCardDefinition;
import nl.kats.dabo.dsl.cards.Classified;
import nl.kats.dabo.dsl.cards.StaffingRequirement;
import nl.kats.dabo.dsl.enums.Classification;
import nl.kats.dabo.dsl.StaffingRequirementList;

public class ShipDefinition extends AffiliatedCardDefinition<ShipType>
        implements ShipType {

    public Classification classification = Classification.UNKNOWN;
    private StaffingRequirement<ShipType> staffingRequirements = new StaffingRequirementList<>(this);
    private int range = 0;
    private int shields = 0;
    private int weapons = 0;

    public ShipDefinition(String title) {
        super(title);
    }

    public ShipDefinition(String title, String subtitle) {
        super(title, subtitle);
    }

    @Override
    public Classified classification() {
        return new Classified(this);
    }

    @Override
    public StaffingRequirement<ShipType> staffingRequirements() {
        return staffingRequirements;
    }

    @Override
    public ShipType range(int value) {
        range = value;
        return this;
    }

    @Override
    public ShipType weapons(int value) {
        weapons = value;
        return this;
    }

    @Override
    public ShipType shields(int value) {
        shields = value;
        return this;
    }

}
