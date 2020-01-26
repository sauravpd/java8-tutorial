package java8.functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterfaceDemo 
{
	public static void main(String[] args) 
	{
		Supplier<Integer> supplier=()->new Random().nextInt(20);
		System.out.println(supplier.get());
	}
}
