package Polimorfizm;

public class Roślina extends Organizm {
	
	int dl_lodygi; 
	
	public String przypiszDna(String DNA) {
		super.przypiszDna(DNA);
		return DNA; 
	} 
	public void ZmienDl_lodygi(int dl_lodygi){
		this.dl_lodygi = dl_lodygi; 
	}
	//@Override; 
	public void info() {
		System.out.println("roslina ");

		System.out.println("DNA: " +DNA+ "dl.lodygi: " +dl_lodygi);
	}
	

}
