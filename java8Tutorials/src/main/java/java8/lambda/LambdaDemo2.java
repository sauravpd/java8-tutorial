package java8.lambda;

/**
 * 
 * @author saurav
 *
 */
public class LambdaDemo2 
{
	public static void main(String[] args) 
	{
		Calculator calc=(a,b)->(a+b);
		System.out.println(calc.add(10,10)); // output : 20
	}
}
