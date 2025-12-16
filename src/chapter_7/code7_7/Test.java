package chapter_7.code7_7;

public class Test {
    public static void main(String[] args) {
        info();
    }
    public static void info() {
        try {
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
