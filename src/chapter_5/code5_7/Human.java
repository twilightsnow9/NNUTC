package chapter_5.code5_7;

public class Human {
	final private String name = "汤姆";
	
	final private int age;
	{
		this.age = 52;
	}
	final private int height;
	public Human() {
		this.height = 174;
	}
	
	final private int weight = 70;
	{
//		weight = 68;
	}
//	final属性不能不设定初始值
	final private String qirlfriend = "黑科技";
	
	public void setName(String name) {
//		final属性不能在普通方法中被修改
//		this.name = name;
	}
}
