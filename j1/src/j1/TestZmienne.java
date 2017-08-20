package j1;

public class TestZmienne {

	public static void main(String[] args) {

		String words = " Jeden dwa trzy cztery piec szesc siedem ";
		String sub1 = words.substring(2, 7); 
		String sub2 = words.replaceAll("dwa", "hehe");	 //zamiana ciągów znaków
		String sub3 = words.trim();						//wycina znaki " " spacja
		char charat = words.charAt(2);
		String[] tab = {};
		
		System.out.println(words);
		System.out.println("words.substring(2, 7)");
		System.out.println(sub1);
		System.out.println("words.replaceAll(\"dwa\", \"hehe\")"); 
		System.out.println(sub2);
		System.out.println("words.trim()");
		System.out.println(sub3);
		System.out.println("words.charAt(2)");
		System.out.println(charat);
		StringBuffer nowyBufor = new StringBuffer(words); //klasa obiekt bufor typu stringbuff
		nowyBufor.append("dodaj cia znakow"); 
		System.out.println(nowyBufor);
		System.out.println("tab");


		
	}

}
