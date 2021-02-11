package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes:");
		Integer n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Shape #" + (i+1) + " data:");
		System.out.print("Rectangle or Cicle (r/c):");
		char ch = sc.next().charAt(0);
		System.out.print("Color (BLACK, BLUE/RED)");
		Color color = Color.valueOf(sc.next());
		if (ch == 'r') {
			System.out.print("Width: ");
			Double width = sc.nextDouble();
			System.out.print("Height: ");
			Double height = sc.nextDouble();
			list.add(new Rectangle(color, width, height));
		}
		else{
			System.out.print("Radius: ");
			Double radius = sc.nextDouble();
			list.add(new Circle(color, radius));
		}
		}
	System.out.println();
	System.out.println("SHAPE AREAS: ");
	for(Shape shape : list) {
		System.out.printf("%.2f%n", shape.area());	
	}
		
	sc.close();
	}

}
