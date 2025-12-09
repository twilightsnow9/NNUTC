package chapter_7.code7_1;

import javafx.beans.binding.NumberBinding;

public class Test {
    public static void main(String[] args) {
        try {
            int a =Integer.parseInt(args[0]);
            int b =Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("你输入的两个数相除的结果是：" + c);
        } catch( IndexOutOfBoundsException e) {
            System.out.println("数组越界：运行程序时输入的参数个数不够");
        } catch (NumberFormatException e) {
            System.out.println("数字格式异常：程序只能接受整数参数");
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
        } catch (Exception e) {
            System.out.println("未知异常");
        }
    }
}
