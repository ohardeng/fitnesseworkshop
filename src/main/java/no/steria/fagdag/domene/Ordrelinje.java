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
	
	public Double getPris() {
		return vare.getPris();
	}
	
	public Integer getAntall() {
		return antall;
	}
	
	public Double getSum() {
		return getPris()*getAntall();
	}

	public Double getVekt() {
		return vare.getVekt()*getAntall();
	}

}
