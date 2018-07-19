package java8.functionalInterface;

import java.util.function.Predicate;

/**
 * 
 * @author saurav
 *
 */
public class PredicateInterfaceDemo1 
{
	/**
	 * check Speed
	 * @param speed
	 * @return
	 */
	public static Boolean checkSpeed(int speed)
	{  
		if(speed>20)
		{
			return true;
		}
		else
		{
			return false;  
		}
	}  
	public static void main(String[] args) 
	{
		Predicate<Integer> predicate=PredicateInterfaceDemo1::checkSpeed;
		System.out.println(predicate.test(50)); // output : true
	}
}
