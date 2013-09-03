package no.steria.fagdag.fitnesse;

import no.steria.fagdag.domene.Vare;
import no.steria.fagdag.domene.WebShop;
import fitlibrary.SetUpFixture;

public class SetUpInventoryFixture extends SetUpFixture {

	private WebShop webShop;

	public SetUpInventoryFixture(WebShop webShop) {
		this.webShop = webShop;
	}
	
	public void varenavnPris(String varenavn, Double pris) {
		webShop.registrerVare(new Vare(varenavn, pris));
	}

}
