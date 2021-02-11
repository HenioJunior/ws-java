package _028_exercicios;

import java.util.Scanner;

public class Program028_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		System.out.printf("A = %.4f", area(raio));
		
		sc.close();
	}
		
		
		
		public static double area(double raio) {
			return Math.PI * Math.pow(raio, 2);
		}
}
