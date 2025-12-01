package chapter_2;

public class Code11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"语文","数学","英语","物理"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(String iString : arr) {
			System.out.print(iString+"\t");
		}
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(arr2[0][0]);
	}

}
