package java8.lambda;
/**
 * 
 * @author saurav
 *
 */
public class LambdaDemo3 
{
	private static int add(int x,int y)
	{
		return x+y;
	}
	public static void main(String[] args) 
	{
		// Reference to a static method
		Calculator calc=LambdaDemo3::add;
		System.out.println(calc.add(10,10)); // output : 20
	}
}
