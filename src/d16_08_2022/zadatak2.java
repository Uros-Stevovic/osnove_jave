package d16_08_2022;

public class zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartAirConditioning klima1 = new SmartAirConditioning();
		klima1.marka = "LG";
		klima1.temperatura = 23.5;
		klima1.mode = "Greje";

		SmartAirConditioning klima2 = new SmartAirConditioning();
		klima2.marka = "Samsung";
		klima2.temperatura = 18.5;
		klima2.mode = "Hladi";

		klima1.stampa();
		klima2.stampa();

		System.out.println(klima1.razlika(20));
		System.out.println(klima2.razlika(28));
	}

}
