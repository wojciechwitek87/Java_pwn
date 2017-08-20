package j1;

import java.io.FilterInputStream;
import java.util.Scanner;

public class j26Kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close () {}
		});
		
		String d;
		double x; 
		double y; 
		System.out.println("Podaj liczbe 1: ");
		x = l.nextDouble();
		System.out.println("Podaj liczbe 2: ");
		y = l.nextDouble();
		l.nextLine();
		System.out.println("wybierz + - * /");
		d = l.nextLine();
		
		switch(d){
		case "+": 
			System.out.println(x+y); 
			break;
	 
		case "-": 
			System.out.println(x-y); 
			break; 
		case "*": 
			System.out.println(x*y); 
			break;
		case "/": 
			System.out.println(x/y); 
			break;
			
	}
		
		
		

	}

}
