package chapter_2;

public class Xt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 0, y = 0, z = 0;
        int num=0;
        for (int i = 100; i < 999; i++) {
                x = i / 100;
                y = (i % 100) / 10;
                z = (i % 100) % 10;
                if (x * x * x + y * y * y + z * z * z == i) {
                        num++;
                        System.out.println("第"+num+"个水仙数是："+i);
                }
        }
	}

}
