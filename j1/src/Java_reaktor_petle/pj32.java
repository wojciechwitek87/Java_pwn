package Java_reaktor_petle;

import java.util.Scanner;

public class pj32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner n = new Scanner(System.in); 
		System.out.println("Podaj swój wiek: ");
		int wiek = n.nextInt();
		if (wiek >= 18) {
			System.out.println("możesz glosowac");
		}
		
		else {
			System.out.println("za mlody");
		}
		n.close();
	}

}
