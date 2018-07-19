package java8.lambda;
/**
 * 
 * @author saurav
 *
 */
public class LambdaDemo4 
{
	private int add(int x,int y)
	{
		return x+y;
	}
	public static void main(String[] args) 
	{
		// Reference to an instance method.
		Calculator calc=new LambdaDemo4()::add;
		System.out.println(calc.add(10,10)); // output : 20
	}
}
