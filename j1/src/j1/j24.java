package j1;

import java.io.FilterInputStream;
import java.util.Scanner;

public class j24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner l = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close () {}
		});

		System.out.println("wspak: ");
		String napis = l.nextLine();
		StringBuffer napis1 = new StringBuffer(napis);
		System.out.println(napis1.reverse());
		
		System.out.println(napis.length());
		
	}
}
