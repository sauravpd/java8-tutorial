package java8.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class LocalDateDemo2 
{
	public static void main(String[] args) 
	{
		// get the current time
		Clock clock = Clock.systemDefaultZone();
		long t0 = clock.millis();
		System.out.println(t0);

		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant);


		ZoneId zone1 = ZoneId.of("GMT");
		ZoneId zone2 = ZoneId.of("Brazil/East");


		// time
		LocalTime now1 = LocalTime.now(zone1);
		LocalTime now2 = LocalTime.now(zone2);

		System.out.println(now1);
		System.out.println(now2);

		System.out.println(now1.isBefore(now2));  // false

		long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
		long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
		System.out.println(hoursBetween);
		System.out.println(minutesBetween);
	}
}
