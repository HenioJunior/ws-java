package _035_exercicios;

import java.util.Scanner;

public class Program035_2 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número:");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		}else 
			System.out.println("IMPAR");
		
		sc.close();

	}

}
