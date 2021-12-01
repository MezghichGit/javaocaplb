package plb_oca.chapter6;

public class MainVoiture {

	public static void main(String[] args) { //throws Exception {
		Voiture v = new Voiture();
		v.affichage();
		try {
			v.info();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
