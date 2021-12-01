package plb_oca.chapter4.FunctionnalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestLambda {

	public static void main(String[] args) {
		/*
		Prediction p1 = (String s)->{return s.length()==6;}; // expression étendue verbose
		System.out.println(p1.test("ocaocp"));
		
		Prediction p2 = (String s)->{return s.startsWith("oc");};
		System.out.println(p2.test("pocaocp"));
		
		Prediction p3 = s -> s.contains("ao"); // expression réduite
		
		System.out.println(p3.test("pocaocp"));*/
		//Calcul som = (double x, double y)->{return x+y;};
		/*
		Calcul som = (x,y)-> x+y; // expression reduite
		Calcul prod = (double x, double y)->{return x*y;};
		
		System.out.println(som.operation(2,4));
		System.out.println(prod.operation(2,4));*/
		
		List<String> names = new ArrayList<>();
		names.add("jean");
		names.add("michelle");
		names.add("amine");
		names.add("paul");
		names.add("marie");
		System.out.println(names);
		
		Predicate<String> filtre = (String s)->{return s.contains("m");};
		names.removeIf(filtre);
		System.out.println(names);

	}

}
