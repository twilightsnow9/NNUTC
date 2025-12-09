package chapter_6.code6_9;

public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abc").append("def");
        showInfo(sb, "123");
        System.out.println(sb.length());
    }

    private static void showInfo(StringBuffer sb, String string) {
        sb.append(string);
    }
}
