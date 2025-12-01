package chapter_5.code5_11;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle(3);
		System.out.println("s1的周长是" + s1.calcPerimeter());
		
		Shape s2 = new Rectangle(5.2,2.5);
		System.out.println("s2的周长是" + s2.calcPerimeter());
	}

}
