package java8.time;

import java.time.LocalDate;

public class LocalDateTime 
{
	public static void main(String[] args) 
	{
	LocalDate date=LocalDate.now();
	System.out.println(date);
	
	System.out.println(date.getYear());
	System.out.println(date.getMonth());
	System.out.println(date.getDayOfMonth());
	}
}
