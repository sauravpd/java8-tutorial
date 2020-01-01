package java8.stream;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * 
 * @author saurav
 *
 */
public class StreamDemo5 
{
	public static void main(String[] args) 
	{
		
		Stream.of("a1", "aa", "a3")
        .map(a->findInt(a))
        .forEach(System.out::println);
	}
	
	private static Integer findInt(String s)
	{
		Matcher m=Pattern.compile("[0-9]+").matcher(s);
		if(m.find())
		{
			return Integer.parseInt(m.group());
		}
		return null;
	}
}
