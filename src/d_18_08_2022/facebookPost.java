package d_18_08_2022;

public class facebookPost {

	public String imePrezimeObjavio;
	public String imePrezimeDrugi;
	public String tekst;
	public int brLike;
	public int brShare;

	public void like() {
		this.brLike++;
	}

	public void dislike() {
		this.brLike--;
		if (this.brLike < 0) {
			this.brLike = 0;
		}
	}

	public void share() {
		this.brShare++;
	}

	public void stampaj() {
		System.out.println(this.imePrezimeObjavio + " >>> " + this.imePrezimeDrugi);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.brLike + " Shares " + this.brShare);
	}

}
