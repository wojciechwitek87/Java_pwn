package obiekty;

import javax.swing.plaf.synth.SynthSpinnerUI;

private class CarShop {

	public static void main(String[] args) {
		
		System.out.println("Kupujemy auto: ");
		CarShop cs = new CarShop(); 
		
		Auto bmw = new Auto(4, "biały", "złote", "chrome", "BMW", "X5", 1000000); 
		System.out.println("kupiles: " +bmw.marka+ " " +bmw.model);
		System.out.println("Do zaplaty: " +bmw.cena+ " PLN");
		
		boolean res = bmw instanceof Auto; 
		boolean res2 = cs instanceof CarShop; 
		System.out.println(res);
		System.out.println(res2);
	//	double cena_brutto_rabat = bmw.brutto(80000);
		double cena_brutto_rabat = bmw.brutto(bmw.cena);

		bmw.bruttoNetto();
		
		System.out.println(bmw.brutto);
		bmw.rabat();
		System.out.println("cena po rabacie: " + bmw.rabat());
		bmw.bruttoNetto();
		
	}

}
