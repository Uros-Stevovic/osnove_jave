package mini_projekat;

public class Player {

	protected String imePrezime;

	public Player() {
		super();
	}

	public Player(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public void stampa () {
		System.out.println(this.imePrezime);
	}
	
	
	
}
