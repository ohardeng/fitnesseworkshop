package no.steria.fagdag.fitnesse;

import java.util.HashSet;
import java.util.Set;

import fitlibrary.SetUpFixture;

public class SetUpColorLinker extends SetUpFixture {
	
	private Set<ColorLinker> colormappings = new HashSet<>();

	public void colorNameSRGB(String colorName, String sRGB) {
		ColorLinker colorLinker = new ColorLinker(colorName, sRGB);
		if(colormappings.contains(colorLinker)) {
			throw new RuntimeException("Already added " + colorLinker);
		}
		colormappings.add(colorLinker);
	}

}
