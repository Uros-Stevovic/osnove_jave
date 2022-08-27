package d25_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ispit ispit1 = new Ispit ("Metodologija ",8," Milos Milosevic ");

		Ispit ispit2 = new Ispit ("Uvod 2 ",6, " Ilija Rakic ");
		Ispit ispit3 = new Ispit ("Uvod 1 ",9, " Ilija Rakic ");
		
		
		Student student = new Student ();
		student.setBrojIndeksa("1243");
		student.setImePrezimeStudenta("Stevan Lutovac");
		student.setTipStudija("Master studije");
		
		student.dodajIspit(ispit1);
		student.dodajIspit(ispit2);
		student.dodajIspit(ispit3);
		
		student.stampa();
		
	}

}
