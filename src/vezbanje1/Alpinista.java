package vezbanje1;

public class Alpinista extends Planinar {
//	Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) 
//	i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
//	a informacije o alpinisti se ispisuju u formatu: 
//		Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni) 

	private int brPoena;

	public int getBrPoena() {
		return brPoena;
	}

	public void setBrPoena(int brPoena) {
		this.brPoena = brPoena;
	}

	public Alpinista(int idfBroj, String imePrezime, int brPoena) {
		super(idfBroj, imePrezime);
		this.brPoena = brPoena;
	}

	public Alpinista(int idfBroj, String imePrezime) {
		super(idfBroj, imePrezime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void stampa() {
		System.out
				.println("Alpinista, ID: " + this.idfBroj + "Ime: " + this.imePrezime + "Broj poena: " + this.brPoena);

	}

	@Override
	public double claniarina() {

		return 1500 - this.brPoena * 50;
	}

	@Override
	public boolean uspesanUspon(Planina pl) {
		if (pl.getVisina() < 4000) {
			return true;
		}
		return false;
	}

}
