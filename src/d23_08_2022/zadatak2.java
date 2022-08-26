package d23_08_2022;

public class zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racun uplatilac = new Racun("431-44569-78", "Javana Ilic", 2000);
		Racun primalac = new Racun("1254-56554-78", "Uros Stevovic", 500);
		Transakcija transakcija = new Transakcija(200, uplatilac, primalac);
		transakcija.izvrsiTrans(300);
		System.out.println(uplatilac.getStanje());
		System.out.println(primalac.getStanje());
		uplatilac.stampaj();
		primalac.stampaj();
		transakcija.stampaj();
	}
		
		
		
		
	}


