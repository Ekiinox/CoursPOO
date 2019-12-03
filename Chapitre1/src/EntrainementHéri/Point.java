package EntrainementHéri;

public class Point {
	
	double x,y;
	
	public Point(double x, double y) {this.x=x; this.y=y;}
	
	public static double distance(Point p1, Point p2)
	{
		double dx = p2.x - p1.x;
		double dy = p2.y - p1.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public static Point difference(Point p1, Point p2)
	{
		return new Point(p1.x-p2.x,p1.y-p2.y);
	}
	
	public static double dit(Point p1,Point p2)
	{
		return p1.x*p2.y-p1.y*p2.x;
	}
}
