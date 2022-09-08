package d_06_09_2022;

import java.util.ArrayList;

public class Korpa {


//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//	

	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza amb) {
		this.ambalaze.add(amb);
	}

	public void izbaciAbmalazu(String barkod) {
		for (int i = 0; i < this.ambalaze.size(); i++) {
			if (this.ambalaze.get(i).getBarKod().equals(barkod)) {
				this.ambalaze.remove(i);
			}
		}
	}
	
	private double cenaSvih (Double popust) {
		double sumaSvih=0;
		for (int i = 0; i < this.ambalaze.size(); i++) {
			
			sumaSvih = sumaSvih+ this.ambalaze.get(i).cenaArt() -popust;
		}	
		return sumaSvih;
}
	
	public double cenaSvih (SuperKartica sk) {
		double sumaSvihArt=0;
		for (int i = 0; i < this.ambalaze.size(); i++) {
			
			sumaSvihArt = sumaSvihArt+ this.ambalaze.get(i).cenaArt()  ;
		}	
		return sumaSvihArt - sk.getPopust();
}
	
	
	
	
}