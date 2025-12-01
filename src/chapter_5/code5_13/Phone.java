package chapter_5.code5_13;

public class Phone implements IPhone {
	@Override
	public void read() {
		System.out.println("Phone read");
	}
	@Override
	public void write() {
		System.out.println("Phone write");
	}
	@Override
	public void open() {
		System.out.println("Phone open");
	}

	@Override
	public void close() {
		System.out.println("Phone close");
	}
}
