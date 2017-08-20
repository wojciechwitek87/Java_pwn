package j1;

public class j88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jeden1 = "jeden "; 
		String dwa2 = "dwa ";
		String trzy3 = jeden1 + dwa2; 
		String cztery4 = trzy3 + "3 "; 
	//	char charat = trzy3.charAt(2);
	//	char charat = trzy3.charAt(5);

		System.out.println(trzy3.toUpperCase());
		System.out.println(cztery4.toLowerCase());

//j9
		System.out.println(cztery4.length());
		System.out.println("trzy3.charAt(2)" + "trzy3.charAt(5)");
		System.out.println(cztery4.charAt(cztery4.length()-3)); //length od 1 nie od 0
//wyswietl dwa pierwsze uzywajac czwatrego 
		int pierwszy = jeden1.length();
		int drugi = dwa2.length();
		int trzeci = trzy3.length();
		int czwarty = cztery4.length();

		System.out.println(cztery4.substring(0, pierwszy + drugi));

				

	}

}
