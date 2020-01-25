package java8.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceDemo2 
{
	public static void main(String[] args) 
	{
		BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
	    System.out.println(biPredicate.test(2, 4));//false
	    System.out.println(biPredicate.test(4, 2));//true
	}
}
