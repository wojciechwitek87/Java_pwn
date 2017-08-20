package Java_reaktor_petle;

import java.io.FilterInputStream;
import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close () {}
		});

		System.out.println("ile razy wypisać wyraz :");
		int liczba = n.nextInt();
		n.nextLine();

		String[] teksty = new String[liczba];
		
	/*	for(int i = 0; i<liczba; i++ ){
		
			System.out.println("Witaj!" + i );
		}
	*/
		for(int i = 0; i< liczba; i++) {
			System.out.println("Podaj tekst do wyswietlenia: "+(i+1));
			teksty[i] = n.nextLine();

		}
		int i = 0;
		while ( i<liczba) {
			System.out.println(teksty[i]);
			i++;
		}
		n.close();
	}
		
}
		
		
		
	


