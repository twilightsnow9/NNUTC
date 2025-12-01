package chapter_2;

import java.util.Arrays;
import java.util.Scanner;

public class Xt7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 升序
        int[] arr = { 1, 2, 3, 4, 5 };
        // 降序
        // int[] arr = {5, 4, 3, 2, 1 };
        System.out.print("定义的原始数组为：");
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
        }

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个元素：");
        int addNum = sc.nextInt();
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = addNum;

        int i = 0;
        // 定义数组为升序时
        if (arr[i] <= arr[arr.length - 2]) {
                Arrays.sort(arr);
                System.out.print("升序时，插入一个数后的数组为：");
                for (i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
        } else {
                // 定义数组为降序时
                Arrays.sort(arr);
                System.out.print("降序时，插入一个数后的数组为：");
                for (i = arr.length - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                }
        }
	}

}
