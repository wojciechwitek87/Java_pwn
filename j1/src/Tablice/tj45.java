package Tablice;

import java.util.Random;

public class tj45 {
	public static void main(String[] args) {
	/*	
		int[][] tab = new int[5][5]; 
		Random gen = new Random(); 
			for (int i = 0; i<tab.length; i++) {
				for (int j = 0; j<tab.length; j++) {
					tab[i][j] = gen.nextInt(11) -5;
				System.out.print(tab[i][j] +" "); 
				}
				System.out.println("");
			}
			int Max = [0][0];
			int Min = [0][0];
			int[][]MaxMin = new int [2][5];
			for (int j = 0; j<tab.length; j++) {
				for (int i = 0; i<tab[j].length; i++) {
				if(Min > tab[i][j]) {
					Min = tab[i][j];
			}
			/// System.out.println(Min);
				if(Max < tab[i][j]) {
					Max = tab[i][j];
					}
				}	
				MaxMin[0][j] = Max;
				MaxMin[1][j] = Min;
				Max = 0;
				Min = 0;
			}
			//Wypisywanie
			System.out.println("");
			for(int i = 0; i<MaxMin.length; i++){
				for(int j = 0; j<MaxMin[i].length; j++){
					System.out.print(MaxMin[i][j]+"\t");
				}
				System.out.println("");
			}
		}			
	}
	*/
		
		int[][] tabl = new int[5][5];
		//generowanie
		Random generator = new Random();
		for(int i = 0; i < tabl.length; i++){
			for(int j = 0; j < tabl[i].length; j++){
				tabl[i][j] = generator.nextInt(11)-5;
			}
		}
		//wypisywanie
		for(int i = 0; i < tabl.length; i++){
			for(int j = 0; j < tabl[i].length; j++){
				System.out.print(tabl[i][j]+"\t");
			}
			System.out.println("");
		}
		//liczymy minima i maksima
		int tempMin = tabl[0][0];
		int tempMax = tabl[0][0];
		int[][] maxMin = new int[2][5];
		for(int j = 0; j<tabl.length; j++){
			for(int i = 0; i<tabl[j].length; i++){
			//System.out.print(tabl[i][j]);
			if(tempMin>tabl[i][j]){
				tempMin = tabl[i][j];
			}
			if(tempMax<tabl[i][j]){
				tempMax = tabl[i][j];
				}
			}
			maxMin[0][j] = tempMax;
			maxMin[1][j] = tempMin;
			tempMax = 0;
			tempMin = 0;
		}
		//Wypisywanie
		System.out.println("");
		for(int i = 0; i<maxMin.length; i++){
			for(int j = 0; j<maxMin[i].length; j++){
				System.out.print(maxMin[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}

