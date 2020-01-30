package java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo4 
{
	public static void main(String[] args) 
	{
		List<Integer> intItems = new ArrayList<>();
		intItems.add(10);
		intItems.add(50);
		intItems.add(40);
		intItems.add(30);
		intItems.add(20);

		// method reference
		intItems.forEach(System.out::println); // 10 50 40 30 20
			
	}
}
