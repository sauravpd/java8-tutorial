package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamDemo7 
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(3);
		
		System.out.println("Ascending order");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("Descending order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);	
	}
}
