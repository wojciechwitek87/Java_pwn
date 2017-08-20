package Tablice;

import java.util.Random;

public class tj43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab = new int[10]; 
		Random gen = new Random(); 
			for (int i = 0; i<tab.length; i++) {
				tab[i] = gen.nextInt(21) -10;
				System.out.print(tab[i] +"; "); 
			}

		int tempMax = tab[0];
		int tempMin = tab[0];
		for (int i = 0; i<=tab.length -1; i++) {
			if(tempMax < tab[i]) {
				tempMax = tab[i];
			}
			if(tempMin > tab[i]) {
				tempMin = tab[i];
			}
		}
	System.out.print("/ Najmniejszy: " +tempMin+  "; Najwiekszy:" +tempMax+ " / " );
	
	//srednia
			int sum = 0;
			for (int i = 0; i<= tab.length - 1; i++){
				sum += tab[i];
			}
			float ave=sum/tab.length;
			System.out.print("\nŚrednia arytmetyczna: "+ave);
			//ile elementów jest > a ile mniejszych od sredniej
			int licznikM = 0;
			int licznikW = 0;
			for(int i = 0; i<=tab.length-1; i++){
				if(tab[i]>ave){
					licznikW ++;
				}
				if(tab[i]<ave){
					licznikM ++;
				}
			}
			System.out.print("\nLiczba elementów większych od średniej: "+licznikW);
			System.out.print("\nLiczba elementów mniejszych od średniej: "+licznikM);
		}

	}
