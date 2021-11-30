package plb_oca.chapter3.LesString;

public class MainString {

	public static void main(String[] args) {
		
		int x = 10;
		double moy = 15.5;
		String s1 = "OCA"; //String Pooling ou le Pool
		/*String s2 = new String("OCA"); // heap
		String s3 = "OCA";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);*/
		//Animal a = new Animal();  // heap*/
		/*
		System.out.println("La classe String immutable");
		String ch = "oca";
		ch.concat("-ocp");
		//System.out.println(ch.concat("-ocp"));
		System.out.println(ch);
		
		System.out.println("La classe StringBuilder mutable");
		StringBuilder sb = new StringBuilder("oca");
		sb.append("-ocp");
		System.out.println(sb);*/

		//String res = 2+3+"a"+"b"+2+6;
		//System.out.println(res);
		//
		Animal a1 = new Animal();  // dans le heap
		Animal a2 = new Animal();  // dans le heap
		a1.id = 10;
		a2.id = 11;
		System.out.println(a1 == a2);  // ==
		System.out.println(a1.equals(a2)); // ==
		
		String ch1 = new String("OCA");  // heap
		String ch2 = new String("OCA");  // heap
		
		System.out.println(ch1 == ch2);  // false
		System.out.println(ch1.equals(ch2));  // contenu
		System.out.println("**********");
		
		System.out.println(a1);
		System.out.println(a1.toString());
		
		System.out.println(ch1);
		System.out.println(ch1.toString());
		
		String string="\t animals \n";
		//System.out.println(string.substring(0, 8));
		System.out.println(string);
		System.out.println(string.trim());
	}

}
