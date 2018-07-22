package java8.functionalInterface;

import java.util.function.Function;
/**
 * 
 * @author saurav
 *
 */
public class FunctionInterfaceDemo1 
{
	public static Integer show(String message)
	{  
		return Integer.parseInt(message);  
	}  
	public static void main(String[] args) 
	{  
		// Function interface referring to a method  
		Function<String, Integer> fun = FunctionInterfaceDemo1::show;  
		// Calling Function interface method  
		System.out.println(fun.apply("4545"));  // output : 4545
	}  
}
