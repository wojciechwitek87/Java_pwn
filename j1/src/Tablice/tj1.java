package Tablice;

public class tj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] tab = new int [3][3]; 
		tab [0][0] = 1; 
		tab [0][1] = 2; 
		
		int [][] tab2 = {{1,2,3,5,6},{4,5,6,6,7},{2,3,7,8,9}}; //wiersze
		
		
		for (int i = 0; i <= tab2.length -1; i++ ) {
			for (int j = 0; j <= tab2[i].length - 1; j++ ) {
				System.out.print(tab2[i][j]);
			}
			System.out.println("");
		}
		
	/*	
		System.out.println(tab2 [0][0]);  // najpierw wiersze potem kolumny, począwszy od 0 
		System.out.println(tab2 [0][1]);
		System.out.println(tab2 [1][0]);
	*/
		String [][][] tab3 ={
							{ {"a1" , "a2"} , {"a3" , "a4"} } ,
							{ {"b1" , "b2"} , {"b3" , "b4"} }
							};
		System.out.println(tab3[1][0][1]);
		
		System.out.println(tab2[0].length);
		System.out.println(tab2.length);		// dlugosc pierwszego wymiaru
		System.out.println(tab2[1].length);	//dlugosc drugiego wymiaru
		
//----------------------------------------------------------------------------------------------
		
		String[] firstNames = {"Karol", "Basia", "Kasia"};
		String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};
		String[][] firstLast = {firstNames, lastNames}; 
		for (int i = 0; i<= firstNames.length - 1; i++) {
				System.out.print(firstLast[0][i]);
				System.out.print(" ");
				System.out.print(firstLast[1][i]);
				System.out.println("");
		}
		}
		
		
		
		
	}


