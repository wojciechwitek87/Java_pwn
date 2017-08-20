package j1;

import java.io.FilterInputStream;
import java.util.Scanner;

public class j19 {
	
	public static void main(String[] args) {

	System.out.println("Jak Ci na imie? ");
	String imie; 
	Scanner rl = new Scanner(new FilterInputStream(System.in) {
		@Override
		public void close () {}
	});
	imie = rl.nextLine();
	System.out.println("Cześć: " + imie);
////	/////
	System.out.println("Podaj trzy liczby: ");
	double x; 
	double y; 
	double z; 
	System.out.println("Podaj x: ");
	x = rl.nextDouble();
	System.out.println("Podaj y: ");
	y = rl.nextDouble();
	System.out.println("Podaj z: ");
	z = rl.nextDouble();
System.out.println("Średnia z podanych liczb to: " + (x+y+z)/3);
	

	
	
}
}