package Specyfikatory;
import obiekty.*; // import calej zawartosci pakietu


public class Specyfikatory_testowe {
	public static void main(String[] args) {
		
	/*Auto mazda = new Auto(2, "czerwony", "gold", "czarny", "mazda", "miata",30000); 
	
	mazda.bruttoNetto();

	*/
	GetSet gs1 = new GetSet(2, "cos"); 
	GetSet gs2 = new GetSet(2, "napis"); 
	
	System.out.println(gs1.getA());
	gs1.setA(15);
	System.out.println(gs1.getA());
	
	gs2.setC(true);
	System.out.println(gs2.isC());
	
	
}
	
}
