package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.Action;
import nl.kats.dabo.dsl.cards.personnel.PersonnelCard;

import java.util.stream.Collectors;

public abstract class CardBuilderSupport {

    private Action addSkills(CardCollection<PersonnelCard> personnel) {
        return c -> {
            //TODO c.selectedCards().personnel().forEach(personnelCard -> personnelCard.adjustSkills(personnel
            // .getSkills()));
            return true;
        };
    }

    protected Action addIntegrity(int integrity) {
        return c -> {
            c.selectedCards().personnel().forEach(personnel -> personnel.adjustIntegrity(integrity));
            return true;
        };
    }

    protected Action addCunning(int cunning) {
        return c -> {
            c.selectedCards().personnel().forEach(personnel -> personnel.adjustStrength(cunning));
            return true;
        };
    }

    protected Action addStrength(int strength) {
        return c -> {
            c.selectedCards().personnel().forEach(personnel -> personnel.adjustStrength(strength));
            return true;
        };
    }

    protected Action addRange(int range) {
        return c -> {
            c.selectedCards().ships().forEach(ship -> ship.adjustRange(range));
            return true;
        };
    }

    protected Action addWeapons(int weapons) {
        return c -> {
            c.selectedCards().ships().forEach(ship -> ship.adjustWeapons(weapons));
            return true;
        };
    }

    protected Action addShields(int shields) {
        return c -> {
            c.selectedCards().ships().forEach(ship -> ship.adjustShields(shields));
            return true;
        };
    }

    protected Action download(String cardName) {
        return c -> {
            var first = c.your().deck().stream()
                    .filter(card -> card.getName().equals(cardName))
                    .findFirst();

            first.ifPresent(card -> c.your().deck().remove(card));

            c.your().hand().add(first.get());
            return true;
        };
    }

    protected Action downloadSelected() {
        return context -> context.your().hand().addAll(context.selectedCards());
    }

    protected Action discardSelected() {
        return context -> context.your().discardPile().addAll(context.selectedCards());
    }

    protected Action removeSelectedFromGame() {
        return context -> context.your().removedFromGame().addAll(context.selectedCards());
    }

    protected Action drawSelected() {
        return context -> context.your().hand().addAll(context.selectedCards());
    }

    protected Action moveSelectedToOwnersHand() {
        return context ->
                context.your().hand()
                        .addAll(context.selectedCards().stream().filter(c -> c.owner().equals(context.you()))
                                        .collect(Collectors.toList())) &&
                context.opponents().hand()
                        .addAll(context.selectedCards().stream().filter(c -> c.owner().equals(context.opponent()))
                                        .collect(Collectors.toList()));
    }

    protected Action joinEngagement() {
        return c -> c.engagement().join(c.selectedCards().ships());
    }

    protected Action joinCombat() {
        return c -> c.combat().join(c.selectedCards().personnel());
    }
}
