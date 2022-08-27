package d25_08_2022;

import java.util.ArrayList;

public class Student {

	private String brojIndeksa;
	private String imePrezimeStudenta;
	private String tipStudija;

	ArrayList<Ispit> ispit = new ArrayList();

	public Student() {
		super();
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public String getImePrezimeStudenta() {
		return imePrezimeStudenta;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public ArrayList<Ispit> getIspit() {
		return ispit;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public void setImePrezimeStudenta(String imePrezimeStudenta) {
		this.imePrezimeStudenta = imePrezimeStudenta;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispit.add(ispit);
	}

	private int racunajProsek() {
		int prosek = 0;
		for (int i = 0; i < this.ispit.size(); i++) {
			prosek = this.ispit.get(i).getOcena() / this.ispit.size();

		}
		return prosek;
	}
	
	public void stampa () {
	System.out.println(this.brojIndeksa+ " "+this.imePrezimeStudenta+ " "+this.tipStudija);
	
	for (int i = 0; i < this.ispit.size(); i++) {
		System.out.println("PREDMET ");
		this.ispit.get(i).stampaj();

	}
	System.out.println("Prosecna ocena je: " + this.racunajProsek());
	}
	
}