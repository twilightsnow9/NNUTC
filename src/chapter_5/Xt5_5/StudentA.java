package chapter_5.Xt5_5;

public class StudentA extends Student {
	public StudentA() {
        super();
}
	@Override
    public void study() {
        System.out.println("09250603好好学习，今天学习了Java面向对象！");
	}

	public StudentA(String name, int age, int grand) {
	        super(name, age, grand);
	}
}
