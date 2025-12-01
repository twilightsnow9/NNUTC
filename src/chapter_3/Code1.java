package chapter_3;

public class Code1 {
    public static void main(String[] args) {
//        可以看出要访问静态属性时通过 [类名.属性名]
        System.out.println(Student.staticString);
        //        可以看出要访问非静态属性时通过 [对象名.属性名]
        Student stu = new Student();
        System.out.println(stu.nonStaticInteger);
    }
}

class Student {
    public static String staticString = "static_string";
    public int nonStaticInteger = 2;
}
