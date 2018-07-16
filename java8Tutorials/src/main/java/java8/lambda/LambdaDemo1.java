package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author saurav
 *
 */
public class LambdaDemo1 
{
	public static void main(String[] args) 
	{
		List<String> names=Arrays.asList("Steve","Mike","Peter","John");
		System.out.println(names);
		Collections.sort(names, (a,b)->a.compareTo(b));
		System.out.println(names);
		names.sort(Collections.reverseOrder());
		System.out.println(names);
	}
}
