package j65_magazyn;

import java.util.Scanner;

public class Terminal {
	
	public static void main(String[] args) {
		Magazyn m1 = new Magazyn();
		Scanner menu = new Scanner(System.in);
		
		while(true){
			System.out.println("Co chcesz zrobić: (D)odaj, (U)sun, (L)ista, (W)yjdź: ");
			String m = menu.nextLine();
			if(m.equals("D")){
				m1.dodajProdukt(m1);
			} 
			if (m.equals("L")){
				m1.stanyProdukty();
			}
			if (m.equals("U")){
				m1.usunProdukt(m1);
			}
			if (m.equals("W")){
				System.out.println("End");
				break;
			}
		}
		menu.close();
	}

}
