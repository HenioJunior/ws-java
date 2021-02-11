package _103_calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2021-01-30T10:06:30Z"));
		System.out.println(sdf.format(d));
		
		System.out.println("-----------------");
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		cal.add(Calendar.MONTH, 2);
		
		d = cal.getTime();
		
		System.out.println(d);
		
		

	}

}
