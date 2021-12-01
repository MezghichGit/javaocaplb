package plb_oca.chapter5.LesInterfaces;

public abstract interface Imprimante {

	public static final  int MAX_AGE=100;

	public abstract void imprimer();
	
	public default void info()  // a partir de la version 8
	{
		System.out.println("Info Imprimante");
	}
	
	public static void affichage() // a partir de la version 8
	{
		System.out.println("Info Imprimante");
	}
}
