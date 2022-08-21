package d_18_08_2022;

import javax.swing.Popup;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost poveæanje za koju treba poveæati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uraèuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraæa koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se raèuna u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din

		Proizvod a = new Proizvod();
		a.nazivProizvoda = "Kafa";
		a.cena = 150;
		a.tezina = 100;

		a.stampaj();
		a.povecanjeCena(20);
		a.vratiCenuPopust(30);
		a.racunajPostarinu();

		Proizvod b = new Proizvod();
		b.nazivProizvoda = "Upaljac";
		b.cena = 110;
		b.tezina = 56;

		b.stampaj();
		b.povecanjeCena(55);
		b.vratiCenuPopust(30);
		b.racunajPostarinu();
		
	}

}
