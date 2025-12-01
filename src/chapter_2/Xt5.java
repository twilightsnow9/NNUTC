package chapter_2;

public class Xt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[] { 1, 3, 33, 13, 63, 53, 23, 73 };
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                        max = array[i];
                }
                if (array[i] < min) {
                        min = array[i];
                }
        }
        System.out.println("数组中最大值为：" + max);
        System.out.println("数组中最小值为：" + min);

	}

}
