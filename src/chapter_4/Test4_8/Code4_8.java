package chapter_4.Test4_8;

public class Code4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		System.out.println("姓名：" +dog1.getName() + "年龄:" + dog1.getAge());
		
		Dog dog2 = new Dog("豆豆",5);
		System.out.println("姓名：" +dog2.getName() + "年龄:" + dog2.getAge());
	}

}
