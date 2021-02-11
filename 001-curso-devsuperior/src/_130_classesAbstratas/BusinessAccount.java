package _130_classesAbstratas;

public class BusinessAccount extends Account {
	
	Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
		balance += amount - 10.0;
		}
	}
	
	/* so e possivel chamar a implementacao da superclasse usando a palavra super.
	 * Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja
	 * realizar o saque normalmente da superclasse, e descontar mais 2.0. */
	
	@Override
	public void withDraw(Double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
	}