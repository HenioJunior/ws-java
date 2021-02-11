package _062_introd_oo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Enter the measures of triangle X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);

		System.out.printf("Triangle X area: %.4f%n", areaY);

		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		
		
		
		
		sc.close();

	}

	public static double calcula_p(double x, double y, double z) {

		double p = (x + y + z) / 2.0;

		return p;
	}

	public static double calcula_area(double i, double j, double k, double p2) {
		double area = Math.sqrt(p2 * (p2 - i) * (p2 - j) * (p2 - k));

		return area;
	}

}
