package d_06_09_2022;

public class Tetarpak extends Ambalaza {
	
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.
//

	private boolean reciklaza;
	private double osnovnaCena;

	public Tetarpak(boolean reciklaza, double osnovnaCena) {
		super();
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArt() {
		
		if (this.reciklaza==true) {
			return this.tezinaPakovanja()*1.5+ this.osnovnaCena;
		}
		return this.osnovnaCena;
	}

	@Override
	public void stampa() {
		System.out.println(this.naziv );
		System.out.println("Cena: " + this.cenaArt());
		System.out.println("Da li je od recikliranog materijala: " + this.reciklaza);
		
	}

	
	
	
	
}
