package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.cards.Skilled;
import nl.kats.dabo.dsl.enums.Skill;

import java.util.ArrayList;

public final class SkillList<T extends CardType> extends ArrayList<Skill> implements Skilled<T> {

	private static final long serialVersionUID = 4076212054456516514L;

	private final T card;

	public SkillList(T card) {
		this.card = card;
	}
	
	@Override
	public Skilled<T> acquisition() {
		add(Skill.ACQUISITION);
		return this;
	}

	@Override
	public Skilled<T> anthropology() {
		add(Skill.ANTHROPOLOGY);
		return this;
	}

	@Override
	public Skilled<T> archaeology() {
		add(Skill.ARCHAEOLOGY);
		return this;
	}

	@Override
	public Skilled<T> astrometrics() {
		add(Skill.ASTROMETRICS);
		return this;
	}

	@Override
	public Skilled<T> biology() {
		add(Skill.BIOLOGY);
		return this;
	}

	@Override
	public Skilled<T> diplomacy() {
		add(Skill.DIPLOMACY);
		return this;
	}

	@Override
	public Skilled<T> engineer() {
		add(Skill.ENGINEER);
		return this;
	}

	@Override
	public Skilled<T> exobiology() {
		add(Skill.EXOBIOLOGY);
		return this;
	}

	@Override
	public Skilled<T> geology() {
		add(Skill.GEOLOGY);
		return this;
	}

	@Override
	public Skilled<T> honor() {
		add(Skill.HONOR);
		return this;
	}

	@Override
	public Skilled<T> intelligence() {
		add(Skill.INTELLIGENCE);
		return this;
	}

	@Override
	public Skilled<T> law() {
		add(Skill.LAW);
		return this;
	}

	@Override
	public Skilled<T> leadership() {
		add(Skill.LEADERSHIP);
		return this;
	}

	@Override
	public Skilled<T> medical() {
		add(Skill.MEDICAL);
		return this;
	}

	@Override
	public Skilled<T> navigation() {
		add(Skill.NAVIGATION);
		return this;
	}

	@Override
	public Skilled<T> officer() {
		add(Skill.OFFICER);
		return this;
	}

	@Override
	public Skilled<T> physics() {
		add(Skill.PHYSICS);
		return this;
	}

	@Override
	public Skilled<T> programming() {
		add(Skill.PROGRAMMING);
		return this;
	}

	@Override
	public Skilled<T> science() {
		add(Skill.SCIENCE);
		return this;
	}

	@Override
	public Skilled<T> security() {
		add(Skill.SECURITY);
		return this;
	}

	@Override
	public Skilled<T> telepathy() {
		add(Skill.TELEPATHY);
		return this;
	}

	@Override
	public Skilled<T> transporters() {
		add(Skill.TRANSPORTERS);
		return this;
	}

	@Override
	public Skilled<T> treachery() {
		add(Skill.TREACHERY);
		return this;
	}

	@Override
	public T end() {
		return card;
	}

}
