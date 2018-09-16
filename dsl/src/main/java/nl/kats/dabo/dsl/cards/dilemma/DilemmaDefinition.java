package nl.kats.dabo.dsl.cards.dilemma;

import nl.kats.dabo.dsl.cards.CardDefinition;
import nl.kats.dabo.dsl.cards.DilemmaWhenClause;
import nl.kats.dabo.dsl.cards.Effect;
import nl.kats.dabo.dsl.cards.Predicate;
import nl.kats.dabo.dsl.enums.Keyword;

public class DilemmaDefinition extends CardDefinition<DilemmaType> implements DilemmaType {

    private boolean planet;
    private boolean space;
    private int consume;
    private UnlessClause<DilemmaType> unlessClause;

    public DilemmaDefinition(String title) {
        super(title);
    }

    public DilemmaDefinition(String title, String subtitle) {
        super(title, subtitle);
    }


    @Override
    public DilemmaType space() {
        space = true;
        return this;
    }

    @Override
    public DilemmaType planet() {
        planet = true;
        return this;
    }

    @Override
    public DilemmaType dual() {
        planet = true;
        space = true;
        return this;
    }

    @Override
    public DilemmaType consume(int amount) {
        this.consume = amount;
        this.getKeywords().add(Keyword.CONSUME);
        return this;
    }

    @Override
    public DilemmaWhenClause when() {
        whenClause = new DilemmaWhenClause(this);
        return (DilemmaWhenClause) this.whenClause;
    }

    @Override
    public UnlessClause<DilemmaType> unless() {
        unlessClause = new UnlessClause<>(this);
        return this.unlessClause;
    }

    @Override
    public Effect<DilemmaType> unless(Predicate predicate) {
        unlessClause = new UnlessClause<>(this, predicate);
        return this.unlessClause.getEffect();
    }

    public boolean isPlanet() {
        return planet;
    }

    public boolean isSpace() {
        return space;
    }

    public int getConsume() {
        return consume;
    }

    public UnlessClause<DilemmaType> getUnlessClause() {
        return unlessClause;
    }
}
