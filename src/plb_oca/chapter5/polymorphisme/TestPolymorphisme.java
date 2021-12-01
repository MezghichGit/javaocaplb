package plb_oca.chapter5.polymorphisme;

public class TestPolymorphisme {
	
	public static void info(Animal a) // polymorphisme générique
	{
		
	}

	public static void main(String[] args) {
		info(new Animal());
		info(new Poisson()); // cast vers Animal
		info(new Oiseau());
		
		Animal tab[] = new Animal[2]; // tab est un tableau polymorph
		tab[0] = new Poisson();
		tab[1] = new Oiseau();
		
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		
		//a = o;  // UpCasting OK
		
		a = new Oiseau(); //Upcasting
		o = (Oiseau)a;    // DownCasting KO
		
		System.out.println("Fin du programme!");

	}

}
