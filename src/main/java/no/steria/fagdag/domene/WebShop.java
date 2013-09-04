package no.steria.fagdag.domene;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WebShop {
	private Map<Vare, Vare> varer = new HashMap<>();
	
	public void registrerVare(Vare vare) {
		varer.put(vare, vare);
	}
	
	public  Set<Vare> getRegistrerteVarer() {
		return varer.keySet();
	}
	
	public void fjernRegistrerteVarer(){
		varer.clear();
	}

	public boolean contains(Vare vare) {
		return varer.keySet().contains(vare);
	}

	public Vare get(Vare vare) {
		return varer.get(vare);
	}

}
