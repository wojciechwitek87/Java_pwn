package Java_reaktor_petle;

import java.util.Scanner;

public class pj34 {
public static void main(String[] args) {
	
	
	Scanner n = new Scanner(System.in); 
	System.out.println("Podaja liczbe A: ");
	int A = n.nextInt();
	n.nextLine(); 
	System.out.println("Podaja liczbe B: ");
	int B = n.nextInt();
	
	if (A<B) {
		int suma = 0; 
		while (A<=B) {
			suma = suma + A; 
			A = A+1; 
		}
		System.out.println(suma);
	}else {
			System.out.println("zle liczby");
		}
		
	n.close();

	}

	
	
}
