package plb_oca.chapter5.LesInterfaces;


// Un objet de type MulFonctions est un objet polymorphe
public class MultiFonctionsHP implements Imprimante,Scanner,Photocopieuse {

	@Override
	public void info()  // a partir de la version 8
	{
		System.out.println("Info Multifonctions");
	}
	@Override
	public void photocopier() {
		System.out.println("EN couleur");
		
	}

	@Override
	public void scan() {
		System.out.println("Un scan");
		
	}

	@Override
	public void imprimer() {
		System.out.println("Impression");
		
	}

}
