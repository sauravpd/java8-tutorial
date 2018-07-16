package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/**
 * 
 * @author saurav
 *
 */
public class StreamDemo4 
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


		cityList
		.stream()
		.findFirst()
		.ifPresent(System.out::println);

		//output Mumbai

	}
}
