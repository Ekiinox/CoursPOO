package ConjugaisonVerbes;

public class Verbe1Groupe extends Verbe{
	
	public Verbe1Groupe(String unVerbe)
	{
		super(unVerbe);
	}
	
	public String terminaisonSingulier()
	{
		return "e";
	}
	
	public String terminaisonPluriel()
	{
		return "ons";
	}
	
	public String terminaisonparticipePasse()
	{
		return "é";
	}
}
