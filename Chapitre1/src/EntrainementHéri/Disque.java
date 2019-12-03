package EntrainementHéri;
import java.awt.*;

public class Disque extends Forme {
	
	public Point centre;
	private double rayon;
	
	public Disque(Point centre, double rayon)
	{
		if(centre == null)
		{
			throw new IllegalArgumentException("Le Centre n'est pas valide");
		}
		else 
		{
			this.centre = centre;
			this.rayon = rayon;
		}
	}
	
	public double aire()
	{
		return Math.PI*rayon*rayon;
	}
	
	public void dessine(Graphics g)
	{
		double xHG, yHG, d;
		xHG = centre.x-rayon;
		yHG = centre.y-rayon;
		d = 2*rayon;
		g.drawOval((int)xHG, (int)yHG,(int) d,(int) d);
	}
}
