package j1;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class testLocale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {};
		});
		input.useLocale(Locale.US); 
		System.out.println("Podaj A: ");
		double a = input.nextDouble();
		input.nextLine();
		System.out.println("Podaj imie: ");
		String imie = input.nextLine();
		System.out.println("Witaj " +imie);
		System.out.println("Podaj B: ");
		double b = input.nextDouble();
		input.close();
		System.out.println("A + B = " +(a+b));


	
	
	
	}
	

}
