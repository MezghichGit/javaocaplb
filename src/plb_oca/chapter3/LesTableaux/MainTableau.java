package plb_oca.chapter3.LesTableaux;

import java.util.Arrays;

public class MainTableau {

	public static void main(String[] args) {
		//int [] tab  = {10,5,7};
		//int l = tab.length;
		//System.out.println(l);
		/*
		int [] tab  = new int [3];
		tab[0] = 10;
		tab[1] = 12;
		tab[2] = 24;
		
		for(int e : tab)
		{
			System.out.println(e);
		}*/
		
		//int tab[][] = {{10,2},{5,8,9,7}};
		//System.out.println(tab.length);
		/*int tab[][] = new int[3][];
		tab[0] =new int[3];
		tab[1] =new int[6];
		tab[2] =new int[4];*/
		/*
		Animal tab[] = new Animal[2];
		tab[0] = new Animal();
		tab[1] = new Animal();
		
		Animal a = new Animal();
		
		System.out.println(tab);
		System.out.println(a.toString());
		
		int t[] = new int[2];
		System.out.println(t);*/
		
		int tab[] = {10,3,6,78};
		//Arrays.sort(tab);
		/*
		for(int e : tab)
		{
			System.out.print(e + "\t");
		}*/

		System.out.print(Arrays.binarySearch(tab, 10));
	}

}
