package java8.functionalInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo1 
{
	public static void printMessage(String name){  
		System.out.println("Welcome "+name);  
	}  
 
	public static void main(String[] args) 
	{  
		// Referring method to String type Consumer interface   
		Consumer<String> consumer1 = ConsumerInterfaceDemo1::printMessage;  
		consumer1.accept("Steve");   // Calling Consumer method  

	}  
}
