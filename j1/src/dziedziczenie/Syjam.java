package dziedziczenie;

final public class Syjam extends Cat{

	public static void main(String[] args) {
		Syjam s1 = new Syjam(); 
		s1.umaszczenie = "bialy";
		s1.liczbaNog = 4; 
		
		System.out.println("kolor: " + s1.umaszczenie + " " + s1.liczbaNog + "-nogi");
		s1.makeSound();
	}

}
