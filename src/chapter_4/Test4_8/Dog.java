package chapter_4.Test4_8;

public class Dog extends Animal {
	int age;
	
	public Dog() {
		super();
		this.age = 3;
	}
	public Dog(String name,int age) {
		super(name);
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
