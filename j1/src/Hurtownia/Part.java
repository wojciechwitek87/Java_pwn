package Hurtownia;

 public class Part {  //klasa Part, potem obiekty
	static int id; //kiedy k. static a kiedy final?
	final int NR; 
	String nazwa, model, seria; 
	
	public Part (String nazwa, String model, String seria) {
		this.NR = id++; 
		this.nazwa = nazwa;  // this. okresle ten konkretny obiekt.
		this.model = model; 
		this.seria = seria; 
	}
	
	
	
	
}
