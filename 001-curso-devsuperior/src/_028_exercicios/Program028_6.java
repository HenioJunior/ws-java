package _028_exercicios;

import java.util.Scanner;

public class Program028_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
						
		System.out.printf("TRIANGULO %.3f%n", areaTriangulo(a, c));
		System.out.printf("CIRCULO %.3f%n", areaCirculo(c));
		System.out.printf("TRAPEZIO %.3f%n", areaTrapezio(a, b, c));
		System.out.printf("QUADRADO %.3f%n", areaQuadrado(b));
		System.out.printf("RETANGULO %.3f%n", areaRetangulo(a, b));
		
		sc.close();
	}
	
	public static double areaTriangulo(double a, double c) {
		return a * c /2.0;
	}
	
	public static double areaCirculo(double c) {
		return Math.PI * Math.pow(c, 2);
	}
	
	public static double areaTrapezio(double a, double b, double c) {
		return (a + b) *c/2.0;
	}
	
	public static double areaQuadrado(double b) {
		return b * 4;
	}
	
	public static double areaRetangulo(double a, double b) {
		return a * b;
	}

}
