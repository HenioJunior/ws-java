package _068_exercicios;

import java.util.Scanner;


public class Program2 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Name: ");
		employee.name = sc.nextLine();

		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);

		System.out.println();

		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		
		System.out.println("Updated data: " + employee);
	}

}
