package Owoce;

public class Apple extends Fruit {
	String odmiana; 
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Odmiana: " +odmiana);
	}
	
	public Apple (String odmiana) {
		super();
		this.odmiana = odmiana; 
		
		
	}
	


}
