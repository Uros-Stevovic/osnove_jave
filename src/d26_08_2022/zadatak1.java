package d26_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Igrac igrac1 = new Igrac ("Milos Milic ", "2211993454311 ", "1993. " , "stoper ", 3 , true );
		Igrac igrac2 = new Igrac ("Marko Niloic ", "0507990458891 ", "1990. " , "golman ", 3 , false );
		
		igrac1.stampaIgrac();
		igrac2.stampaIgrac();
		
		Trener trener1 = new Trener ("Stevan Kostic ", "0908955938800" , "1955. ", " 25 " , "Kondicioni trener ");
		Trener trener2 = new Trener ("Miroslav Gak ", "2212969945210" , "1969. ", " 18 " , " Trener golmana ");
		
		trener1.stampajTrenera();
		trener2.stampajTrenera();
		
	}

}
