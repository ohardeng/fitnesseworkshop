package no.steria.fagdag.domene;

public class Vare {

	private String varenavn;
	private Double pris;

	public Vare(String varenavn, Double pris) {
		this.varenavn = varenavn;
		this.pris = pris;
	}

	public Vare(String varenavn) {
		this(varenavn, null);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + "varenavn=" + varenavn + ", "
				+ "pris=" + pris + "]";
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
