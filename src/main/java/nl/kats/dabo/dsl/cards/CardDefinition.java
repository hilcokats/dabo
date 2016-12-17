package nl.kats.dabo.dsl.cards;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import nl.kats.dabo.dsl.ActionContext;
import nl.kats.dabo.dsl.CardPools;
import nl.kats.dabo.play.IconList;
import nl.kats.dabo.play.KeywordList;

public abstract class CardDefinition<T extends CardType> implements CardType, Collectable<T> {

    private final String subtitle;
    private final String title;

    private int cost;
    private boolean unique;
    private String lore;
    private String collectorsId;

    private Predicate allowed;
    private KeywordList<T> keywords;
    private IconList<T> icons;

    protected WhenClause<T> whenClause;

    private WhileClause<T> whileClause;

    private CardPools<T> playsOn;

    protected CardDefinition(String title) {
        this(title, null);
    }

    protected CardDefinition(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

	/* DSL methods */

    @SuppressWarnings("unchecked")
    public T unique() {
        this.unique = true;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T cost(int cost) {
        this.cost = cost;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public CardPools<T> playsOn() {
        this.playsOn = new CardPools<>((T) this);
        return this.playsOn;
    }

    @SuppressWarnings("unchecked")
    public T allowedWhen(Predicate predicate) {
        this.allowed = predicate;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public Described<T> keywords() {
        if (this.keywords == null) {
            this.keywords = new KeywordList<>((T) this);
        }
        return this.keywords;
    }

    @SuppressWarnings("unchecked")
    public Iconed<T> icons() {
        if (this.icons == null) {
            this.icons = new IconList<>((T) this);
        }
        return this.icons;
    }

    @SuppressWarnings("unchecked")
    public WhenClause<T> when() {
        this.whenClause = new WhenClause<>((T) this);
        return this.whenClause;
    }

    @SuppressWarnings("unchecked")
    public Effect<T> when(Predicate predicate) {
        this.whenClause = new WhenClause<>((T) this, predicate);
        return this.whenClause.effect;
    }

    @SuppressWarnings("unchecked")
    public WhileClause<T> whilst() {
        this.whileClause = new WhileClause<>((T) this);
        return this.whileClause;
    }

    @SuppressWarnings("unchecked")
    public Effect<T> whilst(Predicate predicate) {
        this.whileClause = new WhileClause<>((T) this);
        return this.whileClause.effect;
    }

    @SuppressWarnings("unchecked")
    public Effect<T> destroyTo() {
        Effect<T> effect = when().discarded();
        effect.makeUserTriggered();
        return effect;
    }

    @SuppressWarnings("unchecked")
    public T lore(String lore) {
        this.lore = lore;
        return (T) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T collectorsId(String collectorsId) {
        this.collectorsId = collectorsId;
        return (T) this;
    }
	
	/* Getters */

    public String getCollectorsId() {
        return collectorsId;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getCost() {
        return cost;
    }

    public boolean isUnique() {
        return unique;
    }

    public boolean isAllowed(ActionContext game) {
        return allowed.matches(game);
    }

    public String getLore() {
        return lore;
    }

    protected KeywordList<T> getKeywords() {
        return keywords;
    }

    public Iconed<T> getIcons() {
        return icons;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(title)
                .append(subtitle)
                .toHashCode();
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {
        return obj instanceof CardDefinition && new EqualsBuilder()
                .append(title, ((CardDefinition) obj).title)
                .append(subtitle, ((CardDefinition) obj).subtitle)
                .isEquals();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this.getClass())
                .append(collectorsId)
                .append(title)
                .append(subtitle)
                .toString();
    }

}
