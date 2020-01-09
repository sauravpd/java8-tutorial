package java8.functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionInterfaceDemo1 
{
	public static void main(String[] args) 
	{
		BiFunction<Integer,Integer,Integer> obj=(a,b)->a+b;
		System.out.println(obj.apply(10,10));
	}
}
