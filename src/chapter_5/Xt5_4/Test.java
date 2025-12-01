package chapter_5.Xt5_4;

public class Test {
    public static void main(String[] args) {
        Teacher tea=new Teacher();
        StudentClass stu = new StudentClass(tea);
        stu.doStudy();
    }
}
