package d05_09_2022;

public class Menadzer extends Radnik{

	public Menadzer(String inePrezime) {
		super(inePrezime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double plata() {
		double plata = 0;
		for (int i = 0; i < this.getSektor().size(); i++) {
			plata = plata + this.getSektor().get(i).getPlata();

		}
		return plata;

	}

	
	
}
