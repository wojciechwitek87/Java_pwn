package sekwencje;

import java.util.Scanner;

public class sj46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		System.out.println("Podaj liczbe całkowita by przeksztacic ja na 01010101010: ");

		int liczba = sc.nextInt(); 
		sc.nextLine();
		sc.close();
		int [] tab = new int [32];
		for(int i = 31; i >= 0; i--) {
			tab[i] = liczba % 2; 
			liczba /= 2; 
		}
			System.out.println("binarna reprezentacja to: ");
		
		
	}

}
