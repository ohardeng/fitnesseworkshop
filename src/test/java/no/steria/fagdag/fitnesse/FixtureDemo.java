package no.steria.fagdag.fitnesse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fit.ColumnFixture;
import fit.RowEntryFixture;
import fitlibrary.SetUpFixture;
import fitlibrary.SubsetFixture;
import fitlibrary.suite.SuiteFixture;

public class FixtureDemo extends SuiteFixture {
	private List<ListData> list = new ArrayList<>();

	public ColumnFixture subtraksjon() {
		return new SubtraksjonColumnFixture();
	}

	public SetUpFixture setUpColorLinker() {
		return new SetUpColorLinker();
	}

	public RowEntryFixture rowEntryColorLinker() {
		return new RowEntryColorLinker();
	}

	public SetUpFixture testDataForValideringAvLister() {
		list = new ArrayList<>();
		return new SetUpListData(list);
	}

	public Set<ListData> demonstrasjonAvSetFixture() {
		return new HashSet<ListData>(list);
	}

	public List<ListData> demonstrasjonAvArrayFixture() {
		return list;
	}

	public SubsetFixture demonstrasjonAvSubSetFixture() {
		return new SubsetFixture(list);
	}

	public String denneMetodenSetterSammenEtMedEtOrdDotShowViserReturverdienEtterDenSisteCellen(
			String s, String s2) {
		return s + " " + s2;
	}

	public String denneMetodenSetterSammenEtMedEtOrdDotCheckValidererReturverdienMotDenSisteCelleIRaden(
			String s1, String s2) {
		return s1 + " " + s2;
	}

	public void hvisDenNaturligeSetningsbygningenTilsierAtDetKommerEtterHverandreMuE5ManHaEnTomCelleSomHer(
			String arg1, String arg2) {
	}

	public boolean getEnMetodeSomReturnerTrueVilFargesGruF8nn() {
		return true;
	}

	public boolean getMensEnMetodeSomReturnerFalseVilFargesRuF8d() {
		return false;
	}

	public boolean negererSlikAtDenneSomReturnererFalseBlirGruF8nn() {
		return false;
	}
}
