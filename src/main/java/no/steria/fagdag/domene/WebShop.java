package no.steria.fagdag.domene;

import java.util.HashSet;
import java.util.Set;

public class WebShop {
	private Set<Vare> varer = new HashSet<>();
	
	public void registrerVare(Vare vare) {
		varer.add(vare);
	}
	
	public  Set<Vare> getRegistrerteVarer() {
		return varer;
	}
	
	public void fjernRegistrerteVarer(){
		varer.clear();
	}

	public boolean contains(Vare vare) {
		return varer.contains(vare);
	}

}
