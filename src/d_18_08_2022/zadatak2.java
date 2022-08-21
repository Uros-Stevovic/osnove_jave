package d_18_08_2022;

public class zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		.Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)

		facebookPost a = new facebookPost();
		a.imePrezimeObjavio = "Marko Markovic";
		a.imePrezimeDrugi = "Marina Ilic";
		a.tekst = "Srecan rodjendan!";
		a.brLike = 15;
		a.brShare = 2;

		a.like();
		a.like();
		a.dislike();
		a.share();
		a.stampaj();

		facebookPost b = new facebookPost();
		b.imePrezimeObjavio = "Ivan Savic";
		b.imePrezimeDrugi = "Marija Tonic";
		b.tekst = "Cao!";
		b.brLike = 3;
		b.brShare = 0;

		b.like();
		b.like();
		b.like();
		b.dislike();
		b.share();
		b.stampaj();
		
		
		
		
	}

}
