package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.enums.Affiliation;

public class Affiliated<T extends CardType> {

    private final AffiliatedCardDefinition<T> affiliated;

    public Affiliated(AffiliatedCardDefinition<T> affiliated) {
        this.affiliated = affiliated;
    }

    @SuppressWarnings("unchecked")
    public T bajoran() {
        affiliated.affiliation = Affiliation.BAJORAN;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T borg() {
        affiliated.affiliation = Affiliation.BORG;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T cardassian() {
        affiliated.affiliation = Affiliation.CARDASSIAN;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T dominion() {
        affiliated.affiliation = Affiliation.DOMINION;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T federation() {
        affiliated.affiliation = Affiliation.FEDERATION;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T ferengi() {
        affiliated.affiliation = Affiliation.FERENGI;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T klingon() {
        affiliated.affiliation = Affiliation.KLINGON;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T romulan() {
        affiliated.affiliation = Affiliation.ROMULAN;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T starfleet() {
        affiliated.affiliation = Affiliation.STARFLEET;
        return (T) affiliated;
    }

    @SuppressWarnings("unchecked")
    public T nonAligned() {
        affiliated.affiliation = Affiliation.NON_ALIGNED;
        return (T) affiliated;
    }

}
