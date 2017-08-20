package j1;
import static java.lang.Math.*;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner l = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close () {}
		});
		
		System.out.println("Podaj koordynaty x1,x2 i y1, y2");
		double x1; 
		double x2; 
		double y1;
		double y2;
		System.out.println("Podaj x1: ");
		x1 = l.nextDouble();
		System.out.println("Podaj y1: ");
		y1 = l.nextDouble();
		System.out.println("Podaj x2: ");
		x2 = l.nextDouble();
		System.out.println("Podaj y2: ");
		y2 = l.nextDouble();
	
		double dist = sqrt(pow(x1-x2,2)+pow((cos(x1*PI/180)*(y2-y1)),2))*111;
		
		System.out.println(dist);
	}

}
