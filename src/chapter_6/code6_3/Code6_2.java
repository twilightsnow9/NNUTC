package chapter_6.code6_3;
import java.util.Calendar;

public class Code6_2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		获取当前的日期时间
		int curYear = cal.get(Calendar.YEAR);
		int curMonth = cal.get(Calendar.MONTH);
		int curDate = cal.get(Calendar.DATE);
		System.out.println("当前的日期是" + curYear + "-"+ curMonth + "-" +curDate);
		int curHour = cal.get(Calendar.HOUR_OF_DAY);
		int curMINUTE = cal.get(Calendar.MINUTE);
		int curSECOND = cal.get(Calendar.SECOND);
		System.out.println("当前的时间是" + curHour + "-"+ curMINUTE + "-" +curSECOND);
		
//		设置时间
		cal.set(2025,11,25,11,17,0);
		cal.add(Calendar.YEAR, -1);//前推一年
		cal.roll(Calendar.MONTH, 1);//后推一个月，不进位
		int newYear = cal.get(Calendar.YEAR);
		int newMonth = cal.get(Calendar.MONTH);
		System.out.println("新的日期是" + newYear + "-"+ newMonth);
		
//		获取日历中各个字段最大值
		int yearMax = cal.getActualMaximum(Calendar.YEAR);
		int yearMin = cal.getActualMinimum(Calendar.YEAR);
		System.out.println("最大值"+ yearMax +"最小值" +yearMin);
		
		int MonthMax = cal.getActualMaximum(Calendar.MONTH);
		int MonthMin = cal.getActualMinimum(Calendar.MONTH);
		System.out.println("最大值"+ MonthMax +"最小值" +MonthMin);
		
		int dateMax = cal.getActualMaximum(Calendar.DATE);
		int dateMin = cal.getActualMinimum(Calendar.DATE);
		System.out.println("最大值"+ dateMax +"最小值" +dateMin);
		
		int hourMax = cal.getActualMaximum(Calendar.HOUR);
		int hourMin = cal.getActualMinimum(Calendar.HOUR);
		System.out.println("最大值"+ hourMax +"最小值" +hourMin);
		
		int hourOfDayMax = cal.getActualMaximum(Calendar.HOUR_OF_DAY);
		int hourOfDayMin = cal.getActualMinimum(Calendar.HOUR_OF_DAY);
		System.out.println("最大值"+ hourOfDayMax +"最小值" +hourOfDayMin);
		
		int MINUTEMax = cal.getActualMaximum(Calendar.MINUTE);
		int MINUTEMin = cal.getActualMinimum(Calendar.MINUTE);
		System.out.println("MINUTE最大值"+ MINUTEMax +"最小值" +MINUTEMin);
		int SECONDMax = cal.getActualMaximum(Calendar.SECOND);
		int SECONDMin = cal.getActualMinimum(Calendar.SECOND);
		System.out.println("SECOND最大值"+ SECONDMax +"最小值" +SECONDMin);
	}
}
