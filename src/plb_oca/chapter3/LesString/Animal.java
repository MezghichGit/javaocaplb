package plb_oca.chapter3.LesString;

public class Animal extends Object{
 int id;
 
 @Override
 public boolean equals(Object obj) {
	 Animal temp = (Animal) obj;
     return (temp.id == this.id);
 }

@Override
public String toString() {
	return "Animal [id=" + id + "]";
}
}
