package chapter_3;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_1.staticMethod();
		Test_1 test = new Test_1();
		test.nonStaticMethod();
	}

}
class Test_1 {
	public void nonStaticMethod() {
		System.out.println("non static method");
	}
	public static void staticMethod() {
		System.out.println("static method");
	}
}