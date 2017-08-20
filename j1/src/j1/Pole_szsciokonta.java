package j1;
import static java.lang.Math.*;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Pole_szsciokonta {
	public static void main(String[] args) {

	// TODO Auto-generated method stub

	Scanner l = new Scanner(new FilterInputStream(System.in) {
		@Override
		public void close () {}
	});
	
	System.out.println("Podaj długosc boku 'a' sześcikonta foremnego: ");
	double a; 
	System.out.println("Podaj x: ");
	 a = l.nextDouble();
	System.out.println((3*(a*a)*sqrt(3))/2);

	}
}

