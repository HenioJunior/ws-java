package _126_classeFinal;

public class SavingsAccountPlus extends SavingsAccount {
	//final no método
	@Override
	public void withDraw(Double amount) {
		balance -= amount + 2.0;
		
	}
	
}
