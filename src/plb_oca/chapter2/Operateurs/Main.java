package plb_oca.chapter2.Operateurs;

public class Main {

	public static void main(String[] args) {
		/*
     int x = 10;
     //int y = ++x; // pré-increment
     int y = x--;   // post-incrément
     System.out.println("x = "+x);
     System.out.println("y = "+y);
     
     boolean test = true;
     boolean res = !test;
     System.out.println("res = "+res);*/
		
		//int x = 2, y = 4, z = 8, k =10;
		
		//int val = x * (y + x + z + k) + z*2;
		/*
		int val = ++x * y++ + x * z-- + --k *3 + ++z*2;
		//      = 3   * 4   + 3 * 8   +   9*3    + 8* 2
		         // = 12+ 24+27+16
		System.out.println("x = "+x);   //3
		System.out.println("y = "+y);  // 5  
		System.out.println("z = "+z);   //8 
		System.out.println("k = "+k);  //9
		System.out.println(val);*/
		
		//int x = 10, y = 100, z = 200;
		/*
		boolean res = (x<y) || (++y<z);
		System.out.println(res);
		System.out.println("y = " +y);*/
		/*
		Object res = (y<x)?true:-1;
		System.out.println(res);
		System.out.println((y<x)?true:-1);*/
		/*
		byte x = 10;
		byte y = 20;
		double som = x + y;
		System.out.println(som);*/
		//int x = (int)1.9;
		//System.out.println(x);
		//short y = (short)1921222; 
		//System.out.println(y);
		//byte y = (byte)130;
		//System.out.println(y);
		
		//int x=2, z = 3;
		//x = x * z; // Simple assignment operator; 
		//x *= z;
		long x = 10;int y = 5;
		//y = y*x;
		//y = (int)(y * x); 
		//y+=x;
		x = x+y;
		System.out.println(x);
		
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		boolean res = o instanceof Animal;
		System.out.println(res);
		
	}

}
