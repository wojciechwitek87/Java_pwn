package Java_reaktor_petle;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;

public class pj38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close () {}
		});
		
		double y; 
		System.out.println("Podaj liczbe: ");
		y = n.nextDouble();
		
			Random generator = new Random();
			int x = generator.nextInt(50);	
			//System.out.println(x);
			
		while (x!=y) {
				
	if (y>x) {
		System.out.println("Twoja liczba > od losowej");
		System.out.println("Podaj liczbe: ");
		y = n.nextDouble();
	}
	if (x>y) {
		System.out.println("Twoja liczba < od losowej");
		System.out.println("Podaj liczbe: ");
		y = n.nextDouble();
	}
		
	}
	System.out.println("wygrales");
	n.close();

	}

}

