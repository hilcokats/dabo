package nl.kats.dabo.dsl.cards.mission;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.enums.Attribute;
import nl.kats.dabo.dsl.enums.Skill;

import java.util.ArrayList;
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
        add(Skill.ACQUISITION);
        return this;
    }

    public Requirements<T> anthropology() {
        add(Skill.ANTHROPOLOGY);
        return this;
    }

    public Requirements<T> archaeology() {
        add(Skill.ARCHAEOLOGY);
        return this;
    }

    public Requirements<T> astrometrics() {
        add(Skill.ASTROMETRICS);
        return this;
    }

    public Requirements<T> biology() {
        add(Skill.BIOLOGY);
        return this;
    }

    public Requirements<T> diplomacy() {
        add(Skill.DIPLOMACY);
        return this;
    }

    public Requirements<T> engineer() {
        add(Skill.ENGINEER);
        return this;
    }

    public Requirements<T> exobiology() {
        add(Skill.EXOBIOLOGY);
        return this;
    }

    public Requirements<T> geology() {
        add(Skill.GEOLOGY);
        return this;
    }

    public Requirements<T> honor() {
        add(Skill.HONOR);
        return this;
    }

    public Requirements<T> intelligence() {
        add(Skill.INTELLIGENCE);
        return this;
    }

    public Requirements<T> law() {
        add(Skill.LAW);
        return this;
    }

    public Requirements<T> leadership() {
        add(Skill.LEADERSHIP);
        return this;
    }

    public Requirements<T> medical() {
        add(Skill.MEDICAL);
        return this;
    }

    public Requirements<T> navigation() {
        add(Skill.NAVIGATION);
        return this;
    }

    public Requirements<T> officer() {
        add(Skill.OFFICER);
        return this;
    }

    public Requirements<T> physics() {
        add(Skill.PHYSICS);
        return this;
    }

    public Requirements<T> programming() {
        add(Skill.PROGRAMMING);
        return this;
    }

    public Requirements<T> science() {
        add(Skill.SCIENCE);
        return this;
    }

    public Requirements<T> security() {
        add(Skill.SECURITY);
        return this;
    }

    public Requirements<T> telepathy() {
        add(Skill.TELEPATHY);
        return this;
    }

    public Requirements<T> transporters() {
        add(Skill.TRANSPORTERS);
        return this;
    }

    public Requirements<T> treachery() {
        add(Skill.TREACHERY);
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
