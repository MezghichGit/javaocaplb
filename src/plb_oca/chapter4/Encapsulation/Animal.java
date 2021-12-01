package plb_oca.chapter4.Encapsulation;

public class Animal {
	private int age;
	private StringBuilder name;

	public StringBuilder getName() {
		return new StringBuilder(name);
	}
	public int getAge() {
		return age;
	}
	public Animal(int a, StringBuilder sb)
	{
		this.age = a;
		this.name = sb;
	}
	/*
	public void setAge(int age) {
		if(age>0)
		  this.age = age;
		else
			System.out.println("L'age est invalide");
	}*/
}
