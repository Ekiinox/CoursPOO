package EntrainementHéri;
import java.awt.*;

public class Cadre extends Frame{
	
	public Cadre(String titre)
	{
		super(titre);
		setSize(1000,600);
	}
	
	public void paint(Graphics g)
	{
		double k = 100;
		Point a1,b1,c1,a2,b2,c2,d2,I;
		a1 = new Point(k,k);
		b1 = new Point(3*k,k);
		c1 = new Point(k,5*k);
		Triangle t = new Triangle(a1,b1,c1);
		a2 = new Point(4*k,k);
		b2 = new Point(8*k,k);
		c2 = new Point(8*k,5*k);
		d2 = new Point(4*k,5*k);
		Quadrilatere q = new Quadrilatere(a2,b2,c2,d2);
		I = new Point(4*k,8*k);
		Disque d = new Disque(I, 2*k);
		Forme tab[]= {t, d, q};
		Scene scene = new Scene(tab);
		scene.dessins(g);
		System.out.println("scene.aire() = "+scene.aire());
	}
}
