package _068_exercicios;

public class Rectangle {
	public double width;
	public double height;

	public double area() {

		return width * height;

	}
	
	public double diagonal() {
		
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public double perimetro() {
		
		return 2*(width + height);
		
	}
	
	public String toString() {
		return String.format("AREA = %.2f%n", area())
				+ String.format("PERIMETER = %.2f%n", perimetro())
				+ String.format("DIAGONAL = %.2f%n", diagonal());
				
		
		
	}

}
