package J2D3D;

public class Punkt2D {
	int x; 
	int y; 	//deklaacja pol

	Punkt2D(){
		this.x = 0; //konstr.bezarg
		this.y = 0; 
	}
	Punkt2D(int x, int y){
		this.x = x; //konstr.bezarg
		this.y = y; 
		
	}
	public void move(int a, int b) {
	this.x = x +a ; 
	this.y = y +b ; 
	}
	public void print() {
		System.out.println("2D - Aktualne pol.: ["+x+", "+y+"]" );
	

	}

}
