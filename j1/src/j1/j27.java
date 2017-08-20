package j1;

import java.io.FilterInputStream;
import java.util.Scanner;

public class j27 {
	public static void main(String[] args) {
		
		Scanner l = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close () {}
		});
		
		double x; 
		System.out.println("Podaj liczbe: ");
		x = l.nextDouble();
		
		if (x>0 && x<1) {
			System.out.println("tak");
		}
		else	{
			System.out.println("nie");
			}
			
		}
			
		
		
		
	}

