package chapter_6.code6_8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String regex = "学(.*)";
        System.out.print("请问你要学什么 ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);//制作模版
        Matcher matcher = pattern.matcher(input);//输入字符串模版进行匹配
        if (matcher.find()) {
            System.out.println(matcher.group(1));
        } else {
            System.out.println(input+"不能够匹配");
        }
    }
}
