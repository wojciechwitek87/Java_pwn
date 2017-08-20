package Polimorfizm;

public class OrgTestowe {

	public static void main(String[] args) {
		Bakteria b1 = new Bakteria(); 
		b1.przypiszDna("fgvhbjk765");
		b1.zmienSzkodliwosc("wyjątkowy zjadliwy drab");
		b1.info();
		
		Zwierz z1 = new Zwierz(); 
		z1.przypiszDna("01010101001010");
		z1.zmienNogi(17);
		z1.info();

		Roślina r1 = new Roślina(); 
		r1.przypiszDna("01roślinne01010");
		r1.ZmienDl_lodygi(1000);
		r1.info();
		
		
		//Organizm o1 = new Organizm(); 
		
		
		
		
	}

}
