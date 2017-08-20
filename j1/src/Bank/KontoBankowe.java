package Bank;

public abstract class KontoBankowe {

	int nrKonta; 
	int saldo;
	
	public void addSaldo(int kwota) {
		this.saldo = saldo + kwota;
		
	}
	public void subbSaldo(int sub) {
		this.saldo = saldo - sub; 
	}
	
	
	abstract void interest(int nrKonta, int saldo); 
	abstract void addDebit(); 
	
	
	public static void main(String[] args) {


	}

}
