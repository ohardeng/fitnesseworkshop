package no.steria.fagdag.fitnesse;

import java.util.List;

import fitlibrary.SetUpFixture;

public class SetUpListData extends SetUpFixture {
	List<ListData> list;
	
	public SetUpListData(List<ListData> list) {
		this.list = list;
	}

	public void kjuF8retuF8ytypeAntallHjulMotortypeFarge(String kjuF8retuF8ytype,
			Integer antallHjul, String motortype, String farge) {
		list.add(new ListData(kjuF8retuF8ytype, antallHjul, motortype, farge));
	}
}

class ListData {

	private String kjuF8retuF8ytype;
	private Integer antallHjul;
	private String motortype;
	private String farge;

	public ListData(String kjuF8retuF8ytype, Integer antallHjul, String motortype, String farge) {
		this.kjuF8retuF8ytype = kjuF8retuF8ytype;
		this.antallHjul = antallHjul;
		this.motortype = motortype;
		this.farge = farge;
	}

}
