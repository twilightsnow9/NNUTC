package chapter_2;

public class Xt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("原始数组为：");
        for (int temp : arr) {
                System.out.print(temp + " ");
        }
        System.out.print("数组逆向输出为：");
        for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
        }
	}

}
