package _035_exercicios;

import java.util.Scanner;

public class Program_Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 1;
		System.out.println("Insira um valor para o qual deseja calcular seu fatorial: ");
		int f = sc.nextInt();
		double[] vect = new double[f];
		for (int i = 0; i <= f; i++) {
			vect[i] = fatorial(f);
			soma += 1 / vect[i];
			f--;
		}
		soma = 1 + soma;

		showResult(soma);

		sc.close();
	}

	public static int fatorial(int x) {

		int fat;
		for (fat = 1; x > 1; x--) {
			fat = fat * x;
		}
		return fat;
	}

	public static void showResult(double value) {
		System.out.println("Soma = " + value);
	}
}

