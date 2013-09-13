package no.steria.fagdag.domene;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Handlekurv {

	private Map<Vare, Integer> varer = new HashMap<>();
	Set<Ordrelinje> ordrelinjer = new HashSet<>();

	public boolean leggVareIHandlekurven(Vare vare, Integer antall) {
			if (!varer.containsKey(vare)) {
				varer.put(vare, 0);
			}
			varer.put(vare, varer.get(vare) + antall);
			return true;
	}

	public Map<Vare, Integer> innehold() {
		return varer;
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
