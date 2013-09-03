package no.steria.fagdag.fitnesse;

import no.steria.fagdag.domene.Handlekurv;
import no.steria.fagdag.domene.Vare;
import fit.ColumnFixture;

public class HandleKurvColumnFixture extends ColumnFixture {
	private Handlekurv handlekurv;

	Integer Antall;
	String Varenavn;

	public HandleKurvColumnFixture(Handlekurv handlekurv) {
		this.handlekurv = handlekurv;
	}

	public String leggIhandlekurven() {
		if (handlekurv.leggVareIHandlekurven(new Vare(Varenavn), Antall)) {
			return Antall + " " + Varenavn + " " + "lagt i handlekurven";
		}
		return Varenavn + " er ikke registrert i butikken.";
	}

}
