package geometrie.base;

public class TestVecteur {

	public static void main(String []arg)
	{
		Vecteur v1 = new Vecteur(2,3);
		Vecteur v2 = new Vecteur(-1,2);
		Vecteur v3;
		v3 = v1.somme(v2);
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
		System.out.println("v3 = "+v3);
	}
}
