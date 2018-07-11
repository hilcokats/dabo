package nl.kats.dabo.dsl.cards;

public class DownloadBuilder<T extends CardType> {

    private final Effect<T> downloadEffect;
    private final Effect<T> additionalEffect;

    public DownloadBuilder(Effect<T> downloadEffect, Effect<T> additionalEffect) {
        this.downloadEffect = downloadEffect;
        this.additionalEffect = additionalEffect;
    }

    public DownloadBuilder<T> upTo(int amount) {
        this.downloadEffect.selectionAmount = amount;
        return this;
    }

    public DownloadBuilder<T> exactly(int amount) {
        this.downloadEffect.selectionAmount = amount;
        return this;
    }

    public Effect<T> anyCard() {
        return additionalEffect;
    }

    public Effect<T> card(String title) {
        this.downloadEffect.action = c -> c.your().hand()
                .add(c.selectedCards().stream().filter(t -> t.getName().equals(title)).findFirst().orElse(null));
        return additionalEffect;
    }

    public Effect<T> card(String title, String subtitle) {
        this.downloadEffect.action = c -> c.your().hand().add(c.selectedCards().stream()
                                                                      .filter(t -> t.getName().equals(title) &&
                                                                                   t.getSubtitle().equals(subtitle))
                                                                      .findFirst().orElse(null));
        return additionalEffect;
    }

    public Effect<T> anyPersonnel() {
        this.downloadEffect.selection = c -> c.your().deck().personnel();
        return additionalEffect;
    }

}
