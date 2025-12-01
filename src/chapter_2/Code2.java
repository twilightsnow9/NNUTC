package chapter_2;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入分数");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}

}
