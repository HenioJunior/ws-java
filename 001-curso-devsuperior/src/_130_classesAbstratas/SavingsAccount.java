package _130_classesAbstratas;

	public class SavingsAccount extends Account {

		private Double interestRate;

		public SavingsAccount() {
			super();
		}

		public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
			super(number, holder, balance);
			this.interestRate = interestRate;
		}

		public Double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(Double interestRate) {
			this.interestRate = interestRate;
		}

		public void updateBalance() {
			balance += balance * interestRate;

		}
		
		/*Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretanto, se a conta
		for do tipo poupança, esta taxa não deve ser cobrada. Como resolver isso?
		Resposta: sobrescrevendo o método withdraw na subclasse SavingsAccount */
		
		@Override
		public void withDraw(Double amount) {
			balance -= amount;
		}
	}
