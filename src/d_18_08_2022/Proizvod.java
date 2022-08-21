package d_18_08_2022;

public class Proizvod {

	public String nazivProizvoda;
	public double cena;
	public double tezina;

	public void stampaj() {
		System.out.println(this.nazivProizvoda + " " + this.cena + " " + this.tezina);
	}

	public void povecanjeCena(double povecanje) {
		this.cena = this.cena + povecanje;
	}

	public double vratiCenuPopust(double popust) {
		double novaCena = this.cena - popust;
		return novaCena;
	}

	public int racunajPostarinu() {
		if (this.tezina <= 100) {
			return 200;
		} else if (this.tezina > 100 && this.tezina <= 500) {
			return 400;
		}
		return 1000;

	}

}