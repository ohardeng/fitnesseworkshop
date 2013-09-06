package no.steria.fagdag.domene;

import static java.lang.Math.max;
import static java.lang.Math.min;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Handlekurv {
	private static final int FØRSTE_VEKTGRENSE = 10;
	private static final int ANDRE_VEKTGRENSE = 25;
	private static final int TREDJE_VEKTGRENSE = Integer.MAX_VALUE;
	private static final int PRIS_FØRSTE_VEKTGRENSE = 10;
	private static final int PRIS_ANDRE_VEKTGRENSE = 5;
	private static final int PRIS_TREDJE_VEKTGRENSE = 2;
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

	public Integer fraktKostnad() {
		if(sum() > 500){
			return 0;
		}
		Double totalVekt = 0d;
		for (Ordrelinje ordrelinje : getOrdrelinjer()) {
			totalVekt += ordrelinje.getVekt();
		}
		Integer fraktvekt = totalVekt.intValue();
		Integer kostnad = min(fraktvekt,FØRSTE_VEKTGRENSE)*PRIS_FØRSTE_VEKTGRENSE;
		System.out.println(kostnad);
		kostnad += min(max(0,fraktvekt-FØRSTE_VEKTGRENSE),ANDRE_VEKTGRENSE)*PRIS_ANDRE_VEKTGRENSE;
		System.out.println(kostnad);
		kostnad += min(max(0,fraktvekt-FØRSTE_VEKTGRENSE-ANDRE_VEKTGRENSE),TREDJE_VEKTGRENSE)*PRIS_TREDJE_VEKTGRENSE;
		System.out.println(kostnad);
		return kostnad;
	}
}
