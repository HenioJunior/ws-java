package _130_classesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<Account>();

		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingsAccount(1003, "Bob",300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.00, 500.00));

		//Classe abstrata não pode ser instanciada
		//Account acc1 = new Account(1001, "Alex", 1000.00);


		Double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance %.2f %n", sum);

		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());

		}
	}
}
