package Hurtownia;

public class Test {
	
	public static void main (String[] args) { 
		Tires t1 = new Tires("Zimowa", "Michalein", "M123", 18, 60, 155);
		System.out.println(t1.NR +" "+t1.nazwa+" "+t1.model+" "+t1.seria+"/ "+t1.wysokosc+"/ "+t1.wysokosc);
		Rims r1 = new Rims("Super Felga", "BBS", "BBS123", 18); 
		System.out.println(r1.NR +" "+r1.nazwa+"/ "+r1.model+"/ "+r1.cale);

		Exhoust e1 = new Exhoust("Flamer", "Loud", "SuperTurboSpeed3000", false);
		System.out.println(e1.NR +" "+e1.nazwa+"/ "+e1.model+"/ "+e1.seria +" > "+ e1.stnd);

	}

}
