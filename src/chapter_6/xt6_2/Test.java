package chapter_6.xt6_2;

public class Test {
    public static void main(String[] args) {

        byte b = 1;
        short s = 2;
        float f = 2.718f;
        // 基本数据类型转包装类
        Byte b1 = b;
        Short s1 = s;
        Float f1 = f;
        // 包装类转基本数据类型
        b = b1;
        s = s1;
        f = f1;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}
