package exoDate;

public class Date {

	int numJour;
	JourSemaine libJour;
	Mois mois;
	int annee;
	
	public Date(int numJour,JourSemaine libJour, Mois mois, int annee)
	{
		if(!(1<=numJour && numJour <= mois.Longueur(annee))) erreur
		{
			this .libJour = libJour;this.numJour = numJour;this.mois = mois; this.annee=annee;
		}
	}
	public Date(String jourSemaine, int jourMois, String mois, int annee) 
	{
		this(new JourSemaine(numJour),libMois, new Mois(mois), annee);
	}
	public Date()
	{
		
	}
	
	public Date precedente()
	{
		return new Date();
	}
	public Date suivante()
	{
		return new Date();
	}
	public String toString()
	{
		String v= "";
		return v;
	}

}
