package nl.kats.dabo.dsl.cards;

public interface StaffingRequirement<T extends CardType> {

    StaffingRequirement<T> command();

    StaffingRequirement<T> staff();

    StaffingRequirement<T> command(int multiplier);

    StaffingRequirement<T> staff(int multiplier);

    T end();

}
