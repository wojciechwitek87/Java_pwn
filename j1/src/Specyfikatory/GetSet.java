package Specyfikatory;

public class GetSet {
	private int a; 
	private String b;
	private boolean c; 
	private char znaczek; 
	
	
	
	public char getZnaczek() {
		return znaczek;
	}
	public void setZnaczek(char znaczek) {
		this.znaczek = znaczek;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	public GetSet() {}
	public GetSet(int a, String b, boolean c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c; 
		
	}
	
}
