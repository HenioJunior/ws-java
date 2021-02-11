package _080_exer_account;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
				
		System.out.println("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit(y/n)? ");
		System.out.println();
		char response = sc.next().charAt(0);

		//Account account = new Account(number, holder, balance);

		if (response == 'y') {

			System.out.println("Enter an initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else
		{
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);

		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println("Enter a withdraw value: ");
		double withDraw = sc.nextDouble();
		account.withdraw(withDraw);

		System.out.println("Updated account data:");
		System.out.println(account);

		
		
		
		
		sc.close();
	}

}
