package no.steria.fagdag.fitnesse;

import java.util.HashSet;
import java.util.Set;

import fit.RowEntryFixture;

public class RowEntryColorLinker extends RowEntryFixture {

	private Set<ColorLinker> colormappings = new HashSet<>();
	public String colorName, sRGB;
	
	@Override
	public void enterRow() throws Exception {
		ColorLinker colorLinker = new ColorLinker(colorName, sRGB);
		if(colormappings.contains(colorLinker)) {
			throw new RuntimeException("Already added " + colorLinker);
		}
		colormappings.add(colorLinker);
	}

}
