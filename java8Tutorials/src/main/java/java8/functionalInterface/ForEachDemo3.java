package java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo3 
{
	public static void main(String[] args) 
	{
		List<Integer> intItems = new ArrayList<>();
		intItems.add(10);
		intItems.add(50);
		intItems.add(40);
		intItems.add(30);
		intItems.add(20);

		//lambda
		intItems.forEach(item->{
			if(item>20)
			{
				System.out.println(item);//50 40 30
			}
		});
	}
}
