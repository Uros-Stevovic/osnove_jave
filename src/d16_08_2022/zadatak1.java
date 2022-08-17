package d16_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//		a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”

		Proizvod prviProizvod = new Proizvod();
		prviProizvod.naziv = "Cokolada";
		prviProizvod.cena = 120.4;
		prviProizvod.tezinaGr = 100;

		Proizvod drugiProizvod = new Proizvod();
		drugiProizvod.naziv = "Brasno";
		drugiProizvod.cena = 98.7;
		drugiProizvod.tezinaGr = 1000;

		prviProizvod.stampaj();
		drugiProizvod.stampaj();

		System.out.println(
				"Tezina proizvoda " + prviProizvod.naziv + " u kilogramima je: " + prviProizvod.konvertuj("kg"));
		System.out.println("Tezina proizvoda " + drugiProizvod.naziv + " u tonama je: " + drugiProizvod.konvertuj("t"));
	}

}
