package d15_08_2022;

public class zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.

		stampa("/", 7);

	}

	public static void stampa(String simbol, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(simbol + " ");
		}
		
		
	
}
}
