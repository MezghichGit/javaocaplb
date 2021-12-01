package plb_oca.chapter5.Overriding;

import java.io.IOException;

public class Animal {

	protected void info()  throws Exception  // 
	{
		System.out.println("Un Animal");
	}
	
	public Animal get()
	{
		return new Animal();
	}
}
