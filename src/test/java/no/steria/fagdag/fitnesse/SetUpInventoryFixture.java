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
		System.out.println(varenavn + ": " + pris);
		Vare vare = new Vare(varenavn, pris);
		webShop.registrerVare(vare);
		System.out.println(vare);
	}

}
