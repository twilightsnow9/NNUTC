package chapter_2;

public class Code9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello,world";
		int index = 0;
		while (index <str.length()) {
			char c = str.charAt(index);
			index++;
			if (c == ',') {
				break;
			}
			System.out.print(c);
		}
		System.out.println();
		String str2 = "hello,world";
		for (int i = 0; i < str2.length(); i++) {
			char c = str.charAt(i);
			if (c == ',') {
				break;
			}
			System.out.print(c);
		}
		System.out.println();

	}

}
