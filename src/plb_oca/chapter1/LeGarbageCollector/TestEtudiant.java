package plb_oca.chapter1.LeGarbageCollector;

public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();
		Etudiant e3 = new Etudiant();
		
		e1 = null;
		//e2 =e3;
		System.gc();
		for(int i = 0; i<1000; i++)
		{
			System.out.println("i = "+i);
		}
		 // appel au garbage collector
		System.out.println("Suite du programme dans le main");
		//System.out.println(e1.toString());

	}

}
