package d_06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {

//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena fla

	private double kaucija;
	private boolean platiKauciju;
	private double osnovnaCena;

	public StaklenaAmbalaza() {
		super();
	}

	public StaklenaAmbalaza(double kaucija, boolean platiKauciju, double osnovnaCena) {
		super();
		this.kaucija = kaucija;
		this.platiKauciju = platiKauciju;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isPlatiKauciju() {
		return platiKauciju;
	}

	public void setPlatiKauciju(boolean platiKauciju) {
		this.platiKauciju = platiKauciju;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArt() {
		if (this.platiKauciju==true) {
			return this.osnovnaCena *1.2 + this.kaucija;
		}
		return this.osnovnaCena*1.2;
	}

	@Override
	public void stampa() {
		System.out.println(this.kaucija);
		System.out.println(this.platiKauciju);
		System.out.println(this.osnovnaCena);
	}

}
