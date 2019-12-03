package ConjugaisonVerbes;

public abstract class Verbe {
	
	String radical;
	String infinitif;
	
	public Verbe(String unVerbe)
	{
		this.radical = unVerbe.substring(0,unVerbe.length()-2);
		this.infinitif = unVerbe;
	}
	
	public abstract String terminaisonSingulier();
	public abstract String terminaisonPluriel();
	public abstract String terminaisonparticipePasse();
	
	public String conjuge1PersonneSingulier()
	{
		return "je "+this.radical + terminaisonSingulier();
	}
	
	public String conjuge1PersonnePluriel()
	{
		return "nous "+ this.radical + terminaisonPluriel();  // On ne touche plus a rien
	}
	
	public String participePasse()
	{
		return this.radical + terminaisonparticipePasse();
	}
	
	public String participePresent()
	{
		return this.radical + "ant";
	}
	
}
