package plb_oca.chapter4.Encapsulation;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal(10, new StringBuilder("Toto"));
		//a.age = -12;
		//a.setAge(12);
		System.out.println(a.getAge());
		System.out.println(a.getName());
		StringBuilder s = a.getName();
		s.append("tata");
		System.out.println(a.getName());

	}

}
