package Hurtownia;

public class Rims extends Part {
	int cale; 
	
	public Rims(String nazwa, String model, String seria, int cale) {
		super(nazwa, model, seria);
		this.nazwa = nazwa; 
		this.model = model; 
		this.seria = seria; 
		this.cale = cale; 
	}

}
