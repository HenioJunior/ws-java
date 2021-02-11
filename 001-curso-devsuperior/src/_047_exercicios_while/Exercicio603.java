package _047_exercicios_while;

import java.util.Scanner;

public class Exercicio603 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o código do combustível:");
		int x = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;

		while (x != 4) {

			if (x == 1) {
				alcool++;
			} else if (x == 2) {
				gasolina++;
			} else if (x == 3) {
				diesel++;
			}

			System.out.println("Informe o código do combustível:");
			x = sc.nextInt();

		}
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

	}

}
