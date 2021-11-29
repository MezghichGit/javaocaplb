package plb_oca.chapter1;

public class TestEtudiant {

	public static void InfoAnimal(Animal ... v) {
		
	}
	
	
	public static void somme(int ... v) {
		int res = 0;
		for(int i = 0; i<v.length; i++)
		{
			res = res + v[i];
		}
		System.out.println(res);
	}
	public static void main(String ... args) {
		int tab[] = {10,3,14};
		somme(tab);
		somme(10,2);
		/*somme();
		somme(10,2);
		somme(10,2,15);*/
		/*
		Etudiant e = new Etudiant();
		
		System.out.println(e.nom);
		System.out.println(e.age);
		System.out.println(e.moy);
		System.out.println(Etudiant.max);*/
	}

}
