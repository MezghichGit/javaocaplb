package plb_oca.chapter5.hidding;

public class Oiseau extends Animal{

	public Oiseau()
	{
		super(10); // appel au constructeur par défaut de la classe mère 
	}
	String nom = "Oiseau";
	
	public void getName()
	{
		System.out.println(this.nom+" "+super.nom);
	}
	public static String info()
	{
		return"info Oiseau";
	}
	public static String affichage()
	{
		return"affichage Animal";
	}
	
	public void getInfoOiseau()
	{
		System.out.println("getInfoOiseau : "+info());
		
	}
}
