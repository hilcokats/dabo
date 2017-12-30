package nl.kats.dabo.dsl;

import nl.kats.dabo.dsl.cards.CardType;
import nl.kats.dabo.dsl.cards.Taxoned;
import nl.kats.dabo.dsl.enums.Species;

import java.util.HashSet;

public final class SpeciesList<T extends CardType> extends HashSet<Species> implements Taxoned<T> {

	private static final long serialVersionUID = -8846989622983679147L;
	
	private final T card;

	public SpeciesList(T card) {
		this.card = card;
	}
	
	@Override
	public Taxoned<T> acamarian() {
		add(Species.ACAMARIAN);
		return this;
	}

	@Override
	public Taxoned<T> alien() {
		add(Species.ALIEN);
		return this;
	}

	@Override
	public Taxoned<T> andorian() {
		add(Species.ANDORIAN);
		return this;
	}

	@Override
	public Taxoned<T> android() {
		add(Species.ANDROID);
		return this;
	}

	@Override
	public Taxoned<T> angosian() {
		add(Species.ANGOSIAN);
		return this;
	}

	@Override
	public Taxoned<T> atrean() {
		add(Species.ATREAN);
		return this;
	}

	@Override
	public Taxoned<T> baku() {
		add(Species.BAKU);
		return this;
	}

	@Override
	public Taxoned<T> bajoran() {
		add(Species.BAJORAN);
		return this;
	}

	@Override
	public Taxoned<T> bandi() {
		add(Species.BANDI);
		return this;
	}

	@Override
	public Taxoned<T> barzan() {
		add(Species.BARZAN);
		return this;
	}

	@Override
	public Taxoned<T> benzite() {
		add(Species.BENZITE);
		return this;
	}

	@Override
	public Taxoned<T> betazoid() {
		add(Species.BETAZOID);
		return this;
	}

	@Override
	public Taxoned<T> bolian() {
		add(Species.BOLIAN);
		return this;
	}

	@Override
	public Taxoned<T> borg() {
		add(Species.BORG);
		return this;
	}

	@Override
	public Taxoned<T> breen() {
		add(Species.BREEN);
		return this;
	}

	@Override
	public Taxoned<T> brekkian() {
		add(Species.BREKKIAN);
		return this;
	}

	@Override
	public Taxoned<T> bynar() {
		add(Species.BYNAR);
		return this;
	}

	@Override
	public Taxoned<T> cairn() {
		add(Species.CAIRN);
		return this;
	}

	@Override
	public Taxoned<T> caldonian() {
		add(Species.CALDONIAN);
		return this;
	}

	@Override
	public Taxoned<T> cardassian() {
		add(Species.CARDASSIAN);
		return this;
	}

	@Override
	public Taxoned<T> chameloid() {
		add(Species.CHAMELOID);
		return this;
	}

	@Override
	public Taxoned<T> changeling() {
		add(Species.CHANGELING);
		return this;
	}

	@Override
	public Taxoned<T> deltan() {
		add(Species.DELTAN);
		return this;
	}

	@Override
	public Taxoned<T> denobulan() {
		add(Species.DENOBULAN);
		return this;
	}

	@Override
	public Taxoned<T> dosi() {
		add(Species.DOSI);
		return this;
	}

	@Override
	public Taxoned<T> elAurian() {
		add(Species.ELAURIAN);
		return this;
	}

	@Override
	public Taxoned<T> elaysian() {
		add(Species.ELAYSIAN);
		return this;
	}

	@Override
	public Taxoned<T> farian() {
		add(Species.FARIAN);
		return this;
	}

	@Override
	public Taxoned<T> ferengi() {
		add(Species.FERENGI);
		return this;
	}

	@Override
	public Taxoned<T> flaxian() {
		add(Species.FLAXIAN);
		return this;
	}

	@Override
	public Taxoned<T> gorn() {
		add(Species.GORN);
		return this;
	}

	@Override
	public Taxoned<T> grazerite() {
		add(Species.GRAZERITE);
		return this;
	}

	@Override
	public Taxoned<T> hekaran() {
		add(Species.HEKARAN);
		return this;
	}

	@Override
	public Taxoned<T> hirogen() {
		add(Species.HIROGEN);
		return this;
	}

	@Override
	public Taxoned<T> hologram() {
		add(Species.HOLOGRAM);
		return this;
	}

	@Override
	public Taxoned<T> human() {
		add(Species.HUMAN);
		return this;
	}

	@Override
	public Taxoned<T> hupyrian() {
		add(Species.HUPYRIAN);
		return this;
	}

	@Override
	public Taxoned<T> idanian() {
		add(Species.IDANIAN);
		return this;
	}

	@Override
	public Taxoned<T> jemHadar() {
		add(Species.JEMHADAR);
		return this;
	}

	@Override
	public Taxoned<T> karemma() {
		add(Species.KAREMMA);
		return this;
	}

	@Override
	public Taxoned<T> kellerun() {
		add(Species.KELLERUN);
		return this;
	}

	@Override
	public Taxoned<T> klingon() {
		add(Species.KLINGON);
		return this;
	}

	@Override
	public Taxoned<T> kobliad() {
		add(Species.KOBLIAD);
		return this;
	}

	@Override
	public Taxoned<T> kreetassan() {
		add(Species.KREETASSAN);
		return this;
	}

	@Override
	public Taxoned<T> krenim() {
		add(Species.KRENIM);
		return this;
	}

	@Override
	public Taxoned<T> kriosian() {
		add(Species.KRIOSIAN);
		return this;
	}

	@Override
	public Taxoned<T> ktarian() {
		add(Species.KTARIAN);
		return this;
	}

	@Override
	public Taxoned<T> lethean() {
		add(Species.LETHEAN);
		return this;
	}

	@Override
	public Taxoned<T> lurian() {
		add(Species.LURIAN);
		return this;
	}

	@Override
	public Taxoned<T> malon() {
		add(Species.MALON);
		return this;
	}

	@Override
	public Taxoned<T> mari() {
		add(Species.MARI);
		return this;
	}

	@Override
	public Taxoned<T> markalian() {
		add(Species.MARKALIAN);
		return this;
	}

	@Override
	public Taxoned<T> minaran() {
		add(Species.MINARAN);
		return this;
	}

	@Override
	public Taxoned<T> norcadian() {
		add(Species.NORCADIAN);
		return this;
	}

	@Override
	public Taxoned<T> ocampa() {
		add(Species.OCAMPA);
		return this;
	}

	@Override
	public Taxoned<T> orion() {
		add(Species.ORION);
		return this;
	}

	@Override
	public Taxoned<T> ornaran() {
		add(Species.ORNARAN);
		return this;
	}

	@Override
	public Taxoned<T> pakled() {
		add(Species.PAKLED);
		return this;
	}

	@Override
	public Taxoned<T> pendari() {
		add(Species.PENDARI);
		return this;
	}

	@Override
	public Taxoned<T> rakhari() {
		add(Species.RAKHARI);
		return this;
	}

	@Override
	public Taxoned<T> ramatin() {
		add(Species.RAMATIN);
		return this;
	}

	@Override
	public Taxoned<T> reman() {
		add(Species.REMAN);
		return this;
	}

	@Override
	public Taxoned<T> risan() {
		add(Species.RISAN);
		return this;
	}

	@Override
	public Taxoned<T> romulan() {
		add(Species.ROMULAN);
		return this;
	}

	@Override
	public Taxoned<T> satarran() {
		add(Species.SATARRAN);
		return this;
	}

	@Override
	public Taxoned<T> solari() {
		add(Species.SOLARI);
		return this;
	}

	@Override
	public Taxoned<T> suliban() {
		add(Species.SULIBAN);
		return this;
	}

	@Override
	public Taxoned<T> tLani() {
		add(Species.TLANI);
		return this;
	}

	@Override
	public Taxoned<T> takaran() {
		add(Species.TAKARAN);
		return this;
	}

	@Override
	public Taxoned<T> talaxian() {
		add(Species.TALAXIAN);
		return this;
	}

	@Override
	public Taxoned<T> tamarian() {
		add(Species.TAMARIAN);
		return this;
	}

	@Override
	public Taxoned<T> tanugan() {
		add(Species.TANUGAN);
		return this;
	}

	@Override
	public Taxoned<T> tellarite() {
		add(Species.TELLARITE);
		return this;
	}

	@Override
	public Taxoned<T> tiburonian() {
		add(Species.TIBURONIAN);
		return this;
	}

	@Override
	public Taxoned<T> tosk() {
		add(Species.TOSK);
		return this;
	}

	@Override
	public Taxoned<T> trill() {
		add(Species.TRILL);
		return this;
	}

	@Override
	public Taxoned<T> ullian() {
		add(Species.ULLIAN);
		return this;
	}

	@Override
	public Taxoned<T> ventaxian() {
		add(Species.VENTAXIAN);
		return this;
	}

	@Override
	public Taxoned<T> vorgon() {
		add(Species.VORGON);
		return this;
	}

	@Override
	public Taxoned<T> vorta() {
		add(Species.VORTA);
		return this;
	}

	@Override
	public Taxoned<T> vulcan() {
		add(Species.VULCAN);
		return this;
	}

	@Override
	public Taxoned<T> wadi() {
		add(Species.WADI);
		return this;
	}

	@Override
	public Taxoned<T> yridian() {
		add(Species.YRIDIAN);
		return this;
	}

	@Override
	public Taxoned<T> zakdorn() {
		add(Species.ZAKDORN);
		return this;
	}

	@Override
	public Taxoned<T> zalkonian() {
		add(Species.ZALKONIAN);
		return this;
	}

	@Override
	public Taxoned<T> zibalian() {
		add(Species.ZIBALIAN);
		return this;
	}

	@Override
	public T end() {
		return card;
	}

}
