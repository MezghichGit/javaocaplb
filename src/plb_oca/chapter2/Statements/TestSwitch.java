package plb_oca.chapter2.Statements;

import plb_oca.chapter2.Operateurs.Day;

/*enum Day {
	LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE};*/
public class TestSwitch {
	
	

	public static void main(String[] args) {
		/*
		Day day = Day.MARDI;
		
		switch(day)
		{
		 	case LUNDI : System.out.println("Lundi"); break;
		 	case MARDI : System.out.println("Mardi"); break;
		 	case DIMANCHE : System.out.println("Dimanche"); break;
		 	default : System.out.println("Autre jour");
		}*/
		/*
		int age = 12;

		final int  x = 10; // final = constante
		switch (age) {
		
		
		case x:
			System.out.println("Eleve");
			break;
		case 19:
			System.out.println("Lyceen");
			break;
		case 22:
			System.out.println("Etudiant");
			break;
		default:
			System.out.println("Age non traité");
		}*/
		
		/*for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
			System.out.print(x); 
			}*/
		
		int [][] tab = {{10,12},{20,23,26},{30,35,39,38}};
		
		///System.out.print(tab[2][1]); 
		
		//Boucle classique
		/*
		for(int i = 0; i<tab.length; i++)
		{
			for(int j=0; j<tab[i].length;j++)
			{
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
		}*/
		
       /*
		for(int[] t : tab)
		{
			for(int e : t)
			{
				System.out.print(e+"\t");
			}
			System.out.println();
		}*/
	}

}
