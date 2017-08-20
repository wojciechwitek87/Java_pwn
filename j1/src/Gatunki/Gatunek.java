package Gatunki;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
 * StwÛrz program Gatunki w ktÛrym bÍdzie utworzonych kilka obiektÛw typu GatunekKlasa Gatunek powinna zawieraÊ:
pola przechowujπce: nazwÍ rodzaju
nazwÍ gatunkowπ
liczbÍ chromosomÛw
Opis metody:

podajπcπ pe≥nπ nazwÍ (Rodzaj + gatunek)
podajπcπ liczbÍ chromosomÛw

wypisujπcπ wszystkie dane Gatunek o wartoúciach pÛl takich samych jak w
obiekcie, w ktÛrym zosta≥a wywo≥ana.
W programie powinny byÊ uøyte wszystkie metody
 */

public class Gatunek {
	
	String nazwaGatunku, rodzaj;
	int liczcbaChromosomow;
	Chromosom[] tabChromosomow; 
	
	
	
	
	static ArrayList<Gatunek> listaGatunkow = new ArrayList<>();
	
	public Gatunek(String nazwaGatunku, String rodzaj, int liczcbaChromosomow) {
		super();
		this.nazwaGatunku = nazwaGatunku;
		this.rodzaj = rodzaj;
		
		this.liczcbaChromosomow = liczcbaChromosomow;
		this.tabChromosomow = new Chromosom[liczcbaChromosomow];
		
		//uzupe≥nianie tabeli z chromosomami
		Random rand = new Random();
		for(int i = 0; i < tabChromosomow.length; i++) {
			tabChromosomow[i] = new Chromosom(i+1, rand.nextInt(50));
		}
		
		listaGatunkow.add(this);
	}
	
	public String printChromosomy() {
		
		String chromosomy = "";
		
		for(int i = 0; i < this.tabChromosomow.length; i++) {
			chromosomy = chromosomy + "chromosom: " + (i+1) +
					"\tdlugsc: "+this.tabChromosomow[i].dlugoscRamieniaChromosomu+"\n";
		}
		
		return chromosomy;
	}
	

	public String printRodzajGatunek() {
		return "rodzaj: " + this.rodzaj + " gatunek: " + this.nazwaGatunku;
	}

	public String printLiczbaChromosomow() {
		return "liczba chromosomow: " + this.liczcbaChromosomow;
	}
	
	public String printWszystkieDane() {
		return  this.printRodzajGatunek() +"\n"+
				this.printLiczbaChromosomow()+"\n" + this.printChromosomy();
	}
	
	
	
	public void wypiszGatunki() {
		for(Gatunek v : listaGatunkow) {
			if(v.rodzaj.equals(this.rodzaj)){
				System.out.println(v.printWszystkieDane()+"\n");
			}
		}
	}

	// metoda main
	public static void main(String[] args) {
		Gatunek orzelBielik = new Gatunek("bielik", "orzel", 3);
		Gatunek orzelPrzedni = new Gatunek("przedni", "orzel",2);
		Gatunek orzelBielik2 = new Gatunek("bielik2", "orzelffff", 4);
		Gatunek orzelBielik3 = new Gatunek("bielik3", "orzel", 2);
		Gatunek kot1 = new Gatunek("europejski", "kot", 3);
		Gatunek kot2 = new Gatunek("rosyjski", "kot", 2);
		
		kot2.wypiszGatunki();
		
		Scanner scan = new Scanner(System.in); 
		
		
	}
	

}