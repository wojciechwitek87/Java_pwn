package j1;

public class testKonwersja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter1 = 'k'; 
		char letter2 = 'o'; 
		char letter3 = 't'; 
		
		System.out.println("bledne \'sumwanie \'znakow: ");
		System.out.println((int)letter1);
		System.out.println((int)letter2);
		System.out.println((int)letter3);

		System.out.println(letter1+letter2+letter3);
		System.out.println("tekst jawny");
		System.out.println("" + letter1+letter2+letter3);
		
		letter1++;
		letter2++;
		letter3++; 
		System.out.println((int)letter1);
		System.out.println((int)letter2);
		System.out.println((int)letter3);
		
		System.out.println("tekst zaszyfrowany");
		System.out.println("" + letter1+letter2+letter3);

		letter1--;
		letter2--;
		letter3--; 
		System.out.println("tekst rozszyfrowany");
		System.out.println("" + letter1+letter2+letter3);
		
		int a = 5; 
		double b = 5.6; 
		System.out.println((int)b);

	//	double c = a/b; 
		int c = (int)(a/b);


		
		
		System.out.println(c);

	}

}
