package Java_reaktor_petle;

import java.util.Scanner;

public class pj33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner n = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int number = n.nextInt();
		n.nextLine(); 
		System.out.println("podaj napis: ");
		String txt = n.nextLine(); 
		
		for (int i = 0; i<=txt.length()-1; i = i + number) {
			System.out.println(txt.charAt(i));
		}
		n.close();
	}
}

