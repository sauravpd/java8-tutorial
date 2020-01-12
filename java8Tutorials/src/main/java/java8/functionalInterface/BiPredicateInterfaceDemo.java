package java8.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceDemo 
{
	public static void main(String[] args)
	{
		BiPredicate<Integer,Integer> biPredicate=(a,b)->a==b;
		System.out.println(biPredicate.test(10,20)); // false
		System.out.println(biPredicate.test(20,20)); // true
		System.out.println(biPredicate.test(40,20)); // false
		System.out.println(biPredicate.test(40,40)); // true
	}
}
