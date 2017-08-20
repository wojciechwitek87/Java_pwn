package klasaAbstrakcyjna;

public abstract class Owoce implements PreOwoc {
	
	//stala 
	public static final String owoce = "owoc ";
	//zmienna
	public boolean dojrzaly; 
	//metoda abstrakcyja
	public abstract void printInfo(); 
	//metoda
	
	
	public  void dojrzewanie() {
		this.dojrzaly = true; 

	}

}
