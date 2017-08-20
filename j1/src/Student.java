
public class Student {
	private String imie, nazwisko; 
	private int index; 
	private static int id; 
	
	public Student (String imie, String nazwisko, int index) {
		id ++; 
		this.imie = imie; 
		this.nazwisko = nazwisko; 
		this.index = index; 
		
		System.out.println("Mamy już: " + id+ " studentow!");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
