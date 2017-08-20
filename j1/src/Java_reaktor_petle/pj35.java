package Java_reaktor_petle;

import java.util.Scanner;

public class pj35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner n = new Scanner(System.in);
		System.out.println("Podaj liczbe : ");
		int liczba = n.nextInt();
		
		for(int i = 0; i <= liczba; i++) {
			System.out.println(Math.pow(2, i));
		}
		n.close();
		
	}

}
