package j53;

import java.util.ArrayList;

public class Sprzedarz {
	ArrayList<Double> lista = new ArrayList<Double>();
	public void utarg(ArrayList<Double> lista){
		this.lista = lista;
		
		for(Double i : lista){
			System.out.println("netto " + i);
			System.out.println("brutto " + i*1.23);
		}
	}
		
	public static void main(String[] args) {
		ArrayList<Double> sklep = new ArrayList<Double>();
		Produkty p1 = new Produkty();
		sklep.add(p1.oblicz());

		
		Sprzedarz statystyka = new Sprzedarz();
		statystyka.utarg(sklep);
	}

}
