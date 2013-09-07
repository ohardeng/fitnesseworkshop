package no.steria.fagdag.fitnesse;

import java.util.Map;
import java.util.Set;

import no.steria.fagdag.domene.Handlekurv;
import no.steria.fagdag.domene.Ordrelinje;
import no.steria.fagdag.domene.Vare;
import no.steria.fagdag.domene.WebShop;
import fit.ColumnFixture;
import fit.RowEntryFixture;
import fitlibrary.SetUpFixture;
import fitlibrary.suite.SuiteFixture;

public class WebShopSuiteFixture extends SuiteFixture {
	private WebShop webShop = new WebShop();
	private Handlekurv handlekurv;

	public ColumnFixture subtraksjon() { 
		return new SubtraksjonColumnFixture();
	}
	
	public SetUpFixture setUpColorLinker() {
		return new SetUpColorLinker();
	}
	
	public RowEntryFixture rowEntryColorLinker() {
		return new RowEntryColorLinker();
	}
	
	public WebShopSuiteFixture() {
		System.out.println("Hellu");
		setSystemUnderTest(webShop);
	}

	public SetUpFixture registrerVarer() {
		return new SetUpInventoryFixture(webShop);
	}

	public ColumnFixture handlekurv() {
		handlekurv = new Handlekurv(webShop);
		return new HandleKurvColumnFixture(handlekurv);
	}

	public Map<Vare, Integer> handlekurvenInneholderNuE5() {
		return handlekurv.innehold();
	}

	public Set<Ordrelinje> visHandlekurv() {
		return handlekurv.getOrdrelinjer();
	}

	public Double totalsumIHandlekurven() {
		return handlekurv.sum();
	}
	
	public Integer fraktKostnad() {
		return handlekurv.fraktKostnad();
	}
	
	public void nyHandlekurv(){
		handlekurv = new Handlekurv(webShop);
	}
	
	public void leggStkIHandlekurven(Integer antall, Vare vare) {
		handlekurv.leggVareIHandlekurven(vare, antall);
	}

}
