package java8.lambda;
/**
 * 
 * @author saurav
 *
 */
public class LambdaDemo6 
{
	public static void main(String[] args) 
	{
		Runnable r=()->System.out.println("Thread is running");
		Thread thread=new Thread(r);
		thread.start();
	}
}
