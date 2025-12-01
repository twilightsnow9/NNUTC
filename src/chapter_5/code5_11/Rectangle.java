package chapter_5.code5_11;

public class Rectangle extends Shape {
	double a,b;
	
	public Rectangle(double x,double y) {
		a = x;
		b = y;
	}
	
//	计算矩形周长
	@Override
	public double calcPerimeter() {
		return 2 * (a + b);
	}
}
