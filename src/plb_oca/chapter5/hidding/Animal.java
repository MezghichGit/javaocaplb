package plb_oca.chapter5.hidding;

public class Animal {
	public Animal()
	{
		System.out.println("Constructeur de Animal");
	}
	
	public Animal(int a)
	{
		System.out.println("Constructeur de Animal avec 1 paramètre");
	}

	String nom = "Animal";
	public static String info()
	{
		return "info Animal";
	}
	
	public static String affichage()
	{
		return "affichage Animal" ;
	}
	
	public void getInfoAnimal()
	{
		System.out.println("getInfoAnimal :" + info());
		
	}
}
