package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n; i++) {
            System.out.println("Employee #" + (i + 1));

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)){
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

            System.out.println();
            System.out.print("Enter the employee id that will have salary increase : ");
            int empId = sc.nextInt();
            Employee emp = list.stream().filter(x -> x.getId() == empId).findFirst().orElse(null);
            if(emp == null){
                System.out.println("This id does not exist!");
            }
            else{
                System.out.print("Enter the percentage: ");
                Double percentage = sc.nextDouble();
                emp.increaseSalary(percentage);
            }

            System.out.println("List of employees: ");
            for(Employee obj : list){
                System.out.println(obj);
            }
            sc.close();
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

