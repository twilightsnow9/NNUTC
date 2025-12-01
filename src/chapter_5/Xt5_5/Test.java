package chapter_5.Xt5_5;

public class Test {
    public static void main(String[] args) {
        Student s = new StudentA();
        s.setName("冯晨");
        s.setAge(21);
        s.setGrade(500);
        System.out.println("姓名:"+s.getName() + ",年龄:" + s.getAge() + ",成绩:" + s.getGrade());
        s.study();
        s.eat();
    }
}
