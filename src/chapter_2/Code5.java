package chapter_2;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入分数");
		Scanner scan = new Scanner(System.in);
		int  A = scan.nextInt();
		switch (A / 10) {
		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("不及格");
			break;
			
		default:
			System.out.println("输入有误请重新输入");
			break;
		}
	}

}
