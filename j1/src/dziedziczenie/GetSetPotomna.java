//
package dziedziczenie;

public class GetSetPotomna extends GetSetBazowa {

	int rok = 1900;
	int miesiac, 
	
	public GetSetPotomna(String imie, int pesel, int rok) { //obiekt
		super (pesel);
		this.imie = "Anon"
		this.rok = rok; 		
		this.miesiac = 8; //zaimlementowana metoda
	}
	
	public static void main(String[] args) { //konstruktor
		GetSetPotomna gs1 = new GetSetPotomna("Michal", 98238283, 2000);
		System.out.println(gs1.getImie()+" "+ gs1.getPesel());
		//gs1.imie = "abc" 
		gs1.setImie("Adam");
		gs1.setPesel(12345);
		gs1.rok = 2001;
		System.out.println(gs1.getImie()+" "+ gs1.getPesel() +" "+ gs1.rok+ " "+ gs1.miesiac);
	
		GetSetPotomna gs2 = new GetSetPotomna(98238283, 2000)); //objekt		//metoda get pesel
		System.out.println(gs1.getImie()+" "+ gs1.getPesel() +" "+ gs1.rok+ " "+ gs1.miesiac);

	}
	

}
