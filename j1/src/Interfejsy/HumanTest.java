package Interfejsy;

public class HumanTest implements Human, Animal {
	
	public String imie, nazwisko; 
	
	
	public HumanTest(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	@Override
	public void printInfo() {
		System.out.println(rodzaj +" "+ gatunek +" "+imie+" "+ nazwisko);
	}
	@Override
	public void info() {
		System.out.println(rodzina);
	}

	public static void main(String[] args) {
		HumanTest ht1 = new HumanTest("Michał", "Kruczkowski ");
		ht1.printInfo();
		ht1.info();
	}


}
