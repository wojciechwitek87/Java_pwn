package obiekty1;

public class Employee {

	String imie;
	String nazwisko, rokur;
	int stazpracy;
	
	Employee(String imie, String nazwisko, String rokur, int stazpracy){
			this.imie = imie; 
			this.nazwisko = nazwisko; 
			this.rokur = rokur; 
			this.stazpracy = stazpracy;
			}
public String info() {

return "Pracownik: "+ imie +" "+nazwisko+" (rok: "+rokur+", staż: "+stazpracy+ ")";
}
	public static void main(String[] args) {

		
	}

}
