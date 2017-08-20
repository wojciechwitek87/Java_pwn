package j1;

public class testOperatory {

	public static void main(String[] args) {
		String hello = "Witaj ";
		String world = "Świecie!";
		String powitanie = hello + world; 
		System.out.println(powitanie);
		
		String czesc = powitanie.substring(0, 6) + "uczniu"; //wycina od  0 do 6 znaku z subsstringa 
		System.out.println(czesc);
	}

}
