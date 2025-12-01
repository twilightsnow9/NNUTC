package chapter_2;

import java.util.Scanner;

public class Xt8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("输入一个正整数进行因数分解：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
                num = -num;
        }
        int i = minNum(num);
        System.out.print(num + "=");
        resolveNum(num, i);
    }

	public static boolean isPrimeNumber(int n) {
	        for (int i = 1; i <= Math.sqrt(n); i++) {
	                if (n == 2) {
	                        return true;
	                }
	                if (n % 2 == 0) {
	                        return false;
	                }
	        }
	        return true;
	}

	public static int resolveNum(int i, int j) {
	        if (i == j) {
	                System.out.print(i);
	                return i;
	        }
	        while (i != j) {
	                if (i % j == 0 && i > j) {
	                        System.out.print(j + "*");
	                        return resolveNum(i / j, minNum(i / j));
	                }
	                j++;
	        }
	        return i;
	}
	public static int minNum(int n) {
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0 && isPrimeNumber(i)) {
	                        return i;
	                }
	        }
	        return n;
	
	}
}
