package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik   {

	protected String imePrezime;
	 private ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	public Radnik(String inePrezime) {
		super();
		this.imePrezime = inePrezime;
	}
	public ArrayList<Sektor> getSektor() {
		return sektori;
	}
	public void setSektor(ArrayList<Sektor> sektor) {
		this.sektori = sektor;
	}
	public String getInePrezime() {
		return imePrezime;
	}
	
	
	
	
	
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public abstract double plata ();
	
	public void zaposliUSektor (Sektor sektor){
		sektori.add(sektor);
	}
	
	
	
	
	
	
	
}
