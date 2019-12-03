package geometrie.formes;
import geometrie.base.Vecteur;

public class TestCercle {

	public static void main(String arg[])
	{
		Cercle c1 = new Cercle(new Vecteur(2,3),10);
		System.out.println("c1 = "+c1);
		
		Cercle c2;
		Vecteur u = new Vecteur(-1,4);
		c2=c1.translation(u);
		System.out.println("c2 = "+c2);
		
	}
}
