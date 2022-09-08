package vezbanje1;

import java.util.ArrayList;

public class PlaninarskiDom {
	
//	Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//		naziv doma 
//		godinu kada je osnovan. 
//		članove doma koji su planinari (klasa vodi računa o nizu) 
//		Dok od javnih: 
//		default-ni konstuktor i konstuktor koji postavlja sve parametre 
//		gettere i settere koji su potrebni 
//		metodu učlani planinara, koja dodaje planinara u niz 
//		metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija) 
//		metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
//		metodu koja štampa podatke o domu i o svim članovima doma
//		metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

	private String nazivDoma;
	private String godOsnovanja;
	private ArrayList <Planinar> planinari = new ArrayList <Planinar> ();
	public PlaninarskiDom() {
		super();
	}
	public PlaninarskiDom(String nazivDoma, String godOsnovanja) {
		super();
		this.nazivDoma = nazivDoma;
		this.godOsnovanja = godOsnovanja;
	}
	public String getNazivDoma() {
		return nazivDoma;
	}
	public String getGodOsnovanja() {
		return godOsnovanja;
	}
	public ArrayList<Planinar> getPlaninari() {
		return planinari;
	}
	
	public void uclaniPlaninara (Planinar plan){
		planinari.add(plan);
	}
	
	public int planinarUspesni (Planina pla){
		int brojac = 0;
		for (int i = 0; i <planinari.size(); i++) {
			if (this.planinari.get(i).uspesanUspon(pla)==true) {
				brojac++;
		}
		
	}
		return brojac;
	}
	
	public void izbaciPlaninara (int idfBr) {
	
		for (int i = 0; i <planinari.size(); i++) {
			if (this.planinari.get(i).getIdfBroj() == idfBr) {
			this.planinari.remove(i);
		}
		}
	}
	
	public void stampaj () {
		System.out.println(this.nazivDoma + ", " + this.godOsnovanja) ;
		for (int i = 0; i <planinari.size(); i++) {
			System.out.println(planinari.get(i).imePrezime + " - " +  planinari.get(i).idfBroj);
			System.out.println("Clanarina: " + planinari.get(i).claniarina());
	
		}
		
	}
	
	public double sumaClanarina () {
		double sumaCl =0;
	for (int i = 0; i < planinari.size(); i++) {
		sumaCl = sumaCl + this.planinari.get(i).claniarina();
	}
	return sumaCl;
	
	}
	
	
	
	
	
	
}
