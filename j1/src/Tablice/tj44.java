package Tablice;

import java.util.Random;

public class tj44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = new int[20]; 
		Random gen = new Random(); 
			for (int i = 1; i<tab.length; i++) {
				tab[i] = gen.nextInt(10) +1 ;
				System.out.print(tab[i] +"; "); 
			}
			
	for (int i = 1; i<11; i++) {
		int counter = 0; 
		for (int j = 0;  j<tab.length; j++) {
			if (tab[j] == i) {
				counter++;
			}
		}
		if (counter != 0) {
	System.out.print("\n" +i + " powtarza się w tabicy " + counter + " razy");
		}
}
	}

}
