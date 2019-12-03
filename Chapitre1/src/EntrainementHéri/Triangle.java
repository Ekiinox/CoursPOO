package EntrainementHéri;
import java.awt.*;

public class Triangle extends Forme {

	Point  a,b,c;
	
	public Triangle(Point a, Point b, Point c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	public double aire()
	{
		Point u = Point.difference(c, a);
		Point v = Point.difference(b, a);
		return 0.5*Math.abs(Point.dit(u,v));
	}
	
	public void dessine(Graphics g)
	{
		MonGraphics mG = new MonGraphics(g);
		mG.dessine(a, b);
		mG.dessine(b, c);
		mG.dessine(c, a);
	}
	
}
