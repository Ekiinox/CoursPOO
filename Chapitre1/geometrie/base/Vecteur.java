package geometrie.base;

/**
 * Représente un vecteur du plan
 * @author Robin
 *
 */
public class Vecteur {

	double x,y;
	
	public Vecteur(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Crée le vecteur nul (0, 0)
	 */
	public Vecteur() {this(0,0);}
	
	/**
	 * 
	 * @param s : suivant le format (nombre réel, nombre réel)
	 * @throws une Exception si le format n'est pas reconnu
	 */
	public Vecteur(String s) 
	{
		String t[] = s.split(",");
		int p = t[0].indexOf('(');
		String sx = t[0].substring(p+1);
		sx = sx.trim();
		this.x = Double.parseDouble(sx);
		p = t[1].indexOf(')');
		String sy = t[1].substring(0,p);
		sy = sy.trim();
		this.y = Double.parseDouble(sy);
	}
	
	public String toString ()
	{
		return "("+x+","+y+")";
	}
	
	/**
	 * 
	 * @param v
	 * @return this + v
	 */
	public Vecteur somme(Vecteur v)
	{
		return new Vecteur(this.x+v.x, this.y+v.y);
	}
}
