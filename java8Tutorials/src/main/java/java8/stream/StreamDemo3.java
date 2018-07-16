package java8.stream;

import java.util.stream.IntStream;

/**
 * 
 * @author saurav
 *
 */
public class StreamDemo3 
{
	public static void main(String[] args) 
	{
		// without using stream
		for (int i = 0; i < 10; i++) 
		{
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("###########################");

		// using stream
		IntStream.range(0,10)
		.forEach(i->{
			if(i%2==0)
			{
				System.out.println(i);
			}
		});
	}
}
