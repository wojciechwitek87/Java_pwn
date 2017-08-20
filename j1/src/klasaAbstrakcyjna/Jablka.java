package klasaAbstrakcyjna;

public  class Jablka extends Owoce {
	String odmiana = "nieznzna";
	
	@Override
	public void printInfo() { 
		System.out.println("owoce" +"/ " + "Czy dojrzały: " + dojrzaly +"/ "+ odmiana);
	}
	@Override
	public void przklad() {
		System.out.println("z interfejsu ");
	}
	public void zmien(String odmiana) {
		this.odmiana = odmiana;
	}
	
	public static void main(String[] args) {
		Jablka j1 = new Jablka();
		j1.zmien("Szampion ");
		j1.printInfo();
		j1.dojrzewanie();
		j1.printInfo();
		j1.przklad();
	}

}
