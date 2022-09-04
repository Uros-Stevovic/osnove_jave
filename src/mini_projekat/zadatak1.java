package mini_projekat;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Player x = new Player("Uros Stevovic ");
		Player o = new Player("Dusan Popovic ");

		XandOGame xo = new XandOGame(x, o);

		System.out.println("Zapocinjemo novu igru! ");
		System.out.print("Na poziciji igraca X je: ");
		x.stampa();
		System.out.print("Na poziciji igraca O je: ");
		o.stampa();

		while (xo.isWinnerX() == false && xo.isWinnerO() == false && xo.isGameover().equals("Igra je gotova. ")) {

			if (xo.player().equals("x")) {
				System.out.println("Igrac x je na potezu. Unesite potez: ");
			} else {
				System.out.println("Igrac o je na potezu. Unesite potez: ");
			}
			int potez = s.nextInt();

			if (xo.isValidMove(potez) == false || xo.isFieldFree(potez).equals("Polje nije slobodno. ")) {
				System.out.println("Potez je nevalidan! ");
			} else {
				xo.makeMove(potez);
			}

			if (xo.gameScore() == 1) {
				System.out.println("Pobednik je: " + x.getImePrezime());
			} else if (xo.gameScore() == 2) {
				System.out.println("Pobednik je: " + o.getImePrezime());
			} else {
				System.out.println("Nereseno je! ");
			}

			xo.playNext();
			xo.stampaj();
		}

	}
}