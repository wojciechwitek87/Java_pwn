package j1;

import java.util.Random;

public class j16 {

	public static void main(String[] args) {
		
		
		Random generator = new Random();
		int x = generator.nextInt(10);
		int y = generator.nextInt(10);

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		System.out.println("czy x>y" + (x>y));
		System.out.println("czy x*2>y" + (x*2>y));
		System.out.println("czy y<x+3 and y>x-2 " + (y<x+3 && y>x-2));

		System.out.println("czy x*y%2 == 0 " + (x*y%2==0) );
		
		
		
}
}