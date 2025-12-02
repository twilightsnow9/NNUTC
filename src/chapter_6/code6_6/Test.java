package chapter_6.code6_6;

public class Test {
    public static void main(String[] args) {
        String text = "";
        long begenTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            text = text + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String的执行时间是"+(endTime-begenTime));

        StringBuilder sb = new StringBuilder("");
        begenTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            sb.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间是"+(endTime-begenTime));

    }
}
