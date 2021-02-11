package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		List <TaxPayer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of tax payers");
		Integer n = sc.nextInt();
		for(int i = 1;i <=n;i++) {
			System.out.println("Tax payer #" + i + "data:" );
			System.out.print("Individual or company (i/c)");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income:");
			Double anualIncome = sc.nextDouble();
			if(ch == 'c') {
				System.out.print("Number of employees:");
				Integer numberOfEmployees = sc.nextInt();
				sc.nextLine();
				list.add(new Company(name, anualIncome, numberOfEmployees));					
			}else {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
		}
		Double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer tp : list) {
			Double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}
}
