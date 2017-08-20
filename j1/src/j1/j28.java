package j1;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;

public class j28 {
	public static void main(String[] args) {
		
		Scanner l = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close () {}
		});
		
		double y; 
		System.out.println("Podaj liczbe: ");
		y = l.nextDouble();
		
	
			Random generator = new Random();
			int x = generator.nextInt();	
			System.out.println(x);
	if (y>x) {
		System.out.println("Twoja liczba > od losowej");
	}
	if (x>y) {
		System.out.println("Twoja liczba < od losowej");
	}
	if (y==x) {
		System.out.println("Twoja liczba = od losowej");
	}
		
	
	}

	
	}
