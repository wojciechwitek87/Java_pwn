package j1;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jak Cię wołają? ");
		String imie; 
		Scanner odczyt = new Scanner(new FilterInputStream(System.in) {
		@Override
			public void close() {};			// zabezpieczenie przed zamknieciem funkcji
		}); 
	//	Scanner odczyt = new Scanner(System.in);
		imie = odczyt.nextLine();
		System.out.println("Witaj " +imie);
		odczyt.close();
		Scanner odczyt2 = new Scanner(System.in);
		String imie2 = odczyt2.nextLine();
		System.out.println("Witaj "+imie2);
		odczyt2.close();

		
	}

}
