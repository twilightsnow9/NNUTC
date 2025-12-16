package chapter_7.code7_2;

public class Test {
    public static void main(String[] args) {
        int a = 6,b =0,c;
        try {
            c = a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
