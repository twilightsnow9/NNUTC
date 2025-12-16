package chapter_7.Xt7_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入被除数:");
            int a = scanner.nextInt();
            System.out.println("请输入除数:");
            int b = scanner.nextInt();

                int c = a/b;
                if(b==0){
                    throw new ArithmeticException();
                }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
