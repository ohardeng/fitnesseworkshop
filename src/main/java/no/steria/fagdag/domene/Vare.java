package no.steria.fagdag.domene;

public class Vare {

	private String varenavn;
	private Double pris;
	private Double vekt;

	public Vare(String varenavn, Double pris, Double vekt) {
		this.varenavn = varenavn;
		this.pris = pris;
		this.vekt = vekt;
	}

	public Vare(String varenavn) {
		this(varenavn, null, null);
	}
	
	public String getVarenavn() {
		return varenavn;
	}
	
	public Double getPris() {
		return pris;
	}

	public Double getVekt() {
		return vekt;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getClass().getSimpleName()).append("[")
				.append("varenavn=").append(varenavn).append(", ")
				.append("pris=").append(pris).append(", ")
				.append("vekt=").append(vekt).append("]");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((varenavn == null) ? 0 : varenavn.hashCode());
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
		Vare other = (Vare) obj;
		if (varenavn == null) {
			if (other.varenavn != null)
				return false;
		} else if (!varenavn.equals(other.varenavn))
			return false;
		return true;
	}

}
