package j1;

public class testyOperLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5; 
		int y = 10; 
		System.out.println("X>Y " + (x>y));
		System.out.println("X<Y " + (x<y));
		System.out.println("X!=Y " + (x!=y));
		System.out.println("X==Y " + (x==y));
		boolean instance = "Kasia" instanceof String; //sprawdza czy kasia to string
		System.out.println(instance);
		
		System.out.println("nowe");
		
		System.out.println(!(x>y)); // ! negacja 
		System.out.println((x>y)||(x<y)); // || alternatywa
		System.out.println((x>y)&&(x<y)); // $$ koniunkcja

		int wynik = x<y?x:y; // jeśli war(x<y) jest prwadą zwróć x (:) jeśli falsz zwróc y 
		System.out.println(wynik);

////

	}

}
