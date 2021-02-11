package _035_exercicios;

import java.util.Scanner;

public class Program035_3 {

	public static void main(String[] args) {
		int a, b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o 1º número:");

		a = sc.nextInt();

		System.out.println("Informe o 2º número:");

		b = sc.nextInt();




		if (a % b ==0 || b % a ==0) {
			System.out.println("Sao Multiplos");
		}else 
			System.out.println("Nao sao Multiplos");

		sc.close();

	}

}
