package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.cards.StaffingRequirement;
import nl.kats.dabo.dsl.enums.Icon;

import java.util.ArrayList;
import java.util.Collections;

public final class StaffingRequirementList<T extends CardType> extends ArrayList<Icon> implements
                                                                                       StaffingRequirement<T> {

    private static final long serialVersionUID = -6423116798753691027L;

    private final T card;

    public StaffingRequirementList(T card) {
        this.card = card;
    }

    @Override
    public StaffingRequirement<T> command() {
        return command(1);
    }

    @Override
    public StaffingRequirement<T> staff() {
        return staff(1);
    }

    @Override
    public StaffingRequirement<T> command(int multiplier) {
        addAll(Collections.nCopies(multiplier, Icon.COMMAND));
        return this;
    }

    @Override
    public StaffingRequirement<T> staff(int multiplier) {
        addAll(Collections.nCopies(multiplier, Icon.STAFF));
        return this;
    }

    @Override
    public T end() {
        return card;
    }

}
