package chapter_7.code7_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("D:\\a.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        } finally{
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("执行finally中的语句");
        }
    }
}
