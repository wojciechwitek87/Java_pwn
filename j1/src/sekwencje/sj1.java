package sekwencje;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class sj1 {
	
	public static void main(String[] args) {
		
	// ArrayList		
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Ala");
		lista1.add("Ola");
		lista1.add("Ala");
		System.out.println(lista1);
		
		for(String s: lista1) {
		//*System.out.println(lista1.get(2));
			System.out.print(s + " ");
		}
		System.out.println("\nWielkosc lietry: " +lista1.size());
		lista1.remove(1); 
		System.out.println(lista1);
		lista1.remove("Ala");
		System.out.println(lista1); 
		lista1.set(0, "Ela"); 	// nadpisuje  liste 
		System.out.println(lista1);
		//lista1.set(1, "Ola");
		lista1.add(1,"dupa");
		System.out.println(lista1);
	
	//HashSet	
		HashSet<Integer> zbior = new HashSet<Integer>();
		zbior.add(2);
		zbior.add(22);
		zbior.add(3);
		zbior.add(6);
		zbior.add(-3);
		zbior.add(-3);
		System.out.println(zbior);
		HashSet<Integer> zbior2 = new HashSet<Integer>();
		zbior2.addAll(zbior);
		System.out.println(zbior2);
		HashSet<String> zbior3 = new HashSet<String>();
		zbior3.add("aa");
		zbior3.add("bb");
		zbior3.add("ab");
		zbior3.add("bsajbdek");
		System.out.println(zbior3);
		System.out.println(zbior3.contains("ab"));
		System.out.println(zbior2.contains(22));
		System.out.println(zbior3.size());
		System.out.println(zbior3.remove("bb"));
		System.out.println(zbior3);
		zbior3.clear(); 
		System.out.println(zbior3.isEmpty());
		
	//Mapy
		HashMap<Integer, String> mapa = new HashMap<Integer, String>(); 
		mapa.put(10, "dziesięć");
		mapa.put(11, "jedenascie");
		mapa.put(14, "czetrnascie");
		mapa.put(16, "szesnascie");
		System.out.println(mapa.get(10));
		System.out.println(mapa.get(13));
		
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		mapa.remove("dziesięć");
		System.out.println(mapa);

	//kolejki
		ArrayDeque<String> stos = new ArrayDeque<String>();
		stos.add("napis1"); 
		stos.add("napis2"); 
		stos.add("napis3"); 
		stos.add("napis4"); 
		System.out.println(stos);
		stos.addLast("napis Koncowy"); 
		stos.addFirst("napis pocztakowy");
		System.out.println(stos);
		String a = stos.pollFirst(); //pobiera pocztkowy/last-koncowy
		System.out.println(a);
		String b = stos.getLast(); //pobiera pocztkowy/last-koncowy
		System.out.println(b);
		stos.remove("napis2"); 
		System.out.println(stos);
		System.out.println(stos.size());
		System.out.println(stos.hashCode());
		


	}
}
