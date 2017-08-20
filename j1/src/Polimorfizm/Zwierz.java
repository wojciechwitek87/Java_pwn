package Polimorfizm;

public class Zwierz extends Organizm {
	int liczbaNog = 4; 
	
	public String przypiszDna(String DNA) {
		super.przypiszDna(DNA);
		return DNA; 
	}
	public void zmienNogi(int liczbaNog){
		this.liczbaNog = liczbaNog; 
	}
	
	public void info() {
		System.out.println("zwierz ");

		System.out.println("DNA: " +DNA+ "ilosc nog: " +liczbaNog);
	}
}
