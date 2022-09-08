package d_06_09_2022;

public class SuperKartica {

//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)

	private int brKartice;
	private String imePrezime;
	private double popust;
	public SuperKartica() {
		super();
	}
	public SuperKartica(int brKartice, String imePrezime, double popust) {
		super();
		this.brKartice = brKartice;
		this.imePrezime = imePrezime;
		this.popust = popust;
	}
	public int getBrKartice() {
		return brKartice;
	}
	public void setBrKartice(int brKartice) {
		this.brKartice = brKartice;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public double getPopust() {
		return popust;
	}
	public void setPopust(double popust) {
		this.popust = popust;
	}
	
	public void stampa (){
		System.out.println(this.brKartice + this.imePrezime);
	}
	
	
}
