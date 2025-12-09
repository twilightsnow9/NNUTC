package chapter_6.xt6_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date start = s1.parse("2003-11-18");
        Date end = s1.parse(s1.format(new Date()));
        System.out.println(daysBetween(start, end));
    }

    public static int daysBetween(Date start, Date end) throws ParseException {

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
        start = s2.parse(s2.format(start));
        end = s2.parse(s2.format(end));
        Calendar cal = Calendar.getInstance();
        cal.setTime(start);
        long time1 = cal.getTimeInMillis();
        cal.setTime(end);
        long time2 = cal.getTimeInMillis();
        long days = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(days));
    }
}
