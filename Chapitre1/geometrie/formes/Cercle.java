package geometrie.formes;
import geometrie.base.Vecteur;

/**
 * Représente un cercle defini par un centre et un rayon > 0
 * @author Robin
 *
 */
public class Cercle 
{
	Vecteur centre;
	private double rayon; // rayon > 0
	
	/**
	 * 
	 * @param centre
	 * @param rayon
	 */
	public Cercle(Vecteur centre, double rayon)
	{
		this.centre = centre;
		if(rayon <= 0)
		{
			throw new IllegalArgumentException("Cercle(centre, rayon):rayon < 0");
		}
	}
	
	public String toString()
	{
		return "cercle: "+centre+", "+rayon+")";
	}
	
	/**
	 * 
	 * @return
	 */
	public Cercle translation(final Vecteur u)
	{
		return new Cercle(centre.somme(u),rayon);
	}
}
