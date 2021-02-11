package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		
		try {
		System.out.print("Enter amount for withdraw:");
		Double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.print(account);
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
			
		
	}

}
