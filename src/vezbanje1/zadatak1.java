package vezbanje1;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlaninarskiDom x = new PlaninarskiDom ("Topola", "1986.");
		
		RekreativniPlaninar a = new RekreativniPlaninar (1212, "Uros Stevovic", 5, "Nisavski", 1352);
		RekreativniPlaninar b = new RekreativniPlaninar (1218, "Milos Milic", 7, "Nisavski", 1952);
		RekreativniPlaninar c = new RekreativniPlaninar (1220, "Darko Simic", 2, "Jablanicki", 1500);
		
		Alpinista s = new Alpinista (55, "Sara Pot", 2);
		Alpinista j = new Alpinista (56, "Jovan Saric", 5);
		Alpinista k = new Alpinista (85, "Katarina Milic", 3);
		
		x.uclaniPlaninara(a);
		x.uclaniPlaninara(b);
		x.uclaniPlaninara(c);
		x.uclaniPlaninara(s);
		x.uclaniPlaninara(j);
		x.uclaniPlaninara(k);
		
		Planina kopaonik = new Planina ("Kopaonik", "Srbija", 2018);
		
		System.out.println(s.claniarina());
		System.out.println(a.claniarina());
		
		x.stampaj();
		
		System.out.println(a.uspesanUspon(kopaonik));
		k.uspesanUspon(kopaonik);
		System.out.println(x.planinarUspesni(kopaonik));
		
		
	}

}
