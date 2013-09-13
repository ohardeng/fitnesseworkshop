package no.steria.fagdag.fitnesse.demo;

public class ColorLinker {

	private String colorName;
	private String sRGB;

	public ColorLinker(String colorName, String sRGB) {
		this.colorName = colorName;
		this.sRGB = sRGB;
	}

	@Override
	public String toString() {
		return "ColorLinker [colorName=" + colorName + ", sRGB=" + sRGB + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((colorName == null) ? 0 : colorName.hashCode());
		result = prime * result + ((sRGB == null) ? 0 : sRGB.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColorLinker other = (ColorLinker) obj;
		if (colorName == null) {
			if (other.colorName != null)
				return false;
		} else if (!colorName.equals(other.colorName))
			return false;
		if (sRGB == null) {
			if (other.sRGB != null)
				return false;
		} else if (!sRGB.equals(other.sRGB))
			return false;
		return true;
	}
	
}
