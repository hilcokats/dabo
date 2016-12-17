package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.enums.Affiliation;

import java.util.ArrayList;

public class Headquarters<T extends CardType> extends ArrayList<Affiliation> {

    private final T card;

    public Headquarters(T card) {
        this.card = card;
    }

    public Headquarters<T> bajoran() {
        add(Affiliation.BAJORAN);
        return this;
    }

    public Headquarters<T> borg() {
        add(Affiliation.BORG);
        return this;
    }

    public Headquarters<T> cardassian() {
        add(Affiliation.CARDASSIAN);
        return this;
    }

    public Headquarters<T> dominion() {
        add(Affiliation.DOMINION);
        return this;
    }

    public Headquarters<T> federation() {
        add(Affiliation.FEDERATION);
        return this;
    }

    public Headquarters<T> ferengi() {
        add(Affiliation.FERENGI);
        return this;
    }

    public Headquarters<T> klingon() {
        add(Affiliation.KLINGON);
        return this;
    }

    public Headquarters<T> romulan() {
        add(Affiliation.BAJORAN);
        return this;
    }

    public Headquarters<T> starfleet() {
        add(Affiliation.STARFLEET);
        return this;
    }

    public Headquarters<T> nonAligned() {
        add(Affiliation.NON_ALIGNED);
        return this;
    }

    public T end() {
        return card;
    }

}
