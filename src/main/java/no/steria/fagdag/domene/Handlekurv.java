package no.steria.fagdag.domene;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Handlekurv {
	private Map<Vare, Integer> varer = new HashMap<>();
	Set<Ordrelinje> ordrelinjer = new HashSet<>();
	private WebShop webShop;

	public Handlekurv(WebShop webShop) {
		this.webShop = webShop;
	}

	public void leggVareIHandlekurven(Vare vare) {
		leggVareIHandlekurven(vare, 1);
	}

	public boolean leggVareIHandlekurven(Vare vare, Integer antall) {
		if (webShop.contains(vare)) {
			vare = webShop.get(vare);
			if (!varer.containsKey(vare)) {
				varer.put(vare, 0);
			}
			varer.put(vare, varer.get(vare) + antall);
			ordrelinjer = new HashSet<>();
			return true;
		} else {
			return false;
		}
	}

	public Map<Vare, Integer> innehold() {
		return varer;
	}

	public Double sum() {
		Double sum = 0d;
		for (Ordrelinje ordrelinje : getOrdrelinjer()) {
			sum += ordrelinje.getSum();
		}
		return sum;
	}

	public Set<Ordrelinje> getOrdrelinjer() {
		if (varer.size() != ordrelinjer.size()) {
			ordrelinjer = new HashSet<>();
			for (Vare vare : varer.keySet()) {
				ordrelinjer.add(new Ordrelinje(vare, varer.get(vare)));
			}
		}
		return ordrelinjer;

	}
}
