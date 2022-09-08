package vezbanje1;

public class RekreativniPlaninar extends Planinar {

	//	Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke informacije koje se ne mog
	//	u menjati nakon postavljanja u konstuktoru: 
	//	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
	//	naziv okruga odakle je rekreativni planinar. 
	//	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
	//	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, s tim da oprema dodatno 
	//	otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje. 
	//	rekeativci placaju clanarinu u iznosu od 1000 rsd
	//	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
	//	Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 

	
	private int tezinaOpreme;
	private String okrug;
	private int maksUspon;
	
	
	public RekreativniPlaninar(int idfBroj, String imePrezime, int tezinaOpreme, String okrug, int maksUspon) {
		super(idfBroj, imePrezime);
		this.tezinaOpreme = tezinaOpreme;
		this.okrug = okrug;
		this.maksUspon = maksUspon;
	}

	public RekreativniPlaninar(int idfBroj, String imePrezime) {
		super(idfBroj, imePrezime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void stampa() {
		System.out.println("Rekreativac, ID: " + this.idfBroj + "Ime: " + this.imePrezime + "Okrug: " + this.okrug);
	}

	@Override
	public double claniarina() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina pl) {
		if (pl.getVisina() < this.maksUspon - this.tezinaOpreme * 50) {
		return true;
	}
		return false;
	}
}
