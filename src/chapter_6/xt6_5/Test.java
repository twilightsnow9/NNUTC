package chapter_6.xt6_5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            String Tusername = "java";
            String Tpassword = "java123";
            System.out.println("请输入用户名");
            String username = input.nextLine();

            System.out.println("请输入密码");
            String password = input.nextLine();
            if(username.equals(Tusername) && password.equals(Tpassword)){
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登录失败，请重新输入。您还有"+(i-1)+"次机会");
            }

        }



    }
}
