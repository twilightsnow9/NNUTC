package chapter_5.code5_8;

public class Test {
	public static void final1() {
		final int value1 = 10;
		Dog dog = new Dog();
		dog.setName("李四");
//		value1 = 2;
	}
	public static void final2() {
		final int[] arr = new int[]{2,3,5,8,13,21};
		System.out.println(arr[3]);
		arr[3] = 15;
		System.out.println(arr[3]);
//		arr = new int[] {1,2,3};
	}
	
}
