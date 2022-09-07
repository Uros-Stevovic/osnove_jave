package d05_09_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sektor prodaja = new Sektor ("Prodaja", 45000);
		Sektor nabavka = new Sektor ("Nabavka", 48000);
		
		Magacioner a = new Magacioner ("Andrija Antic");
		
		a.zaposliUSektor(nabavka);
		a.zaposliUSektor(prodaja);
		a.plata();
		
		Sektor finansije = new Sektor ("Finansije", 90000);
		Sektor planiranje = new Sektor ("Planiranje", 103000);
		
		Menadzer x = new Menadzer ("Milos Milic");
		
		x.zaposliUSektor(planiranje);
		x.zaposliUSektor(finansije);
		
		System.out.println("Magacioner: " + a.getImePrezime() + " ,  plata: " + a.plata());
		System.out.println("Menadzer: " + x.getImePrezime() + " ,  plata: "  + x.plata());

	}

}
