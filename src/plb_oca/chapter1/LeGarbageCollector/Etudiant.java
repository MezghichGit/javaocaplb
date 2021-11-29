package plb_oca.chapter1.LeGarbageCollector;

public class Etudiant {

	protected void finalize()
	{
		System.out.println("Un objet détruit");
	}
}
