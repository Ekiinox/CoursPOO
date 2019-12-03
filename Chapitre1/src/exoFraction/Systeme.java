package exoFraction;

public class Systeme {

	public static Fraction[] resout(final Fraction a1, final Fraction b1, final Fraction c1, 
									final Fraction a2, final Fraction b2, final Fraction c2) 
	{
		try {
			Fraction d = det(a1,b1,a2,b2);
			Fraction x[] = new Fraction[2];
			x[0] = det(c1,b1,c2,b2).division(d);
			x[1] = det(a1,c1,a2,c2).division(d);
			return x;
		}
		catch(Exception e) {
			return new Fraction[0];
		}
	}

	private static Fraction det(final Fraction a11,final Fraction a12,
								final Fraction a21,final Fraction a22)
	{
		return a11.produit(a22).difference(a21.produit(a12));
	}
	
	
}
