package no.steria.fagdag.fitnesse;

import java.util.Map;

import no.steria.fagdag.domene.Handlekurv;
import no.steria.fagdag.domene.Vare;
import no.steria.fagdag.domene.WebShop;
import fit.ColumnFixture;
import fitlibrary.SetUpFixture;
import fitlibrary.suite.SuiteFixture;

public class WebShopSuiteFixture extends SuiteFixture {
	private WebShop webShop = new WebShop();
	private Handlekurv handlekurv;
	
	public WebShopSuiteFixture() {
		System.out.println("Hellu");
		setSystemUnderTest(webShop);
	}
	
	public SetUpFixture registrerVarer(){
		return new SetUpInventoryFixture(webShop); 
	}
	
	public ColumnFixture handlekurv() {
		handlekurv = new Handlekurv(webShop);
		return new HandleKurvColumnFixture(handlekurv);
	}
	
	public Map<Vare, Integer> handlekurvenInneholderNuE5() {
		return handlekurv.innehold();
}
	
}
