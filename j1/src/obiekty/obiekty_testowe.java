package obiekty;

public class obiekty_testowe {

	static String p = "zmienna globalna"; 
	static void info() {
		int b = 2; 
		if(true) { 
			int c = 3; 
		}
		System.out.println("jestem w metodzie info ");
		//zmienna klasowa jest dostepna w metodzie 
		System.out.println("w info (p): " +p);
	}
	
	public static void main(String[] args) {

		int a = 1; 
	//	int i = 15; 										// zadeklarowana w metodzie 
		for(int i = 0; i < 9; i++) {						// zakres lokalny w petli for
			System.out.println("w petli (i) " + i); 		// i zadeklarowana w petli{} i tam jest tylko widoczna
			a = a +1; 
			System.out.println("w petli (a) " + a);
		
		}
	//	System.out.println(i);							// zmienna nie jest widoczna poza petla 
		System.out.println("poza petla (a) " + a);
		
		//zmienna klasowa 
		System.out.println("w main (p) "  + p);
		//wywolanie metody 
		info(); 
	}

}
