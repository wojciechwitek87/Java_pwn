package obiekty1;

import java.util.ArrayList;

public class company {
	ArrayList<String> al = new ArrayList<String>(); 

	company(ArrayList<String> al){
		this.al = al;
		for(String p : al) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> pracownicy = new ArrayList<String>(); 
		Employee p1 = new Employee ("Adam", "Kowalski", "1987-02-02", 23 );
		pracownicy.add(p1.info());
		Employee p2 = new Employee ("Jan", "Nowalski", "1983-02-02", 22 );
		pracownicy.add(p2.info());
		Employee p3 = new Employee ("Kamil", "Rogalski", "1984-02-02", 24 );
		pracownicy.add(p3.info());
		Employee p4 = new Employee ("Ada", "Kowalska", "1985-02-02", 21 );
		pracownicy.add(p4.info());
		
		company szef1 = new company(pracownicy); 
	//	szef1.szefInfo();
}

}
