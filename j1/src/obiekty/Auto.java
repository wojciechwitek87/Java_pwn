package obiekty;
/*
NazwaKlasy{}
nazwaMetody(){}
nazwaZmiennych
*/
public class Auto {
	
	int iloscDrzwi; 
	double brutto, cena;
	String kolorNadwozia; 
	String kolorFelg, kolorOpon, marka, model; 
	
	public double rabat () {
		cena = cena * 0.9;
		return cena;
	}
	
	
	public double brutto(double cena) {
		this.brutto = cena * 1.23; 
		return brutto;
	}
	
	public void bruttoNetto() {
		System.out.println("Do zaplaty: ");
		System.out.println("Cena netto: " + cena);
		System.out.println("Cena brutto: " + cena * 1.23);
	}
	
	
	public Auto(){}
	public Auto(	int iloscDrzwi,
			String kolorNadwozia,
			String kolorFelg,
			String kolorOpon,
			String marka,
			String model,
			double cena		){
		
		this.iloscDrzwi = iloscDrzwi; 
		this.kolorFelg = kolorFelg; 
		this.kolorNadwozia = kolorNadwozia; 
		this.kolorOpon = kolorOpon; 
		this.marka = marka; 
		this.model = model; 
		this.cena = cena;	
	}
	

	public static void main(String[] args) {

		Auto garbus = new Auto(4, "niebieski", "czerwony", "czarny", "VW", "Garbus",10000); 
		Auto lexus = new Auto(4, "czarny", "czarny","czarny","lexus", "is200", 20000); 
		public Auto mazda = new Auto(2, "czerwony", "gold", "czarny", "mazda", "miata",30000);
	/*	garbus.iloscDrzwi = 4; 
		garbus.kolorNadwozia = "niebieski"; 
		garbus.kolorFelg = "czerwony"; 
		garbus.kolorOpon = "czarny"; 
		garbus.marka = "VW"; 
		garbus.model = "Garbus"; 
	*/	
		System.out.println("Obiekt Garbus");
		System.out.println(garbus.iloscDrzwi); 
		System.out.println(garbus.kolorNadwozia); 
		System.out.println(garbus.kolorFelg); 
		System.out.println(garbus.kolorOpon); 
		System.out.println(garbus.marka); 
		System.out.println(garbus.model); 
		
		System.out.println(garbus);
		
		
		
	}

}
