package _080_exer_account;

public class Account {
	private String holder;
	private int number;
	private double balance;
		
	public static double TAX = 5.00;
		
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
		}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
		}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
			
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0 ;
	}

	public void setWithDraw(double withDraw) {
		this.balance += -withDraw - TAX;
		
	}
	
	public String toString() {
		
		return "Account "
		+ getNumber()
		+ ", Holder: "
		+ getHolder()
		+ ", Balance: $ "
		+ String.format("%.2f", getBalance());
		
		
		
	}

	
	
	
}
