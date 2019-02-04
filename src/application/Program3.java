package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program3 {

	public static void main(String[] args) {

		SimpleDateFormat simDatFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(simDatFormat.format(date));

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(Calendar.MONTH);

		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
