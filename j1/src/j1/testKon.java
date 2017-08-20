package j1;

public class testKon {

	public static void main(String[] args) {
		
		double number1 = 10.987; 
		float number3 = 10; 
		int number2 = 5;
		int narrowing = (int)number1; 
		double widening = (double)number2; 
		System.out.println("Narrowing: "+ narrowing);
		System.out.println("Widening "+ widening);
		long c = Math.round(number3); 
		System.out.println(c);
		String ala = "Ala"; 
		String ala2 = "Ala"; 
		String al = "Al"; 
		String a = "a"; 
		String ala3 = "al+a"; 
		String kot = "Kot"; 
		System.out.println(ala.equals(ala3));

		float x = 6.4f; 
		float y = 3.2f; 
		float z = (int)(x/y);

		System.out.println(z);

///
		int e = 2; 
		int f = 3; 
		System.out.println((e+f) +";"+ (e-f) +";"+ (f-e) +";"+ (e*f) +";"+ (e/f) +";"+ (f/e));
		
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		System.out.println(20+-3*5/8);
		System.out.println(5+15/3*2-8%3); // % - modulo reszta z dzielenia
		
		System.out.println("_________________________________________________________________");

		
int i = 1		; 
int n = 1; 
System.out.println(i*n++);
System.out.println(i*n++);
System.out.println(i*n++);
System.out.println(i*n++);
System.out.println(i*n++);
System.out.println(i*n++);
System.out.println(i*n++);
System.out.println(i*n++);
System.out.println(i*n++);
System.out.println(i*n++);






	}

}
