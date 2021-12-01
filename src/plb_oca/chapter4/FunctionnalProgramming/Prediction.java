package plb_oca.chapter4.FunctionnalProgramming;

@FunctionalInterface
public abstract interface Prediction {

	public abstract boolean test(String s); // méthode abstraite
	
	
	public default void info() {
		System.out.println("A partir de la version 8");
	}
	
	public static void affichage() {
		System.out.println("A partir de la version 8");
	}
}
