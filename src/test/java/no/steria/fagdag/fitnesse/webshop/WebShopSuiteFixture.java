package no.steria.fagdag.fitnesse.webshop;

import java.util.Set;

import no.steria.fagdag.domene.Handlekurv;
import no.steria.fagdag.domene.Ordrelinje;
import fit.ColumnFixture;
import fitlibrary.suite.SuiteFixture;

public class WebShopSuiteFixture extends SuiteFixture {
	private Handlekurv handlekurv;

	public ColumnFixture handlekurv() {
		handlekurv = new Handlekurv();
		return new HandleKurvColumnFixture(handlekurv);
	}

	public Set<Ordrelinje> visHandlekurv() {
		return handlekurv.getOrdrelinjer();
	}
}
