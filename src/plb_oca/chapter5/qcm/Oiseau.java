package plb_oca.chapter5.qcm;

public class Oiseau extends Animal {
	
	public String nom ="Oiseau";
	Integer x;
	public Oiseau()
	{
		super(2);
		
	}
	
	
	public static void info()
	{}
	
	public void InfoAnimal()
	{
		System.out.println(nom); // nom de oiseau; il cache celui du père
	}

}
