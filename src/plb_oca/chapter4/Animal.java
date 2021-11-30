package plb_oca.chapter4;

public class Animal {

	private int age;  // accessible uniquement dans la classe
	
	String espece;   // package-private (visible dans la classe et dans le package)
	
	protected int poids; // package-private et les fils m�me dans un autre package peuvent h�riter
	
	public String nom;
	
	public Animal() {  // constructeur par d�faut
		this(1,"");
		System.out.println("constructeur par d�faut");
	}
	
	public Animal(int age, String nom) {  // constructeur avec param�tres
		//this(); // appel au constructeur par defaut
		System.out.println("constructeur avec param�tres");
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