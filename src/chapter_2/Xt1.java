package chapter_2;

public class Xt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i +"="+i*j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int m = 9; m >= 1; m--) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n + "*" + m +"="+m*n + "\t");
			}
			System.out.println();
		}
	}
}
