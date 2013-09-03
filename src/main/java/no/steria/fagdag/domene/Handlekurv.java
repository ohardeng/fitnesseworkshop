package no.steria.fagdag.domene;

import java.util.HashMap;
import java.util.Map;

public class Handlekurv {
	private Map<Vare, Integer> varer = new HashMap<>();
	private WebShop webShop;

	public Handlekurv(WebShop webShop) {
		this.webShop = webShop;
	}

	public void leggVareIHandlekurven(Vare vare) {
		leggVareIHandlekurven(vare, 1);
	}

	public boolean leggVareIHandlekurven(Vare vare, Integer antall) {
		if (webShop.contains(vare)) {
			if (!varer.containsKey(vare)) {
				varer.put(vare, 0);
			}
			varer.put(vare, varer.get(vare) + antall);
			return true;
		} else {
			return false;
		}
	}

	public Map<Vare, Integer> innehold() {
		return varer;
	}
}
