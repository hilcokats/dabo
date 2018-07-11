package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.enums.TableArea;

import java.util.HashSet;

public final class TableAreas<T extends CardType> extends HashSet<TableArea> {

    private static final long serialVersionUID = 9149830978248996028L;

    private final T card;

    public TableAreas(T card) {
        this.card = card;
    }

    public TableAreas<T> core() {
        add(TableArea.CORE);
        return this;
    }

    public T end() {
        return card;
    }

}
