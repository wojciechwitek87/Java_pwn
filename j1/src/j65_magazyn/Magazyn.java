package j65_magazyn;

import java.util.ArrayList;
import java.util.Scanner;

public class Magazyn {
	private String nazwa; 
	private int cena;
	private int ilosc;
	public int id = 1;
	public ArrayList<Magazyn> produkty = new ArrayList<Magazyn>();
	Scanner sc = new Scanner(System.in);
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public void dodajProdukt(Magazyn m1){
		sc.nextLine();
		
		System.out.println("Podaj nazwę: ");
		m1.setNazwa(sc.nextLine());
		System.out.println("Podaj cenę: ");
		m1.setCena(sc.nextInt());
		System.out.println("Podaj ilość: ");
		m1.setIlosc(sc.nextInt());
		produkty.add(m1);
	}
	public void usunProdukt(Magazyn m1){
		System.out.println("Podaj id produktu do usunięcia: ");
		id = sc.nextInt();
		produkty.remove(id-1);
		System.out.println("Produkt usunięto");
	}
	public void stanyProdukty(){
		for(Magazyn m1 : produkty){
		System.out.println("-------------------------------------------------");
		System.out.println("nazwa: " + id);
		System.out.println("nazwa: " + m1.getNazwa());
		System.out.println("cena:  " + m1.getCena() + " zl");
		System.out.println("ilosc: " + m1.getIlosc() + " szt.");
		System.out.println("-------------------------------------------------");
		}
	}
}
