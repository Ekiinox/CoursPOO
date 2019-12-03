package exoDate;

public class Mois {
	
	private int m; //tel que 0 <= m <=11
	String libMois;
	int longeur;
	
	public static final int JANVIER = 0; 
    public static final int FEVRIER = 1;
    public static final int MARS = 2;
    public static final int AVRIL = 3;
    public static final int MAI = 4;
    public static final int JUIN = 5;
    public static final int JUILLET = 6;
    public static final int AOUT = 7;
    public static final int SEPTEMBRE = 8;
    public static final int OCTOBRE = 9;
    public static final int NOVEMBRE = 10;
    public static final int DECEMBRE = 11;
	
	private static int longueurs[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	private static final String[] noms = {
		"Janvier",
		"Février",
		"Mars",
		"Avril",
		"Mai",
		"Juin",
		"Juillet",
		"Août",
		"Septembre",
		"Octobre",
		"Novembre",
		"Décembre"
	};
	
	public Mois(int pIndex) 
	{         
		if(!(0<=pIndex && pIndex <=12)) throw new IllegalArgumentException("le mois invalide : "+pIndex);         
		{             
			this.m = pIndex;
		}
	}
	
	public Mois precedent()
	{
		Mois unMois;
		if(this.m == 1) 
		{
			return unMois = new Mois(12);
		}
		else
		{
			return unMois = new Mois(this.m - 1 );
		}
	}
	
	public Mois suivant()
	{
		Mois unMois;
		if(this.m == 12) 
		{
			return unMois = new Mois(1);
		}
		else 
		{
			return unMois = new Mois(this.m +1);
		}
	}
	// toLowerCase() minuscule
	public int Longueur(int annee) 
	{	
		if(m == FEVRIER && (Divers.estBissextile(annee))) return 29;
		else return longueurs[m];
	}
}
