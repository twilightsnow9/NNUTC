package chapter_2;

public class Xt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int value1 = 1;
        int value2 = 1;
        int value3;
        System.out.print(value1 + "  ");
        System.out.print(value2 + "  ");
        for (int num = 3; num <= 20; num++) {
                value3 = value1 + value2;
                System.out.print(value3 + "  ");
                value1 = value2;
                value2 = value3;
        }
	}

}
