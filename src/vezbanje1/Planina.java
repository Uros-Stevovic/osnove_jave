package vezbanje1;

public class Planina {

	private String imePlanine;
	private String drzava;
	private int visina;
	public Planina() {
		super();
	}
	public Planina(String imePlanine, String drzava, int visina) {
		super();
		this.imePlanine = imePlanine;
		this.drzava = drzava;
		this.visina = visina;
	}
	public String getImePlanine() {
		return imePlanine;
	}
	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	
	
}
