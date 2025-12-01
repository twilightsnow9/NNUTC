package chapter_6.code6_4;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2025,12,1,9,00,00);
		Date date1 = cal.getTime();
		cal.set(2003,11,18,0,0,0);
		Date date2 = cal.getTime();
		
		String[] formats =  new String[] {
				"yyyy-M-d",
				"yyyy-MM-dd",
				"yyyy-MM-dd H:m:s",
				"yyyy-MM-dd HH:mm:ss",
				"yyyy-MM-dd E HH:mm:ss",
		};
		for(String feng : formats) {
			SimpleDateFormat df = new SimpleDateFormat(feng);
			System.out.println(df.format(date1));
			System.out.println(df.format(date2));
		}
	}

}
