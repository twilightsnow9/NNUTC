package chapter_6.code6_1;

public class Code6_1 {
	public static void main(String[] args) {
		char c = 'a';
		Character cWrapper = new Character(c);
		System.out.println(cWrapper);
		
		Double dWrapper = new Double(3.14);
		double d = dWrapper.doubleValue();
		System.out.println(d);
		
		String iStr = "38";
		int i = Short.parseShort(iStr);
		System.out.println(i);
		
		boolean b = false;
		String bStr = String.valueOf(b);
		System.out.println(bStr);
	}
}
