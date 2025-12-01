package chapter_5.code5_11;

public class Circle extends Shape {
	private double radius = 0.0;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcPerimeter() {
		return 2 * Math.PI * this.radius;
	}
}
