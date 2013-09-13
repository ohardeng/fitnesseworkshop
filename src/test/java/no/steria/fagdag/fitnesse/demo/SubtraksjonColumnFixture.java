package no.steria.fagdag.fitnesse.demo;

import fit.ColumnFixture;
public class SubtraksjonColumnFixture extends ColumnFixture {
	public Double Minuend;
	public Double Subtrahend;
	public String Kommentar;

	public Double Differanse(){
		return Minuend-Subtrahend;
	}
}
