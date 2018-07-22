package java8.stringJoiner;

import java.util.StringJoiner;
/**
 * 
 * @author saurav
 *
 */
public class StringJoinerDemo1
{
	public static void main(String[] args) 
	{
		StringJoiner joiner = new StringJoiner(",", "[", "]");
		joiner.add("Pune")
		.add("Mumbai")
		.add("Delhi")
		.add("Banglore");
		System.out.println(joiner); // output : [Pune,Mumbai,Delhi,Banglore]		
	}
}
