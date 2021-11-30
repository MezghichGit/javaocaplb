package plb_oca.chapter3.LesStringBuilder;

public class MainStringBuilder {

	public static void main(String[] args) {
		//String alpha = "";
		
		// variante basée sur les String
		/*for(char current = 'a'; current <= 'z'; current++)
			{
				alpha = alpha +  current;
				System.out.println(alpha);
			}*/
		// variante basée sur les StringBuilder 
		   /*StringBuilder alpha = new StringBuilder();
		   for(char current = 'a'; current <= 'z'; current++)
			   alpha.append(current);
		       System.out.println(alpha);*/
		
		/*String ch = new String("oca");
		String ch2 = ch.concat("ocp");
		System.out.println(ch2 == ch);
		StringBuilder sb = new StringBuilder("oca");
		StringBuilder sb1 = sb.append("ocp");
		System.out.println(sb1 == sb);*/
		
		// Les StringBuilder
		/*StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("ocaocaocaocaocabxocaocaocaocaocabxztt");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		
		StringBuilder sb2 = new StringBuilder(8);
		sb2.append("ocaocaocaocaocabxocaocaocaocaocabxztt");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity()); // capacité initiale = 8
		
		String name = "Amine";
		StringBuilder s = new StringBuilder(name);
		s.append(" Mezghich");
		name = s.toString();
		System.out.println(s);
	}

}
