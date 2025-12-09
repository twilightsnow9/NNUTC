package chapter_6.xt6_6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] arr = new int[5];
//        for(int i=0;i< arr.length;i++) {
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j+1] > arr[j]) {
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("最大值为"+arr[0]);

            int[] nums = new int[5];
            System.out.println("请输入5个整数:");
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < nums.length; i++) {
                nums[i] = input.nextInt();
            }
            int sum = 0;
            int max = nums[0];
            int min = nums[0];
            for (int i = 0; i < nums.length; i++) {
                sum = nums[i] + sum;
                if (max <= nums[i]) {
                    max = nums[i];
                }
                if (min >= nums[i]) {
                    min = nums[i];
                }
            }
            System.out.print("最大值为:" + max);
            System.out.print("最小值为:" + min);
            System.out.print("平均值为:" + sum / 5);
    }
}
