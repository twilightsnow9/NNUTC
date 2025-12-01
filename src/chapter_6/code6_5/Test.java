package chapter_6.code6_5;

public class Test {
    public static void main(String[] args) {
        byte[] byteArr1 = new byte[] {65,66,67,68,69,70};
        String str1 = new String(byteArr1);
        System.out.println(str1);
//        字符数组转换成字符串
        char[] charArr2 = new char[] {'g','h','i','j','k','i'};
        String str2 = new String(charArr2);
        System.out.println(str2);

        String str3 = "feng";
        byte[] byteArr3 = str3.getBytes();
        for(byte b : byteArr3) {
            System.out.print(b+" ");
        }
        System.out.println();
        String str4 = "567890";
        char[] charArr4 = new char[str4.length()];
        str4.getChars(0, charArr4.length, charArr4, 0);
        for (char c : charArr4) {
            System.out.print(c);
        }
        System.out.println();
    }
}
