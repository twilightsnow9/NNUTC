package chapter_6.xt6_4;

public class Test {
    public static void main(String[] args) {
        String str = "gnitseretnI si avaJ ni gnimmargorP";
        String Str1 = "hello";
//        字符串转成字符数组
        char[] strArray = str.toCharArray();
        int length = strArray.length;
        char temp;
        for (int i = 0; i < length / 2; i++) {
            temp = strArray[i];
            strArray[i] = strArray[length - i - 1];
            strArray[length - i - 1] = temp;
        }
        String strAfter = String.valueOf(strArray);
        System.out.println("反转之前：" + str);
        System.out.println("反转之后：" + strAfter);
    }
}
