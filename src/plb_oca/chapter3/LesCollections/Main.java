package plb_oca.chapter3.LesCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		List<String> list = new ArrayList<> ();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.add("toto");
		list.add("java");
		list.add("true");
		list.add("16");
		for(Object o : list)
		{
			String temp = (String)o;
			System.out.println(temp.toUpperCase());
		}
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.toString());
		 */
		
		/*List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(new Integer(1));
		li.add(14);  // Autoboxing; Boxing
		int x = li.get(0); // Unboxing
		//li.add(1,18);
		System.out.println(li);
		//System.out.println(x);
		boolean res = li.remove(new Integer(14));
		li.re
		System.out.println(li);*/
		/*
		List<String> ls = new ArrayList<>();
		
		ls.add("java");
		ls.add("oca");
		ls.add("oca");
		
		List<String> ls2 = new ArrayList<>();
		ls2.add("oca");
		ls2.add("java");
		
		ls.removeAll(ls2);
		System.out.println(ls);*/
		/*
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(null);
		System.out.println(li);*/
		//int v = li.get(1); // Unboxing d'un null pas possible
		//System.out.println(v);
		
		// Passage d'une vers un tableau
		/*
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object tab[] = list.toArray();
		System.out.println(tab);
		System.out.println(tab.length);
		System.out.println(tab[0]);
		*/
		// Passage d'un tableau vers une liste
		/*
		Integer [] tab = {10,12,24};
		System.out.println(tab.length);
		List list =Arrays.asList(tab);
		//list.add(20);
		list.set(0, -1);
		System.out.println(list);
		*/
		/*List<String> list = new ArrayList<>();
		String [] tab = list.toArray(new String[] {});*/
		ArrayList couleurs = new ArrayList <>(Arrays.asList("Rouge", "Bleu", "Vert"));
	}

}
