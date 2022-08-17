package d16_08_2022;

public class SmartAirConditioning {

	public String marka;
	public double temperatura;
	public String mode;

	public void stampa() {
		System.out.println("Marka klime: " + this.marka + " , " + "Temperatura: " + this.temperatura + " , " + "mode: "
				+ this.mode);

	}

	public String razlika(int spoljnaTemperatura) {
		if (spoljnaTemperatura > this.temperatura) {
			return "Temperatura napolju je veca";
		}
		return "Temperatura napolju je manja";
	}
}
