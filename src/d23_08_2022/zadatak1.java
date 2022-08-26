package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
		ZeleniKarton ispit = new ZeleniKarton();
		for (int i = 0; i < 10; i++) {
			System.out.println("Ime i prezime studenta: ");
			String imeIPrezime = s.next();
			ispit.setImePrezimeStudenta(imeIPrezime);
			System.out.println("Broj indexa: ");
			int broj = s.nextInt();
			ispit.setBrojIndeksa(broj);
			System.out.println("Predmet: ");
			String predmet = s.next();
			ispit.setPredmet(predmet);
			System.out.println("Profesor: ");
			String profesor = s.next();
			ispit.setImePrezimeProfesora(profesor);
			System.out.println("Ocena: ");
			int ocena = s.nextInt();
			ispit.setOcena(ocena);
			ispiti.add(ispit);

		}
		for (int i = 0; i < 10; i++) {

			System.out.println("Ime i prezime studenta: " + ispiti.get(i).getImePrezimeStudenta() + " Broj indeksa:  "
					+ ispiti.get(i).getBrojIndeksa() + " Predmet: " + ispiti.get(i).getPredmet() + " Profesor: "
					+ ispiti.get(i).getImePrezimeProfesora() + " Ocena: " + ispiti.get(i).getOcena());

		}

	}

}
