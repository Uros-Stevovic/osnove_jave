package d19_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacebookPost a = new FacebookPost ();
		
		FacebookPost b = new FacebookPost ("Milan Ilic", "Jovan Popovic" , "Zdravo!");
		
		b.setLike(10);
		b.setNextLike();
		b.setNextLike();
		b.setNextDisLike();
		b.setShare(3);
		b.setNextShare();
		
		b.stampaj();
	}

}
