package chapter_3;

public class Num {
	public Num(int a,int b){
		if(a>b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	public Num(double a,double b, double c){
		System.out.println(a*b*c);
	}
	public Num(String a,String b){
		if(a == b) {
			System.out.println("相同");
		} else {
			System.out.println("不同");
		}
	}
}
