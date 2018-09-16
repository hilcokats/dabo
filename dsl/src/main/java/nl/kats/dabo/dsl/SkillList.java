package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.cards.Skilled;
import nl.kats.dabo.dsl.enums.Skill;

import java.util.ArrayList;
import java.util.Collections;

public final class SkillList<T extends CardType> extends ArrayList<Skill> implements Skilled<T> {

    private static final long serialVersionUID = 4076212054456516514L;

    private final T card;

    public SkillList(T card) {
        this.card = card;
    }

    @Override
    public Skilled<T> acquisition() {
        return acquisition(1);
    }

    @Override
    public Skilled<T> anthropology() {
        return anthropology(1);
    }

    @Override
    public Skilled<T> archaeology() {
        return archaeology(1);
    }

    @Override
    public Skilled<T> astrometrics() {
        return astrometrics(1);
    }

    @Override
    public Skilled<T> biology() {
        return biology(1);
    }

    @Override
    public Skilled<T> diplomacy() {
        return diplomacy(1);
    }

    @Override
    public Skilled<T> engineer() {
        return engineer(1);
    }

    @Override
    public Skilled<T> exobiology() {
        return exobiology(1);
    }

    @Override
    public Skilled<T> geology() {
        return geology(1);
    }

    @Override
    public Skilled<T> honor() {
        return honor(1);
    }

    @Override
    public Skilled<T> intelligence() {
        return intelligence(1);
    }

    @Override
    public Skilled<T> law() {
        return law(1);
    }

    @Override
    public Skilled<T> leadership() {
        return leadership(1);
    }

    @Override
    public Skilled<T> medical() {
        return medical(1);
    }

    @Override
    public Skilled<T> navigation() {
        return navigation(1);
    }

    @Override
    public Skilled<T> officer() {
        return officer(1);
    }

    @Override
    public Skilled<T> physics() {
        return physics(1);
    }

    @Override
    public Skilled<T> programming() {
        return programming(1);
    }

    @Override
    public Skilled<T> science() {
        return science(1);
    }

    @Override
    public Skilled<T> security() {
        return security(1);
    }

    @Override
    public Skilled<T> telepathy() {
        return telepathy(1);
    }

    @Override
    public Skilled<T> transporters() {
        return transporters(1);
    }

    @Override
    public Skilled<T> treachery() {
        return treachery(1);
    }

    @Override
    public Skilled<T> acquisition(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ACQUISITION));
        return this;
    }

    @Override
    public Skilled<T> anthropology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ANTHROPOLOGY));
        return this;
    }

    @Override
    public Skilled<T> archaeology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ARCHAEOLOGY));
        return this;
    }

    @Override
    public Skilled<T> astrometrics(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ASTROMETRICS));
        return this;
    }

    @Override
    public Skilled<T> biology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.BIOLOGY));
        return this;
    }

    @Override
    public Skilled<T> diplomacy(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.DIPLOMACY));
        return this;
    }

    @Override
    public Skilled<T> engineer(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ENGINEER));
        return this;
    }

    @Override
    public Skilled<T> exobiology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.EXOBIOLOGY));
        return this;
    }

    @Override
    public Skilled<T> geology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.GEOLOGY));
        return this;
    }

    @Override
    public Skilled<T> honor(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.HONOR));
        return this;
    }

    @Override
    public Skilled<T> intelligence(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.INTELLIGENCE));
        return this;
    }

    @Override
    public Skilled<T> law(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.LAW));
        return this;
    }

    @Override
    public Skilled<T> leadership(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.LEADERSHIP));
        return this;
    }

    @Override
    public Skilled<T> medical(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.MEDICAL));
        return this;
    }

    @Override
    public Skilled<T> navigation(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.NAVIGATION));
        return this;
    }

    @Override
    public Skilled<T> officer(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.OFFICER));
        return this;
    }

    @Override
    public Skilled<T> physics(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.PHYSICS));
        return this;
    }

    @Override
    public Skilled<T> programming(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.PROGRAMMING));
        return this;
    }

    @Override
    public Skilled<T> science(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.SCIENCE));
        return this;
    }

    @Override
    public Skilled<T> security(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.SECURITY));
        return this;
    }

    @Override
    public Skilled<T> telepathy(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.TELEPATHY));
        return this;
    }

    @Override
    public Skilled<T> transporters(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.TRANSPORTERS));
        return this;
    }

    @Override
    public Skilled<T> treachery(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.TREACHERY));
        return this;
    }

    @Override
    public T end() {
        return card;
    }

}
