package Tablice;


public class tj47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int [][] tab1 = new int [3][3]; 
		int [][] res = new int [3][3]; 
	for(int i = 0; i<tab1.length; i++) {
		for(int j = 0; j<3; j++ ) {
			if (i==j) {
				tab1[i][j] = 1; 
			}				System.out.print(tab1[i][j]);
} System.out.println("");}
	for(int i = 0; i<3; i++) {
		for(int j = 0; j<tab1.length; j++) {
			res[i][j] = tab1[i][j] + tab1[i][j];
			System.out.print(res[i][j]);
			}
		System.out.println("");
			}
		}
	
	}


