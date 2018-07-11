package nl.kats.dabo.cards;

import nl.kats.dabo.dsl.cards.CardDefinition;
import nl.kats.dabo.dsl.cards.DefinedCard;
import nl.kats.dabo.dsl.context.EitherPlayer;
import nl.kats.dabo.dsl.enums.Keyword;
import nl.kats.dabo.dsl.enums.Status;
import nl.kats.dabo.game.Player;
import nl.kats.dabo.table.CardSet;

public abstract class Card<T extends DefinedCard> extends CardSet<T> implements PlayableCard {
    private final CardDefinition definition;

    private final Player owner;

    private boolean faceUp = false;

    private Player commander;

    protected Status status = Status.ACTIVE;

    protected Card<?> location;

    public Card(CardDefinition definition, Player player) {
        this.definition = definition;
        this.owner = player;
        this.commander = player;
    }

    @Override
    public EitherPlayer owner() {
        return owner;
    }

    @Override
    public EitherPlayer commander() {
        return commander;
    }

    @Override
    public boolean hasKeyword(Keyword keyword) {
        return definition.getKeywords().contains(keyword);
    }

    @Override
    public String getName() {
        return definition.getTitle();
    }

    @Override
    public String getSubtitle() {
        return definition.getSubtitle();
    }

    @Override
    public boolean hasAnyKeyword(Keyword[] keywords) {
        for (var keyword : keywords) {
            if (definition.getKeywords().contains(keyword)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasAllKeywords(Keyword[] keywords) {
        for (var keyword : keywords) {
            if (!definition.getKeywords().contains(keyword)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean hasStatus(Status status) {
        return this.status == status;
    }

    @Override
    public boolean hasAnyStatus(Status[] statuses) {
        for (var status : statuses) {
            if (hasStatus(status)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }
}
