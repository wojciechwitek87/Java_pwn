package dziedziczenie;

public class GetSetBazowa {
	
	public String imie; 
	private int pesel;
	public String nazwisko;
	public String getImie() {
		return imie;
	}
	private void infoBaza() {
		System.out.println();
	}
	public GetSetBazowa(String imie, int pesel) { //konstruktor
		super (pesel);
		this.rok = rok;
		this.imie = "Anonim"
		this.pesel = pesel;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public int getPesel() {
		return pesel;
	}
	public void setPesel(int pesel) {
		this.pesel = pesel;
	} 
	
	

	}


