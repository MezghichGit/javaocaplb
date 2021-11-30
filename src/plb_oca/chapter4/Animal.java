package plb_oca.chapter4;

public class Animal {

	private int age;  // accessible uniquement dans la classe
	
	String espece;   // package-private (visible dans la classe et dans le package)
	
	protected int poids; // package-private et les fils même dans un autre package peuvent hériter
	
	public String nom;
	
	public Animal() {  // constructeur par défaut
		this(1,"");
		System.out.println("constructeur par défaut");
	}
	
	public Animal(int age, String nom) {  // constructeur avec paramètres
		//this(); // appel au constructeur par defaut
		System.out.println("constructeur avec paramètres");
	}
	public void infoAnimal()
	{
		System.out.println("Age = "+ this.age + " Espece :"+ this.espece+" Poids :" + this.poids +" Nom : "+this.nom);
	}
	
	public void infoAnimal(int a)
	{
		System.out.println("Age = "+ this.age + " Espece :"+ this.espece+" Poids :" + this.poids +" Nom : "+this.nom);
	}
}