package java8.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author saurav
 *
 */
public class StreamDemo2 
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

		// sorting

		cityList.stream().sorted().forEach(System.out::println);

		// output
		/*
		 * Banglore 
		 * Chennai
		 * Delhi
		 * Indore
		 * Jaipur
		 * Kolkata
		 * Mumbai
		 * Pune
		 * 
		 */

	}
}
