package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 
 * @author saurav
 *
 */
public class StreamDemo1 
{
	public static void main(String[] args) 
	{
		List<String> cityList = new ArrayList<>();
		cityList.add("Mumbai");
		cityList.add("Pune");
		cityList.add("Delhi");
		cityList.add("Banglore");
		cityList.add("Chennai");
		cityList.add("Kolkata");
		cityList.add("Jaipur");
		cityList.add("Indore");

		// filtering
		cityList
		.stream()
		.filter((s)->s.startsWith("P"))
		.forEach(System.out::println); 
		//Pune

		System.out.println("#########################");
		System.out.println("*****Before sorting******");
		cityList.forEach(System.out::println);
		System.out.println("*****After Sorting*******");

		// sorting
		cityList
		.stream()
		.sorted()
		.forEach(System.out::println);
		System.out.println("#########################");

		// mapping

		cityList
		.stream()
		.map((s)->s.toUpperCase())
		.forEach(System.out::println); 

		System.out.println("#########################");

		// matching

		boolean anyStartsWithP = cityList
				.stream()
				.anyMatch((s) -> s.startsWith("P"));

		System.out.println(anyStartsWithP);      // true

		boolean allStartsWithM = cityList
				.stream()
				.allMatch((s) -> s.startsWith("M"));

		System.out.println(allStartsWithM);      // false

		boolean noneStartsWithH = cityList
				.stream()
				.noneMatch((s) -> s.startsWith("H"));

		System.out.println(noneStartsWithH);      // true
		
		System.out.println("#########################");
		// counting
		
		long count=cityList
				.stream()
				.count();
		System.out.println(count);
		System.out.println("#########################");
	}
}
