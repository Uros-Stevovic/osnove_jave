package d22_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 

		
		Autor autor = new Autor("Milos Milakovic ");

		Knjiga knjiga = new Knjiga(autor);

		knjiga.setIbsn("3456-76");
		knjiga.setGodinaIzdanja(1998);
		knjiga.setNaziv("Pucanj u prazno " + " - ");

		knjiga.stampa();

		Autor autor2 = new Autor("Uros Stevovic");

		Knjiga knjiga2 = new Knjiga(autor2);

		knjiga2.setIbsn("3499-17");
		knjiga2.setGodinaIzdanja(2021);
		knjiga2.setNaziv("Doba generala " + " - ");

		knjiga2.stampa();
		
	}

	
}
