package j1;
import static java.lang.Math.*;

import java.math.BigInteger;
public class j17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = BigInteger.valueOf(123456754323456543l); 
		BigInteger b = BigInteger.valueOf(765457767878909876l);
	
		BigInteger c = a.add(b);
		BigInteger d = a.subtract(b);
		BigInteger e = a.multiply(b);
		BigInteger f = b.divide(a);
		
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
	
		int x = 4;
		int y = 3;
		double r = 5.5; 
		System.out.println(sqrt(x));
		System.out.println(pow(x, y));
		System.out.println(round(Math.PI*r*r) + " pole");
		System.out.println(round(2*Math.PI*r) + " obwod");

		
	
	
	}

	
}
