package chapter_3;

public class Overload {
	public void fun() {
		System.out.println("无参数方法");
	}
	public void fun(int a) {
		System.out.println(a+"带参数方法");
	}
	public void fun(double a,double b) {
		System.out.println(a+b+"带两个参数方法");
	}
}
