package nl.kats.dabo.dsl.cards.mission;

import nl.kats.dabo.dsl.cards.*;
import nl.kats.dabo.dsl.enums.Region;

public class MissionDefinition extends CardDefinition<MissionType> implements MissionType {


    private enum Quadrant {
        ALPHA, BETA, GAMMA, DELTA;
    }

    public Quadrant quadrant;
    public Region region;
    private boolean planet;
    private boolean space;
    private int span;
    private int points;

    private Requirements<MissionType> requirements = new Requirements<>(this);
    private Attemptable<MissionType> affiliations = new Attemptable<>(this);
    private Headquarters<MissionType> headquarters = new Headquarters<>(this);

    public MissionDefinition(String title) {
        super(title);
    }

    public MissionDefinition(String title, String subtitle) {
        super(title, subtitle);
    }

    @Override
    public MissionType alphaQuadrant() {
        quadrant = Quadrant.ALPHA;
        return this;
    }

    @Override
    public MissionType gammaQuadrant() {
        quadrant = Quadrant.GAMMA;
        return this;
    }

    @Override
    public MissionType deltaQuadrant() {
        quadrant = Quadrant.DELTA;
        return this;
    }


    @Override
    public Regional region() {
        return new Regional(this);
    }

    @Override
    public MissionType points(int i) {
        points = i;
        return this;
    }

    @Override
    public Requirements<MissionType> requirements() {
        return requirements;
    }

    @Override
    public Attemptable<MissionType> affiliations() {
        return affiliations;
    }

    @Override
    public Headquarters<MissionType> headquarters() {
        return headquarters;
    }

    @Override
    public MissionType span(int i) {
        span = i;
        return this;
    }

    @Override
    public MissionWhenClause when() {
        whenClause = new MissionWhenClause(this);
        return (MissionWhenClause) this.whenClause;
    }

    @Override
    public MissionType planet() {
        planet = true;
        return this;
    }

    @Override
    public MissionType space() {
        space = true;
        return this;
    }


}
