package chapter_4.Test4_10;

public class Dog extends Animal {
	public void fun1(Animal a) {
		System.out.println("Dog---Animal");
	}
	public void fun1(Dog dog) {
		System.out.println("Dog---Dog");
	}
	public void fun2(Animal a) {
		System.out.println("Dog---Animal");
	}
	public void fun3(Animal a) {
		System.out.println("Dog---Animal");
	}
}
