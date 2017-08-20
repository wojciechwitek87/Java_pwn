package p54;

public class CalcTest {
	
	public static void main(String[] args) {
		Calculator o1 = new Calculator(); 
	
		System.out.println(o1.dodaj(2,3));
		System.out.println(o1.dodaj(2,3,4));
		System.out.println(o1.dodaj(2.23, 3.32));
		System.out.println(o1.dodaj(2.24, 3.32, 3.21));
		
		System.out.println(o1.odejmij(2,3));
		System.out.println(o1.odejmij(2,3,4));
		System.out.println(o1.odejmij(2.23, 3.32));
		System.out.println(o1.odejmij(2.24, 3.32, 3.21)); 
		
		//System.out.println(o1.printType(2,3));
		
		//int a = 1; 
		
		
		
	}
}
