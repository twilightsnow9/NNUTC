package chapter_6.code6_7;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r1 = new Random();
        int face = r1.nextInt(6) + 1;
        System.out.println(face);
    }
}
