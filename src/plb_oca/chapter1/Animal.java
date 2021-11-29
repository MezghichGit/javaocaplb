package plb_oca.chapter1;

public class Animal {

	// attributs d'instance
	String nom;
	int age;
	// attributs de classe
	
	static int maxAge=100;
	
	//méthode d'instance
	public void info()
	{
		System.out.println("Info Animal : Nom "+ this.nom + " Age : "+ this.age);
		//System.out.println("Max Age : "+maxAge);
	}
	
	//méthode de classe
	public static void affichage()
	{
		/*
		Animal a = new Animal();
		System.out.println(a.age);*/
		System.out.println("Max Age : "+maxAge);
	}

	public Animal() {  // constructeur par defaut
	System.out.println("Constructeur");	
	}

	public void Animal() {  // Une méthode d'instance
		this.age = 20;
	}
	public Animal(String nom, int age) { // constructeur avec deux paramètres
		this.nom = nom;
		this.age = age;
	}
	
	//Bloc d'initialisation d'instance
	{
		System.out.println("Un premier bloc d'initialisation d'instance");
	}
	
	//Bloc d'initialisation de classe
	static {
			System.out.println("Un bloc d'initialisation de classe");
		}
	
	//Bloc d'initialisation d'instance
		{
			System.out.println("Un deuxième bloc d'initialisation d'instance");
		}
	
}
/*
 class Oiseau{
	
}*/