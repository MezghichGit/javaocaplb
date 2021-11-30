package plb_oca.chapter2.Statements;

public class Main {

	public static void main(String[] args) {

		outer : for(int i = 0; i<10;i++)
		{
			for(int j=0; j<10;j++)
			{
				if(j==5) continue outer;
			    System.out.println("i,j = "+i+","+j);
			}
			//System.out.println("Ok");
		}
		for(int i=0; i<10;i++)
		{
			continue;
			//System.out.println("Suite du programme...");
		}
	}

}
