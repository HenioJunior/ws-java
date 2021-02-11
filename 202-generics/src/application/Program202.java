package application;

import java.util.Scanner;

import services.PrintServiceG;

public class Program202 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintServiceG<Integer> ps = new PrintServiceG<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++){
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
			
		sc.close();
	}

}
