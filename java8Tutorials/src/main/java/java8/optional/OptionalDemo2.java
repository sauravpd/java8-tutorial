package java8.optional;

import java.util.Optional;

public class OptionalDemo2 
{
	public static void main(String[] args) 
	{
		Optional<String> country=Optional.empty();
		System.out.println(country.orElse("India"));
	}
}
