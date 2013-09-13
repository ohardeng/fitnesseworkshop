package no.steria.fagdag.fitnesse.webshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import no.steria.fagdag.domene.Handlekurv;
import no.steria.fagdag.domene.Ordrelinje;
import no.steria.fagdag.domene.Vare;
import no.steria.fagdag.domene.WebShop;
import fit.ColumnFixture;
import fit.RowEntryFixture;
import fitlibrary.SetUpFixture;
import fitlibrary.SubsetFixture;
import fitlibrary.suite.SuiteFixture;
import fitlibrary.traverse.FitLibrarySelector;

public class WebShopSuiteFixture extends SuiteFixture {
	private WebShop webShop = new WebShop();
	private Handlekurv handlekurv;

	public WebShopSuiteFixture() {
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
	
	public void leggIHandlekurven(Integer antall, Vare vare) {
		handlekurv.leggVareIHandlekurven(vare, antall);
	}
}
