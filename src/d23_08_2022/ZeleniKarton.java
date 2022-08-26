package d23_08_2022;

public class ZeleniKarton {
	
	private String imePrezimeStudenta;
	private int brojIndeksa;
	private String predmet;
	private String imePrezimeProfesora;
	private int ocena;

	public ZeleniKarton() {
		super();
	}

	public String getImePrezimeStudenta() {
		return imePrezimeStudenta;
	}

	public void setImePrezimeStudenta(String imePrezimeStudenta) {
		this.imePrezimeStudenta = imePrezimeStudenta;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getImePrezimeProfesora() {
		return imePrezimeProfesora;
	}

	public void setImePrezimeProfesora(String imePrezimeProfesora) {
		this.imePrezimeProfesora = imePrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean ispitPolozen() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void stampaj() {
		System.out.println(this.predmet + " - " + this.ocena);
		System.out.println("Student: " + this.imePrezimeStudenta + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imePrezimeProfesora);
	}

}
