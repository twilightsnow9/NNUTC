package chapter_3;

public class Human1 {
//	先执行初始化块的代码，再执行构造器代码
	Human1() {
		System.out.println("构造器代码");
	}
	{
		System.out.println("初始化块代码");
	}
}
