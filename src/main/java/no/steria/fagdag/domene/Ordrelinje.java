package no.steria.fagdag.domene;


public class Ordrelinje {

	private Vare vare;
	private Integer antall;

	public Ordrelinje(Vare vare, Integer antall) {
		this.vare = vare;
		this.antall = antall;
	}
	
	public String getVarenavn() {
		return vare.getVarenavn();
	}
	
	public Integer getAntall() {
		return antall;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getClass().getSimpleName()).append("[")
				.append(vare).append(", ")
				.append("antall=").append(antall).append("]");
		return sb.toString();
	}

}
