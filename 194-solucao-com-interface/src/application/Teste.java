package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Teste {

	public static void main(String[] args) throws ParseException {

		LocalDateTime start = LocalDateTime.of(2018, 06, 25, 10, 30);
		LocalDateTime finish = LocalDateTime.of(2018, 06, 25, 14, 40);

		Duration dur = Duration.between(start, finish);
		
		long seconds = dur.getSeconds();
		
		//long hours = start.until(finish, ChronoUnit.HOURS);
				
		//long hours = ChronoUnit.HOURS.between(start, finish);
			
		
		double basicPayment;
		if (seconds <= 43200) {
			basicPayment = Math.ceil(seconds / 3600) * 10.0;
		} else {
			basicPayment = Math.ceil(seconds / 24) * 130.0;
		}

		System.out.println("hours " + seconds);
		System.out.println();
		System.out.println("basic payment " + basicPayment);

		System.out.println("---------------------------------------------");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		Date start2 = sdf.parse("25/06/2018 10:30");
		Date finish2 = sdf.parse("25/06/2018 14:40");

		long t1 = start2.getTime();
		long t2 = finish2.getTime();

		double hours2 = (double) (t2 - t1) / 3600000;

		double basicPayment2;
		if (hours2 <= 12.0) {
			basicPayment2 = Math.ceil(hours2) * 10.0;
		} else {
			// (hours/24) converter para dia;
			basicPayment2 = Math.ceil(hours2 / 24) * 130.0;
		}

		//double tax = taxService.tax(basicPayment);

		System.out.println("t1 " + t1);
		System.out.println("hours " + hours2);
		System.out.println("basicPayment " + basicPayment2);
		
		System.out.println("---------------------------------------------");
		
		long diffEmMil = t2 - t1;

		long hours3 = TimeUnit.HOURS.convert(diffEmMil, TimeUnit.MILLISECONDS);

		long basicPayment3;
		if (hours3 <= 12) {
			basicPayment3 = hours3 * 10;
		} else {
			// (hours/24) converter para dia;
			basicPayment3 = (hours3 / 24) * 130;
		}

		//double tax = taxService.tax(basicPayment);

		System.out.println("t1 " + t1);
		System.out.println("hours " + hours3);
		System.out.println("basicPayment " + basicPayment3);


	}
}
