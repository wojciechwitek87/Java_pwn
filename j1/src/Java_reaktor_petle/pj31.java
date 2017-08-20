package Java_reaktor_petle;

import java.util.Scanner;

public class pj31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n = new Scanner(System.in);
		System.out.println("Podaj pierwszy wyraz: ");
		String wyraz1 = n.nextLine();
		System.out.println("Podaj drugi wyraz: ");
		String wyraz2 = n.nextLine();
		
		char znak = wyraz2.charAt(wyraz2.length()-3);		//znajduje separator (index)
		System.out.println("separator to: " + znak);
		String sep = String.valueOf(znak); 
		String[] tab = wyraz1.split(sep); 				//split do tablicy
		for (String v:tab) { 							//v value of tab
			System.out.println(v); 						//print values of tab
		}
		
		n.close();


	}

}
