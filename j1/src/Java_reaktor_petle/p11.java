package Java_reaktor_petle;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner n = new Scanner(System.in);
		Scanner txt = new Scanner(System.in);
		System.out.println("Podaj ile razy wyipsac text (max10):");
		int liczba = n.nextInt();
		
		String[] teksty = new String[10]; // tablica ma zadane elementy, jak nie wypełnione to o wartości null
		
		for (int i = 0; i<= liczba-1; i++) {
			System.out.println("Podaj tekst do wyswietlenia:");
			String text = txt.nextLine();
			teksty[i] = text; 
		}
		
		txt.close();
		int j = liczba-1; 
		System.out.println(">>>> Z While <<<<");
		
		while(j>=0) {
			System.out.println(teksty[j]);
			j--;
		}
		
		System.out.println(">>>> Z For Each <<<<<");
		
		for(String var: teksty) {
			System.out.println(var);
		}
		
		n.close();
			
		
	}

}
