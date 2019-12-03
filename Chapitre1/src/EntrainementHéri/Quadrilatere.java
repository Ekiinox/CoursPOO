package EntrainementHéri;
import java.awt.*;

public class Quadrilatere extends Forme {
	
	Point a,b,c,d;
	
	public Quadrilatere(Point a, Point b,Point c, Point d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	public double aire()
	{
		Triangle abc = new Triangle(a,b,c);
		Triangle cda = new Triangle(c,d,a);
		return abc.aire()+cda.aire();
	}
	
	public void dessine(Graphics g) 
	{
		MonGraphics mg = new MonGraphics(g);
		mg.dessine(a, b);
		mg.dessine(b, c);
		mg.dessine(c, d);
		mg.dessine(d, a);
	}
}
