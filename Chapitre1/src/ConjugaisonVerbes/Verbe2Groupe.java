package ConjugaisonVerbes;

public class Verbe2Groupe extends Verbe{
	
	public Verbe2Groupe(String unVerbe)
	{
		super(unVerbe);
	}

	public String terminaisonSingulier()
	{
		return "is";
	}
	
	public String terminaisonPluriel()
	{
		return "issons";
	}
	
	public String terminaisonparticipePasse()
	{
		return "i";
	}
}
 