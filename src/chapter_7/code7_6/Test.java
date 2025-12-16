package chapter_7.code7_6;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            throwChecked(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        throwRuntime(4);
    }
    public static void throwChecked(int a) throws Exception {
        if(a>0) {
            throw new Exception("a的值大于0，不符合要求");
        }
    }
    public static void throwRuntime(int a)  {
        if(a>0) {
            throw new RuntimeException("a的值大于0，不符合要求");
        }
    }
}
