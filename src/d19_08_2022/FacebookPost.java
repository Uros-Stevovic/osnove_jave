package d19_08_2022;

public class FacebookPost {

	private String imePrezimeObjavio;
	private String imePrezimeDrugi;
	private String tekst;
	private int brLike;
	private int brShare;
	
	public FacebookPost () {}
	
	public FacebookPost (String imePrezimeObjavio, String imePrezimeDrugi, String tekst) { 
		this.imePrezimeObjavio = imePrezimeObjavio;
		this.imePrezimeDrugi = imePrezimeDrugi;
		this.tekst=tekst;
	}
	
	public void setLike (int like) {
		this.brLike=like;
	}
	
	public void setNextLike () {
		this.brLike=this.brLike+1;
	}
	
		
	public void setNextDisLike () {
		this.brLike=this.brLike-1;
	}
	
	public void setShare (int share) {
		this.brShare= share;
	}
	
	public void setNextShare () {
		this.brShare=this.brShare+1;
	}
	
	public void stampaj() {
		System.out.println(this.imePrezimeObjavio + " >>> " + this.imePrezimeDrugi);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.brLike + " Shares " + this.brShare);
	}
	
	
}
