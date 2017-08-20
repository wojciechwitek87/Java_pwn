package dziedziczenie;

public class Zoo {

public static void main(String[] args) {

	Cat cat1 = new Cat();
	cat1.color = "Czarny";
	System.out.println("Zwierzęta dają głos: ");
	System.out.print("Kot: ");
	cat1.makeSound();
	
	Animal a1 = new Cat(); 
	a1.color = "RYŻY!";
	System.out.println(a1.color); 
	//a1.umaszczenie = "x"; 
	a1.makeSound();
	Object o1 = new Animal();
	Object o2 = new Syjam();
	
}

}