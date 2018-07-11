package nl.kats.dabo.dsl.cards;

import nl.kats.dabo.dsl.enums.SelectionMethod;
import nl.kats.dabo.dsl.enums.SelectionRestriction;

public class Effect<T extends CardType> {

    private final T card;
    protected SelectionRestriction selectionRestriction = SelectionRestriction.EXACTLY;
    int selectionAmount = 1;
    Selection selection;
    Action action;
    private EffectRestriction restriction;
    private EffectDuration duration;
    private EffectNecessity necessity = EffectNecessity.MANDATORY;
    private SelectionMethod selectionMethod = SelectionMethod.RANDOM_SELECTION;
    private boolean order;

    private boolean copiesOnly;

    private Effect<T> additionalEffect;
    private Effect<T> alternativeEffect;

    private boolean userTriggered = false;
    private boolean beginEngagement = false;

    public Effect(T card) {
        this.card = card;
    }

    public Effect<T> perform(Action action) {
        this.action = action;
        return this;
    }

    public Effect<T> toBeStopped() {
        this.action = context -> context.selectedCards().stop();
        return this;
    }

    public Effect<T> toBeUnstopped() {
        this.action = context -> context.selectedCards().unstop();
        return this;
    }

    public Effect<T> toBeKilled() {
        this.action = context -> context.selectedCards().discard();
        return this;
    }

    public Effect<T> toBeRemovedFromTheGame() {
        this.action = context -> context.selectedCards().removeFromTheGame();
        return this;
    }

    public Effect<T> mandatory() {
        this.necessity = EffectNecessity.MANDATORY;
        return this;
    }

    public Effect<T> optional() {
        this.necessity = EffectNecessity.OPTIONAL;
        return this;
    }

    public Effect<T> select(Selection selection) {
        this.selection = selection;
        return this;
    }

    public Effect<T> randomly() {
        return randomly(1);
    }

    public Effect<T> randomly(int i) {
        this.selectionMethod = SelectionMethod.RANDOM_SELECTION;
        this.selectionAmount = i;
        return this;
    }

    public Effect<T> yourChoice() {
        return yourChoice(1);
    }

    public Effect<T> yourChoice(int i) {
        this.selectionMethod = SelectionMethod.YOUR_CHOICE;
        this.selectionAmount = i;
        return this;
    }

    public Effect<T> opponentsChoice() {
        return opponentsChoice(1);
    }

    public Effect<T> opponentsChoice(int i) {
        this.selectionMethod = SelectionMethod.OPPONENTS_CHOICE;
        this.selectionAmount = i;
        return this;
    }

    public Effect<T> order() {
        this.order = true;
        return this;
    }

    public Effect<T> onceEachTurn() {
        restriction = EffectRestriction.ONCE_EACH_TURN;
        return this;
    }

    public Effect<T> copies() {
        this.copiesOnly = true;
        return this;
    }

    public Effect<T> untilTheEndOfDilemma() {
        duration = EffectDuration.UNTIL_END_OF_DILEMMA;
        return this;
    }

    public Effect<T> untilTheEndOfTurn() {
        duration = EffectDuration.UNTIL_END_OF_TURN;
        return this;
    }

    public Effect<T> additionally() {
        this.additionalEffect = new Effect<>(card);
        return this.additionalEffect;
    }

    public Effect<T> alternatively() {
        this.alternativeEffect = new Effect<>(card);
        return this.alternativeEffect;
    }

    public T end() {
        return card;
    }

    public DownloadBuilder<T> toBeDownloaded() {
        this.selectionMethod = SelectionMethod.YOUR_CHOICE;
        this.selection = c -> c.your().deck();
        this.action = c -> c.your().hand().addAll(c.selectedCards());
        this.necessity = EffectNecessity.OPTIONAL;
        return new DownloadBuilder<>(this, additionally());
    }

    public Effect<T> placeBeneath(String string) {
        //		TODO: implement
        //		this.selectionMethod = SelectionMethod.YOUR_CHOICE;
        //		this.selection = c -> c.your().missions();
        //		this.action = c -> c.selectedCards().stream().filter(t -> t.getName().equals(title)).findFirst().get
        // ().;
        //		this.necessity = EffectNecessity.OPTIONAL;

        return this;
    }

    public void beginEngagement() {
        beginEngagement = true;
    }

    /* Getters */

    protected Action getAction() {
        return action;
    }

    protected Effect<T> getAlternativeEffect() {
        return alternativeEffect;
    }

    protected EffectRestriction getRestriction() {
        return restriction;
    }

    protected EffectDuration getDuration() {
        return duration;
    }

    protected EffectNecessity getNecessity() {
        return necessity;
    }

    protected SelectionMethod getSelectionMethod() {
        return selectionMethod;
    }

    protected Selection getSelection() {
        return selection;
    }

    protected int getSelectionAmount() {
        return selectionAmount;
    }

    protected boolean isOrder() {
        return order;
    }

    protected boolean isCopiesOnly() {
        return copiesOnly;
    }

    protected void makeUserTriggered() {
        this.userTriggered = true;
    }

    protected boolean isUserTriggered() {
        return this.userTriggered;
    }

    protected boolean isBeginEngagement() {
        return beginEngagement;
    }
}
