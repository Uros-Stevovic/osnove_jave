package d26_08_2022;

public class Osoba {

	protected String imePrezime;
	protected String jmbg;
	protected String godinaRodjenja;
	
	
	
	
	public Osoba(String imePrezime, String jmbg, String godinaRodjenja) {
		super();
		this.imePrezime = imePrezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getGodinaRodjenja() {
		return godinaRodjenja;
	}
	public void setGodinaRodjenja(String godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}
	
	public void stampaj () {
	System.out.println(this.imePrezime + this.godinaRodjenja  + this.jmbg);
	}
	
	
	
	
}
