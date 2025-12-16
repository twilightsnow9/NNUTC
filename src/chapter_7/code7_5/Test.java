package chapter_7.code7_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void test() throws IOException {
        InputStream is = new FileInputStream("D:\\a.txt");
        is.close();
    }
}
