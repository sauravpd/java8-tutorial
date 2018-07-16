package java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * 
 * @author saurav
 *
 */
public class LocalDateDemo1 
{
	public static void main(String[] args) 
	{
		LocalDate today=LocalDate.now();
		LocalDate tomorrow=today.plusDays(1);
		LocalDate yesterday=today.minusDays(1);

		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(yesterday);

		// get day of the week from date
		LocalDate localDate = LocalDate.of(2018, Month.AUGUST,15);
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		System.out.println(dayOfWeek);
	}
}
