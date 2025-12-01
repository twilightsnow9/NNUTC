package chapter_5.code14;
	class A {
		static {
			System.out.print("a");
		}
		public A() {
			System.out.print("b");
		}
	}
	class B extends A {
		static {
			System.out.print("c");
		}
		public B() {
			System.out.print("d");
		}
	}
	
	
public class code14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a = new B();
	}

}
