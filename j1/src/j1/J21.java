package j1;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner l = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close () {}
		});
		
		System.out.println("Podaj liczby x i y by je porownac: ");
		double x; 
		double y;
		System.out.println("Podaj x: ");
		x = l.nextDouble();
		System.out.println("Podaj y: ");
		y = l.nextDouble();
		System.out.println("X>Y " + (x>y));
		System.out.println("X<Y " + (x<y));
		System.out.println("X=Y " + (x==y));
		System.out.println("X!=Y " + (x!=y));
		l.close();
		}

	

}
