package d26_08_2022;

public class Igrac extends Osoba {


	private String pozicija;
	private int broj;
	private boolean kapiten;
	
	
	public Igrac(String imePrezime, String jmbg, String godinaRodjenja, String pozicija, int broj, boolean kapiten) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.pozicija = pozicija;
		this.broj = broj;
		this.kapiten = kapiten;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}

	
	
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	public void stampaIgrac () {
	this.stampaj();
	System.out.println("Pozicija: " + this.pozicija);
	System.out.println("Broj "+ this.broj);
	System.out.println("Kapiten " + this.kapiten);
}


}
