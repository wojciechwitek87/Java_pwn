package j1;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100; 
		int b = 10; 
		int c = 50; 
		
		if (a>b) {
			
			if (a>c) {
			System.out.println("A > B oraz A > C");
			}
			else if (a==b) {
			System.out.println("A == B ");
			}
			else {
				System.out.println("A < B oraz  A != B");
			}

		}
	}
			
}
