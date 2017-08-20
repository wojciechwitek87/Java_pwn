package j1;

public class j9 {

	public static void main(String[] args) {
		
		int a = 17;
	//	int b = 4;
	//	int c = a+b;
		
		double b = 4;
		double c = a+b; // by podal reszte nie zaokraglenie do niezmiennoprzcinkwej
		
		System.out.println(c);
		c = a-b;
		System.out.println(c);
		c = a*b;
		System.out.println(c);
		c = a/b;
		System.out.println(c);
		c = a%b;
		System.out.println(c);

		a += b;
		System.out.println(a);
		a *= b;
		System.out.println(a); 
		a /= b;
		System.out.println(a);
		a -= b;
		System.out.println(a); 
		a %= b;
		System.out.println(a);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);



	}

}
