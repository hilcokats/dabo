package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.cards.mission.MissionCard;
import nl.kats.dabo.dsl.cards.mission.MissionType;

public class MissionWhenClause extends WhenClause<MissionType> {

    public MissionWhenClause(MissionType card) {
        super(card);
    }

    public MissionWhenClause(MissionType card, Predicate predicate) {
        super(card, predicate);
    }

    public Effect<MissionType> attempted() {
        this.predicate = c -> c.you().attempt((MissionCard) c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

    public Effect<MissionType> completed() {
        this.predicate = c -> c.you().complete((MissionCard) c.self());
        this.effect = new Effect<>(card);
        return this.effect;
    }

}
