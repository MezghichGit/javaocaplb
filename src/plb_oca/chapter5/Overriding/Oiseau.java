package plb_oca.chapter5.Overriding;

import java.io.IOException;

public class Oiseau extends Animal{

	@Override
	 public void info() throws IOException
	{
		System.out.println("Un Oiseau");
	}
	
	@Override
	public Oiseau get()
	{
		return new Oiseau();
	}
}
