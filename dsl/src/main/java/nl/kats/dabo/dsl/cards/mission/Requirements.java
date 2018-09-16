package nl.kats.dabo.dsl.cards.mission;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.enums.Attribute;
import nl.kats.dabo.dsl.enums.Skill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Requirements<T extends CardType> extends ArrayList<Skill> {

    private static final long serialVersionUID = -7444639176475667583L;

    private final T card;
    private final List<AttributeRequirements<T>> attributes = new ArrayList<>();
    private final List<Requirements<T>> options = new ArrayList<>();
    private Requirements<T> partOf;

    public Requirements(T mission) {
        this.card = mission;
    }

    private Requirements(T mission, Requirements<T> partOf) {
        this.partOf = partOf;
        this.card = mission;
    }

    public Requirements<T> acquisition() {
        return acquisition(1);
    }

    public Requirements<T> anthropology() {
        return anthropology(1);
    }

    public Requirements<T> archaeology() {
        return archaeology(1);
    }

    public Requirements<T> astrometrics() {
        return astrometrics(1);
    }

    public Requirements<T> biology() {
        return biology(1);
    }

    public Requirements<T> diplomacy() {
        return diplomacy(1);
    }

    public Requirements<T> engineer() {
        return engineer(1);
    }

    public Requirements<T> exobiology() {
        return exobiology(1);
    }

    public Requirements<T> geology() {
        return geology(1);
    }

    public Requirements<T> honor() {
        return honor(1);
    }

    public Requirements<T> intelligence() {
        return intelligence(1);
    }

    public Requirements<T> law() {
        return law(1);
    }

    public Requirements<T> leadership() {
        return leadership(1);
    }

    public Requirements<T> medical() {
        return medical(1);
    }

    public Requirements<T> navigation() {
        return navigation(1);
    }

    public Requirements<T> officer() {
        return officer(1);
    }

    public Requirements<T> physics() {
        return physics(1);
    }

    public Requirements<T> programming() {
        return programming(1);
    }

    public Requirements<T> science() {
        return science(1);
    }

    public Requirements<T> security() {
        return security(1);
    }

    public Requirements<T> telepathy() {
        return telepathy(1);
    }

    public Requirements<T> transporters() {
        return transporters(1);
    }

    public Requirements<T> treachery() {
        return treachery(1);
    }

    public Requirements<T> acquisition(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ACQUISITION));
        return this;
    }

    public Requirements<T> anthropology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ANTHROPOLOGY));
        return this;
    }

    public Requirements<T> archaeology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ARCHAEOLOGY));
        return this;
    }

    public Requirements<T> astrometrics(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ASTROMETRICS));
        return this;
    }

    public Requirements<T> biology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.BIOLOGY));
        return this;
    }

    public Requirements<T> diplomacy(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.DIPLOMACY));
        return this;
    }

    public Requirements<T> engineer(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.ENGINEER));
        return this;
    }

    public Requirements<T> exobiology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.EXOBIOLOGY));
        return this;
    }

    public Requirements<T> geology(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.GEOLOGY));
        return this;
    }

    public Requirements<T> honor(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.HONOR));
        return this;
    }

    public Requirements<T> intelligence(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.INTELLIGENCE));
        return this;
    }

    public Requirements<T> law(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.LAW));
        return this;
    }

    public Requirements<T> leadership(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.LEADERSHIP));
        return this;
    }

    public Requirements<T> medical(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.MEDICAL));
        return this;
    }

    public Requirements<T> navigation(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.NAVIGATION));
        return this;
    }

    public Requirements<T> officer(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.OFFICER));
        return this;
    }

    public Requirements<T> physics(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.PHYSICS));
        return this;
    }

    public Requirements<T> programming(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.PROGRAMMING));
        return this;
    }

    public Requirements<T> science(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.SCIENCE));
        return this;
    }

    public Requirements<T> security(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.SECURITY));
        return this;
    }

    public Requirements<T> telepathy(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.TELEPATHY));
        return this;
    }

    public Requirements<T> transporters(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.TRANSPORTERS));
        return this;
    }

    public Requirements<T> treachery(int multiplier) {
        addAll(Collections.nCopies(multiplier, Skill.TREACHERY));
        return this;
    }

    public Requirements<T> either() {
        var option = new Requirements<>(card, this);
        this.options.add(option);
        return option;
    }

    public Requirements<T> or() {
        var option = new Requirements<>(card, this);
        if (partOf == null) {
            options.add(option);
        } else {
            partOf.options.add(option);
        }
        return option;
    }

    public T end() {
        return card;
    }

    public AttributeRequirements<T> integrity() {
        var attribute = new AttributeRequirements<>(Attribute.INTEGRITY, this);
        attributes.add(attribute);
        return attribute;
    }

    public AttributeRequirements<T> cunning() {
        var attribute = new AttributeRequirements<>(Attribute.CUNNING, this);
        attributes.add(attribute);
        return attribute;
    }

    public AttributeRequirements<T> strength() {
        var attribute = new AttributeRequirements<>(Attribute.STRENGTH, this);
        attributes.add(attribute);
        return attribute;
    }

    public AttributeRequirements<T> range() {
        var attribute = new AttributeRequirements<>(Attribute.RANGE, this);
        attributes.add(attribute);
        return attribute;
    }

    public AttributeRequirements<T> weapons() {
        var attribute = new AttributeRequirements<>(Attribute.WEAPONS, this);
        attributes.add(attribute);
        return attribute;
    }

    public AttributeRequirements<T> shields() {
        var attribute = new AttributeRequirements<>(Attribute.SHIELDS, this);
        attributes.add(attribute);
        return attribute;
    }

    public class AttributeRequirements<R extends CardType> {

        private static final int LT = -1;
        private static final int GT = 1;

        private final Attribute attribute;
        private final Requirements<R> requirements;

        private Integer value;
        private Integer sign;

        AttributeRequirements(Attribute attribute, Requirements<R> requirements) {
            this.requirements = requirements;
            this.attribute = attribute;
        }

        public Requirements<R> lessThan(int value) {
            this.value = value;
            sign = LT;
            return requirements;
        }

        public Requirements<R> greaterThan(int value) {
            this.value = value;
            sign = GT;
            return requirements;
        }

        public Attribute getAttribute() {
            return attribute;
        }

        public Requirements<R> getRequirements() {
            return requirements;
        }

        public Integer getValue() {
            return value;
        }

        public Integer getSign() {
            return sign;
        }

    }

}
