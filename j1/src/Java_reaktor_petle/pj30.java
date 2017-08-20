package Java_reaktor_petle;

import java.util.Scanner;

///import javax.swing.plaf.synth.SynthSpinnerUI;

public class pj30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pobiera liczbe calkowita i wyswietls wszytkie loczby nieparzyste nie wieksze od podaej 
		
		Scanner n = new Scanner(System.in);
		System.out.println("Podaj liczbe całkowita wieksza od zera: ");
		int liczba = n.nextInt();
		while (liczba<0) {
			System.out.println("Podaj liczbe wieksza od zera!!!");
			liczba = n.nextInt();
		}
		
		for (int i=1; i<=liczba; i+=2) {
			System.out.println(i);	
		}
		
				
		n.close();
	}

}
