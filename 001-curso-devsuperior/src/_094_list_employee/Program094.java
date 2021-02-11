package _094_list_employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program094 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List <Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1 ; i<=n ; i++) {
			System.out.println("Employee " + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		//Integer pos = position(list, idSalary);
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage:");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}

		System.out.println("List of employees: ");
		for(Employee object : list ) {
			System.out.println(object);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
