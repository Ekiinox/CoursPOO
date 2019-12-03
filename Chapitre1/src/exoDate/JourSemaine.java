package exoDate;

public class JourSemaine {

	private int j; // 0 <= j <= 6  0 <-> lundi
	public static final int LUNDI = 0;
	public static final int MARDI = 1;
	public static final int MERCREDI = 2;
	public static final int JEUDI = 3;
	public static final int VENDREDI = 4;
	public static final int SAMEDI = 5;
	public static final int DIMANCHE = 6;
	
	private static String[] semaine = {
		"Lundi",
		"Mardi",
		"Mercredi",
		"Jeudi",
		"Vendredi",
		"Samedi",
		"Dimanche"
	};
	
	/**
	 * Constructeur de jourSemaine
	 * @param numero
	 */
	public JourSemaine(int j)
	{
		if (!(j < 7 && j >= 0))
		{
			this.j = j;
		}
		else
		{
			throw new IllegalArgumentException("Jour semaine invalide :"+j);
		}
	}
	
	public JourSemaine(String s) 
	{
		this(Divers.position(s.trim(), semaine));
	}
	
	public JourSemaine Suivant()
	{
		int j = (this.j+1)%7;
		return new JourSemaine(j);
	}
	
	public JourSemaine Precedent()
	{
		int j = (this.j+6)%7;
		return new JourSemaine(j);
	}
	
	public String toString() {return semaine[this.j];}
}
