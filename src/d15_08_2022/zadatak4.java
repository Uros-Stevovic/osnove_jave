package d15_08_2022;

public class zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati metodu koja stampa podatke o korisniku u formatu:
//			JMBG: [jmbg]
//			Ime: [ime]
//			Prezime: [prezime]
//			God. rodjenja: [god]
//			Aktivan: [true/false]
//			Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

		jmbg("2306993730056");
		ime("Uros");
		prezime("Stevovic");
		godRodjenja("1990");
		aktivan(true);

	}

	public static void jmbg(String jmbg) {
		System.out.println("JMBG: " + jmbg);
	}

	public static void ime(String ime) {
		System.out.println("Ime: " + ime);
	}

	public static void prezime(String prezime) {
		System.out.println("Prezime: " + prezime);
	}

	public static void godRodjenja(String godRodj) {
		System.out.println("Godina roðenja: " + godRodj);
	}

	public static void aktivan(boolean aktivan) {
		System.out.println("Aktivan: " + aktivan);
	}

}