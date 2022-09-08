package d_06_09_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova 
//		i istestirati sve metode i ispisati ukupnu cenu sa popustom.

		Korpa x = new Korpa();
		Tetarpak sok = new Tetarpak(true, 150);
		Tetarpak mleko = new Tetarpak(false, 100);
		StaklenaAmbalaza pivo = new StaklenaAmbalaza(20, true, 70);
		StaklenaAmbalaza kisela = new StaklenaAmbalaza(10, true, 50);

		x.dodajAmbalazu(mleko);
		x.dodajAmbalazu(sok);
		x.dodajAmbalazu(pivo);
		x.dodajAmbalazu(kisela);

		SuperKartica skr = new SuperKartica(1232, "Uros Stevovic", 100);

		x.cenaSvih(skr);

		System.out.println( "Cena svih artikala sa popustom iznosi:  " + x.cenaSvih(skr));

	}

}
