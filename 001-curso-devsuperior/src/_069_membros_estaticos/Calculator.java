package _069_membros_estaticos;

public class Calculator {
	
	public static final double PI = 3.14159;
	// final quer dizer que o valor é uma constante.
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;

	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3)/3.0;

	}
	
	
	
	

}
