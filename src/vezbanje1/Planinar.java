package vezbanje1;

public abstract class Planinar {
//		reirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
//		jedinstveni celobrojni identifikacioni broj
//		ime i prezime 
//		Dok od javnih metoda: 
//		konstruktor koji postavlja sve atribute klase. 
//		gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
//		apstraktnu metodu štampaj
//		apstraktnu metodu koja vraca clanarinu planinara
//		apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar
//		prima objekat tipa Planina.

		protected int idfBroj;
		protected String imePrezime;
		public Planinar(int idfBroj, String imePrezime) {
			super();
			this.idfBroj = idfBroj;
			this.imePrezime = imePrezime;
		}
		public int getIdfBroj() {
			return idfBroj;
		}
		public String getImePrezime() {
			return imePrezime;
		}

		public abstract void stampa ();
		public abstract double claniarina ();
		public abstract boolean uspesanUspon (Planina pl);
}
