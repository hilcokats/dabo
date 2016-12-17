package nl.kats.dabo.dsl.cards;

public interface StaffingRequirement<T extends CardType> {

    StaffingRequirement<T> command();

    StaffingRequirement<T> staff();

    T end();

}
