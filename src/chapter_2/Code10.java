package chapter_2;

public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str3 = "hello,world";
		int index1 = 0;
		while (index1 <str3.length()) {
			char c = str3.charAt(index1);
			index1++;
			if (c == ',') {
				continue;
			}
			System.out.print(c);
		}
		System.out.println();
		int[] arr = new int[]{1 ,2 ,3 ,4};
		System.out.println(arr[0]+" "+arr[3]);
	}

}
