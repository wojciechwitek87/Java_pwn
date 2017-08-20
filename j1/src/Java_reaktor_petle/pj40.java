package Java_reaktor_petle;

import java.util.Scanner;

public class pj40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in); 
		System.out.println("Podaj wysokość choinki > 0: ");
		int wys = n.nextInt();

		for (int w = 0; w < wys; w++) {
			for(int i = 1; i<wys -w; i++) {
				System.out.print(" ");
				}
			for(int j = wys; j > wys - 2*w+1; j--) {
				System.out.print("*");
			}
			
		System.out.println();
		}
	for(int k = 0; k<wys -2; k++ ) {
		System.out.print(" ");
	}
	System.out.print("I");

		n.close();


		
	}

}
