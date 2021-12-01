package plb_oca.chapter6;

public class Main {

	public static void main(String[] args) {
		int x =10, y =0;
		int tab[]= {10,2,50};
		String ch = null;
		try {
			System.out.println(ch.length());
			System.out.println(tab[3]);
			System.out.println("x/y = "+(x/y));
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Un problème de division par zéro");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Un problème d'accès au indice du tableau");
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			return;
		}
		finally {
		System.out.println("Suite du programme...");
		}


	}

}
