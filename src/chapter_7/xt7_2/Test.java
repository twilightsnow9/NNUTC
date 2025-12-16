package chapter_7.xt7_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("请输入名字：");
            String name = sc.nextLine();
            System.out.print("请输18位身份证：");
            String idcard = sc.nextLine();
            System.out.print("请输入年龄：");
            int age = sc.nextInt();
            Employee e1 = new Employee(name, idcard, age);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("--欢迎下次使用--");
        }
    }
}