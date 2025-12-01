package chapter_5.code5_13;

public class Test5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		USB use = phone;
		use.read();
		use.write();
		WiFi wifi = phone;
		wifi.open();
		wifi.close();
	}

}
