package chapter_5.code5_4;

public class Code5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("张三", 23);
		System.out.println(h1.equals(h1));
		
		Human h2 = null;
		System.out.println(h1.equals(h2));
		
		String str3 = "hello";
		System.out.println(h1.equals(str3));
		
		Human h4 = new Human("李四", 23);
		System.out.println(h1.equals(h4));
		
		Human h5 = new Human("张三", 23);
		System.out.println(h1.equals(h5));
	}

}
