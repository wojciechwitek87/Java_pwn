package sekwencje;

import java.util.ArrayList;
import java.util.Scanner;

public class sj49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList = new ArrayList<String>();
	    Scanner n = new Scanner(System.in);
	    System.out.println("podaj wyrazy az do end: ");
	    String list = n.nextLine();
while(!list.equals("end")) {	    
	arrList.add(list);
	list = n.nextLine();
}
	    System.out.println(list);
	    System.out.println(arrList);

	    n.close();

	}

}
