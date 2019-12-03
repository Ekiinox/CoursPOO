package exoFraction;

public class Fonctions {

	private static int pgcd1(int a, int b) {
		if(a==b) return a;
		else if(a > b )
			return pgcd1(a-b, b);
		else return pgcd1(a, b-a);
	}
	
	public static int pgcd(int a, int b) {
		if(a==0) return Math.abs(b);
		else if(b==0) return Math.abs(a);
		else return pgcd1(Math.abs(a),Math.abs(b));
	}
	
}
