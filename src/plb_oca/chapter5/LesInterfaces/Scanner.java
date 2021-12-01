package plb_oca.chapter5.LesInterfaces;

public interface Scanner {
 public void scan();
 
 default void info()  // a partir de la version 8
	{
		System.out.println("Info Imprimante");
	}
}
