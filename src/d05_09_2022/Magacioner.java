package d05_09_2022;

public class Magacioner extends Radnik{

	public Magacioner(String inePrezime) {
		super(inePrezime);
		// TODO Auto-generated constructor stub
	}


	private double prosecnaPlata() {
		double suma = 0;
		for (int i = 0; i < this.getSektor().size(); i++) {
			suma = suma + this.getSektor().get(i).getPlata();
		}
		return suma / this.getSektor().size() *0.5;
	}


	@Override
	public double plata() {
		// TODO Auto-generated method stub
		return this.prosecnaPlata()*this.getSektor().size()*0.5;
	}
	
	
	
	
}
