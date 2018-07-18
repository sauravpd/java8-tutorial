package java8.lambda;

interface Calculator
{  
	int add(int a,int b);  
}  
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
