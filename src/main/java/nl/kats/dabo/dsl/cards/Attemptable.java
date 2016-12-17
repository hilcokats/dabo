package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.enums.Affiliation;

import java.util.ArrayList;

public class Attemptable<T extends CardType> extends ArrayList<Affiliation> {

    private final T card;

    public Attemptable(T card) {
        this.card = card;
    }

    public Attemptable<T> bajoran() {
        add(Affiliation.BAJORAN);
        return this;
    }

    public Attemptable<T> borg() {
        add(Affiliation.BORG);
        return this;
    }

    public Attemptable<T> cardassian() {
        add(Affiliation.CARDASSIAN);
        return this;
    }

    public Attemptable<T> dominion() {
        add(Affiliation.DOMINION);
        return this;
    }

    public Attemptable<T> federation() {
        add(Affiliation.FEDERATION);
        return this;
    }

    public Attemptable<T> ferengi() {
        add(Affiliation.FERENGI);
        return this;
    }

    public Attemptable<T> klingon() {
        add(Affiliation.KLINGON);
        return this;
    }

    public Attemptable<T> romulan() {
        add(Affiliation.BAJORAN);
        return this;
    }

    public Attemptable<T> starfleet() {
        add(Affiliation.STARFLEET);
        return this;
    }

    public Attemptable<T> nonAligned() {
        add(Affiliation.NON_ALIGNED);
        return this;
    }

    public T end() {
        return card;
    }

}
