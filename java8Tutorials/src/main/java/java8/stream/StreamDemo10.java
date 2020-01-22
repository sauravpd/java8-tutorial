package java8.stream;

import java.util.LinkedHashMap;
import java.util.Map;

public class StreamDemo10 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new LinkedHashMap<Integer, String>();
		map.put(5, "five");
		map.put(1, "one");
		map.put(4, "four");
		map.put(3, "three");
		map.put(2, "two");
		
		System.out.println(map); // {5=five, 1=one, 4=four, 3=three, 2=two}
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}
