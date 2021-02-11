package entities;

public class Triangle extends Shape {

	private Double a;
	private Double b;
	private Double c;

	public Triangle() {
		super();
	}
		
	public Triangle(entities.enums.Color color, Double a, Double b, Double c) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public Double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public Double area() {

		double p = (a + b + c) / 2.0;

		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}
}
