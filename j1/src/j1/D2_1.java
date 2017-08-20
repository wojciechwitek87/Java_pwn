package j1;
import static java.lang.Math.*;

import java.math.BigInteger;
public class D2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 5; 
		double y = 9.0; 
		long i = 123456754323456543l; 
		long j = 765457767878909876l;
		long z = i+j; 
		System.out.println(z);
		
		BigInteger bigIntJ = BigInteger.valueOf(j);
	//	BigInteger bigBigInt = new BigInteger("575456786557876567876787656789");
		BigInteger bigBigInt = new BigInteger("9898239239");
		System.out.println(bigIntJ.toString());

		BigInteger bigIntI = BigInteger.valueOf(i);
		BigInteger temp = bigIntJ.add(bigIntI);
		System.out.println(temp.toString());
		System.out.println(bigIntI.toString());


		double pierwiastek = sqrt(y); 
		double potega = pow(y, x); 
		System.out.println("Pierwiastek z " + y + "wynosi: " +pierwiastek);
		System.out.println("Liczba " + y + " podniesienie do potęgi " + x + " to: " + potega);

	}

}
