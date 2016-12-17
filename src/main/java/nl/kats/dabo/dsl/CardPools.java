package nl.kats.dabo.dsl;

import java.util.HashSet;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.enums.TableArea;

public class CardPools<T extends CardType> extends HashSet<CardPool> {

	private static final long serialVersionUID = 9149830978248996028L;

	private final T card;
	
	public CardPools(T card) {
		this.card = card;
	}
	
	public CardPools<T> core() {
		add(TableArea.CORE);
		return this;
	}

	public T end() {
		return card;
	}
	
}
