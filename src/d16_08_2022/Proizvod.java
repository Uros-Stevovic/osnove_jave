package d16_08_2022;

public class Proizvod {

	public String naziv;
	public double cena;
	public double tezinaGr;

	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaGr);

	}

	public double konvertuj(String jedinicaMere) {
		if (jedinicaMere.equals("kg")) {
			return this.tezinaGr / 1000;
		} else if (jedinicaMere.equals("t")) {
			return this.tezinaGr / 1000000;
		}
		return 0;
	}
}
