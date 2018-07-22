package java8.optional;

import java.util.Optional;

/**
 * 
 * @author saurav
 *
 */
public class OptionalDemo1 
{
	public static void main(String[] args) 
	{
		Optional<String> city=Optional.of("Pune");
		System.out.println(city);

		Optional<String> emptyGender = Optional.empty();

		if (city.isPresent()) {
			System.out.println("Value present.");
		} else {
			System.out.println("Value not present.");
		}
		city.ifPresent(a->System.out.println("value present"));
	}
}
