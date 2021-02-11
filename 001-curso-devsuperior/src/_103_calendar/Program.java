package _103_calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		System.out.println("Somando uma unidade de tempo:");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		// DECLARANDO O OBJETO CALENDAR;
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();

		System.out.println(sdf.format(d));

		System.out.println("------------------");

		System.out.println("Obtendo uma unidade de tempo:");

		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date e = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf4.format(e));

		Calendar cal2 = Calendar.getInstance();

		cal2.setTime(e);

		int minutes = cal2.get(Calendar.MINUTE);

		// LEMBRAR QUE JAN É O MÊS 0;
		int month = 1 + cal2.get(Calendar.MONTH);

		System.out.println("Minutes: " + minutes);

		System.out.println("Month: " + month);

	}

}
