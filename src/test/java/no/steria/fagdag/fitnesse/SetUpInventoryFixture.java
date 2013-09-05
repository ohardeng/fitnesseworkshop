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
		Vare vare = new Vare(varenavn, pris, null);
		webShop.registrerVare(vare);
	}

	public void varenavnVekt(String varenavn, Double vekt) {
		Vare vare = new Vare(varenavn, null, vekt);
		webShop.registrerVare(vare);
	}

}
