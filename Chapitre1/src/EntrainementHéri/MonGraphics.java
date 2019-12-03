package EntrainementHéri;
import java.awt.*;

public class MonGraphics {

	Graphics g;
	public MonGraphics(Graphics g) {this .g=g;}
	
	public void dessine(Point p1, Point p2)
	{
		int x1, y1, x2, y2;
		x1 = (int) p1.x; y1 = (int) p1.y; x2=(int) p2.x;y2=(int)p2.y;
		g.drawLine(x1, y1, x2, y2);
	}
}
