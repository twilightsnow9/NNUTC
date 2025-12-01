package chapter_5.code5_15;

import java.util.Scanner;

public class Confirm {
	public void create(String message, Callback callback) {
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		callback.print(line);
	}
}
