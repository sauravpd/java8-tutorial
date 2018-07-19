package java8.lambda;

interface Calc
{
	void add(int a,int b);
}
/**
 * 
 * @author saurav
 *
 */
public class LambdaDemo5 
{
	public LambdaDemo5(int x,int y)
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) 
	{
		// Reference to Constructor.
		Calc calc=LambdaDemo5::new;
		calc.add(10,10); // output : 20
	}
}
