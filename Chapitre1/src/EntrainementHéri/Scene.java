package EntrainementHéri;
import java.awt.*;

public class Scene {
	
	Forme t[];
	
	public Scene(Forme t[]) {this.t = t;}
	
	public double aire()
	{
		double s; int i;
		for(i=0,s=0;i<t.length;++i)
		{
			s=s+t[i].aire();
		}
		return s;
	}
	
	public void dessins(Graphics g)
	{
		for(Forme f : t) f.dessine(g);
	}
}
