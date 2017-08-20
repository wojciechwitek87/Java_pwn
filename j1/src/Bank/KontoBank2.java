package Bank;

public class KontoBank2 extends KontoBankowe {
	@Override
	 void interest(int nrKonta, int saldo) {
		System.out.println("Dane rachunku: \nnr rachunku: " +nrKonta+ "\nsaldo: " +saldo);
	}
	@Override
	void addDebit() {
		System.out.println("Nie uznajemy debetow");
	}
	

}
