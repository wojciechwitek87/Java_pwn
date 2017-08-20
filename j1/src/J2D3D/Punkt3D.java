package J2D3D;

public class Punkt3D extends Punkt2D {
	int z; 

	public Punkt3D (int x, int y, int z) { //konsytruktor
			super(x, y);		
			this.z = z;		
	}
	public void move(int a, int b, int c) { //metoda - void nic nie zwtaca, nie ma wartosci 
		super.move(a, b); 
		z = z + c; 
		}	
	public void print() {
		System.out.println("3D - Aktualne pol.: ["+x+", "+y+", "+z+"]");

		
	}
	public Punkt3D() {
		
	}

	
}