package chapter_7.code7_8;

public class Test {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            try {
                throw new Exception();
            } catch (Exception e2) {
                System.out.print("A");
            }
            System.out.print("B");
        }
        System.out.print("C");
    }
}
