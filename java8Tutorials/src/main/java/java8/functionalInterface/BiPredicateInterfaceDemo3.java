package java8.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceDemo3 
{

	public static void main(String[] args) 
	{
		BiPredicate<String, String> biPredicate = (a, b) -> a.equals(b);
	    System.out.println(biPredicate.test("java","python"));//false
	    System.out.println(biPredicate.test("java","java"));//true
	}
}
