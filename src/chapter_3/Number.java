package chapter_3;

public class Number {
	private int n1;
	private int n2;
	public Number(int n1,int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public void addition() {
		System.out.println(this.n1 + this.n2);
	}
	public void subtraction() {
		System.out.println(this.n1 - this.n2);
	}
	public void multiplication() {
		System.out.println(this.n1 * this.n2);
	}
	public void division() {
		System.out.println(this.n1 / this.n2);
	}
}
