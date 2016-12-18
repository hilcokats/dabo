package nl.kats.dabo.dsl;

import java.util.HashSet;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.enums.Keyword;
import nl.kats.dabo.dsl.cards.Described;

public class KeywordList<T extends CardType> extends HashSet<Keyword> implements Described<T> {

	private static final long serialVersionUID = 873623546385075465L;

	private final T card;

	public KeywordList(T card) {
		this.card = card;
	}

	@Override
	public Described<T> admiral() {
		add(Keyword.ADMIRAL);
		return this;
	}

	@Override
	public Described<T> alpha() {
		add(Keyword.ALPHA);
		return this;
	}

	@Override
	public Described<T> artifact() {
		add(Keyword.ARTIFACT);
		return this;
	}

	@Override
	public Described<T> assassin() {
		add(Keyword.ASSASSIN);
		return this;
	}

	@Override
	public Described<T> assault() {
		add(Keyword.ASSAULT);
		return this;
	}

	@Override
	public Described<T> bajoranResistance() {
		add(Keyword.BAJORAN_RESISTANCE);
		return this;
	}

	@Override
	public Described<T> bluegill() {
		add(Keyword.BLUEGILL);
		return this;
	}

	@Override
	public Described<T> cadet() {
		add(Keyword.CADET);
		return this;
	}

	@Override
	public Described<T> capture() {
		add(Keyword.CAPTURE);
		return this;
	}

	@Override
	public Described<T> chancellor() {
		add(Keyword.CHANCELLOR);
		return this;
	}

	@Override
	public Described<T> cloakingDevice() {
		add(Keyword.CLOAKING_DEVICE);
		return this;
	}

	@Override
	public Described<T> commander() {
		add(Keyword.COMMANDER);
		return this;
	}

	@Override
	public Described<T> commodity() {
		add(Keyword.COMMODITY);
		return this;
	}

	@Override
	public Described<T> consume() {
		add(Keyword.CONSUME);
		return this;
	}

	@Override
	public Described<T> crime() {
		add(Keyword.CRIME);
		return this;
	}

	@Override
	public Described<T> daboGirl() {
		add(Keyword.DABOGIRL);
		return this;
	}

	@Override
	public Described<T> decay() {
		add(Keyword.DECAY);
		return this;
	}

	@Override
	public Described<T> dissident() {
		add(Keyword.DISSIDENT);
		return this;
	}

	@Override
	public Described<T> drone() {
		add(Keyword.DRONE);
		return this;
	}

	@Override
	public Described<T> founder() {
		add(Keyword.FOUNDER);
		return this;
	}

	@Override
	public Described<T> gatherer() {
		add(Keyword.GATHERER);
		return this;
	}

	@Override
	public Described<T> general() {
		add(Keyword.GENERAL);
		return this;
	}

	@Override
	public Described<T> geneticallyEnhanced() {
		add(Keyword.GENETICALLY_ENHANCED);
		return this;
	}

	@Override
	public Described<T> glinn() {
		add(Keyword.GLINN);
		return this;
	}

	@Override
	public Described<T> gul() {
		add(Keyword.GUL);
		return this;
	}

	@Override
	public Described<T> handWeapon() {
		add(Keyword.HAND_WEAPON);
		return this;
	}

	@Override
	public Described<T> highCouncilMember() {
		add(Keyword.HIGH_COUNCIL_MEMBER);
		return this;
	}

	@Override
	public Described<T> holoprogram() {
		add(Keyword.HOLOPROGRAM);
		return this;
	}

	@Override
	public Described<T> host() {
		add(Keyword.HOST);
		return this;
	}

	@Override
	public Described<T> infiltration() {
		add(Keyword.INFILTRATION);
		return this;
	}

	@Override
	public Described<T> infiltrator() {
		add(Keyword.INFILTRATOR);
		return this;
	}

	@Override
	public Described<T> interlink() {
		add(Keyword.INTERLINK);
		return this;
	}

	@Override
	public Described<T> kai() {
		add(Keyword.KAI);
		return this;
	}

	@Override
	public Described<T> legate() {
		add(Keyword.LEGATE);
		return this;
	}

	@Override
	public Described<T> maco() {
		add(Keyword.MACO);
		return this;
	}

	@Override
	public Described<T> maneuver() {
		add(Keyword.MANEUVER);
		return this;
	}

	@Override
	public Described<T> morph() {
		add(Keyword.MORPH);
		return this;
	}

	@Override
	public Described<T> nebula() {
		add(Keyword.NEBULA);
		return this;
	}

	@Override
	public Described<T> nucleogenic() {
		add(Keyword.NUCLEOGENIC);
		return this;
	}

	@Override
	public Described<T> orb() {
		add(Keyword.ORB);
		return this;
	}

	@Override
	public Described<T> pahWraith() {
		add(Keyword.PAH_WRAITH);
		return this;
	}

	@Override
	public Described<T> paranoia() {
		add(Keyword.PARANOIA);
		return this;
	}

	@Override
	public Described<T> persistent() {
		add(Keyword.PERSISTENT);
		return this;
	}

	@Override
	public Described<T> praetor() {
		add(Keyword.PRAETOR);
		return this;
	}

	@Override
	public Described<T> prophet() {
		add(Keyword.PROPHET);
		return this;
	}

	@Override
	public Described<T> prylar() {
		add(Keyword.PRYLAR);
		return this;
	}

	@Override
	public Described<T> punishment() {
		add(Keyword.PUNISHMENT);
		return this;
	}

	@Override
	public Described<T> pursuit() {
		add(Keyword.PURSUIT);
		return this;
	}

	@Override
	public Described<T> q() {
		add(Keyword.Q);
		return this;
	}

	@Override
	public Described<T> recall() {
		add(Keyword.RECALL);
		return this;
	}

	@Override
	public Described<T> region() {
		add(Keyword.REGION);
		return this;
	}

	@Override
	public Described<T> replicate() {
		add(Keyword.REPLICATE);
		return this;
	}

	@Override
	public Described<T> ritual() {
		add(Keyword.RITUAL);
		return this;
	}

	@Override
	public Described<T> rule() {
		add(Keyword.RULE);
		return this;
	}

	@Override
	public Described<T> senator() {
		add(Keyword.SENATOR);
		return this;
	}

	@Override
	public Described<T> shapeShifter() {
		add(Keyword.SHAPESHIFTER);
		return this;
	}

	@Override
	public Described<T> smuggler() {
		add(Keyword.SMUGGLER);
		return this;
	}

	@Override
	public Described<T> species8472() {
		add(Keyword.SPECIES_8472);
		return this;
	}

	@Override
	public Described<T> temporal() {
		add(Keyword.TEMPORAL);
		return this;
	}

	@Override
	public Described<T> thief() {
		add(Keyword.THIEF);
		return this;
	}

	@Override
	public Described<T> tsunkatse() {
		add(Keyword.TSUNKATSE);
		return this;
	}

	@Override
	public Described<T> vedek() {
		add(Keyword.VEDEK);
		return this;
	}

	@Override
	public Described<T> waiter() {
		add(Keyword.WAITER);
		return this;
	}

	@Override
	public T end() {
		return card;
	}

}
