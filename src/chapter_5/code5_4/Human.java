package chapter_5.code5_4;

public class Human {
	private String name;
	private int age;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
//	重写equals方法判断是否与另一个对象相同
	public boolean equals(Object obj) {
//		判断参数是否为this 如果是返回true
		if(obj == this) {
			return true;
		}
//		判断参数是否为空，如果是返回false
		if (obj == null) {
			return false;
		}
//		判断参数是否为当前类的实例，如果不是返回false
		if (!(obj instanceof Human)) {
			return false;
		}
//		把参数对象强制转换为当前类的对象，并比较参数是否相同，如果不是返回false
		Human h = (Human)obj;
		if (!(name.equals(h.getName()) && age == h.getAge())) {
			return false;
		}
		return true;
	}
}
