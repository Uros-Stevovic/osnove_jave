package d22_08_2022;

public class Knjiga {

	private String ibsn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;

	public Knjiga(Autor autor) {
		super();
		this.autor = autor;
	}

	public String getIbsn() {
		return ibsn;
	}

	public void setIbsn(String ibsn) {
		this.ibsn = ibsn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void stampa() {
		System.out.println(this.ibsn);
		System.out.println(this.naziv + " " + this.godinaIzdanja);
		System.out.println("Autor: " + this.autor.getImePrezime());

	}
}
