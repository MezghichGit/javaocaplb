package plb_oca.chapter4.passageDeParametres;

public class Main {
	
	public static void permut(int x, int y)
	{
		System.out.println("Avant permutation");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		int temp;
		temp = x;
		x=y;
		y = temp;
		System.out.println("Après permutation");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	public static void permutStringBuilder(StringBuilder sb)
	{

		sb.append("-ocp");
		
		System.out.println("sb = "+ sb);

	}
	
	public static void permutString(String s)
	{

		s=s.concat("-ocp");
		
		System.out.println("s = "+ s);

	}


	public static void main(String[] args) {
		// 1-Cas des types primitifs
		/*
		int a = 10, b = 20;
		permut(a,b);
		System.out.println("Valeurs des paramètres effectifs après l'appel");
		System.out.println("a = "+a);
		System.out.println("b = "+b);*/
		
		//2-Cas des types références mutables : exemple StringBuilder
		/*
		StringBuilder ch = new StringBuilder("oca");
		permutStringBuilder(ch); // ici se fait le passage de paramètres
		System.out.println("ch = "+ch);*/
		
		//3-Cas des types références immutables : exemple String, LocalDate...
		
		String ch = "oca";
		permutString(ch);
		System.out.println("ch = "+ch);

	}

}
