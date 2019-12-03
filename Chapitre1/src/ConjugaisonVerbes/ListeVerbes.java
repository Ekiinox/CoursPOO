package ConjugaisonVerbes;

import java.util.ArrayList;

public class ListeVerbes {

	ArrayList<Verbe> ListeVerbe = new ArrayList<Verbe>();
	
	public ListeVerbes(ArrayList<Verbe> uneListe)
	{
		this.ListeVerbe = uneListe;
	}
	
	public String conjugue1erePersonnesSingulier()
	{
		String resultat = "";
		for(Verbe v : ListeVerbe)
		{
			resultat += " " + v.conjuge1PersonneSingulier() +"\n";
		}
		return resultat;
	}
	
	public String conjuge1erePersonnePluriel()
	{
		String resultat = "";
		for(Verbe v : ListeVerbe)
		{
			resultat += " " + v.conjuge1PersonnePluriel() +"\n";
		}
		return resultat;
	}
	
	public String conjugeParticipePresent()
	{
		String resultat = "";
		for(Verbe v : ListeVerbe)
		{
			resultat += " " + v.participePresent()+ "\n";
		}
		return resultat;
	}
	
	public String conjugeParticipePasse()
	{
		String resultat = "";
		for(Verbe v : ListeVerbe)
		{
			resultat += " " + v.participePasse()+ "\n";
		}
		return resultat;
	}
	
}
