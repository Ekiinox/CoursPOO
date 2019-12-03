package exoFraction;

public class Fraction {

	private int num,dem;
	
	/**
	 * Contruit une fraction
	 * @param a : numérisation
	 * @param b : dénomination tel que b != 0 
	 * @throws une IllegalExecption 
	 */
	public Fraction(int a,int b)
	{
		init(a,b);
	}
	
	/**
	 * Constuit une fraction a partir d'une chaine de caractère
	 * @param s respectant le format nombre entier / nombre entier
	 * @throws ---
	 */
	public Fraction(String s)
	{
		String t[] = s.split("/");
		int a = Integer.parseInt(t[0].trim());
		int b = Integer.parseInt(t[1].trim());
		init(a,b);
	}
	
	private void init (int a, int b)
	{
		if(b==0) { throw new IllegalArgumentException("Fraction(a,b) : b== 0");} 
		if(b<a) {this.num = -a; this.dem = -b;}
		else {this.num = a; this.dem = b;}
	}
	
	/**
	 * Compare de type de la classe avec le paramètre
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if (num != other.num)
			return false;
		if (dem != other.dem)
			return false;
		return true;
	}
	
	/**
	 * Additionne deux fractions 
	 * @param a
	 * @return
	 */
	public Fraction somme(Fraction a)
	{
		return new Fraction(this.num*a.dem + this.dem*a.num, this.dem*a.dem);
	}
	
	/**
	 * Multiplie deux fractions 
	 * @param a
	 * @param b
	 * @return
	 */
	public Fraction produit(Fraction a)
	{
		return new Fraction(this.num*a.num,this.dem*a.dem);
	}
	
	/**
	 * 
	 * @return
	 */
	public Fraction opposi() {
		return new Fraction(-num,dem);
	}
	
	/**
	 * return la difference 
	 * @param x
	 * @return
	 */
	public Fraction difference(Fraction x) {
		return this.somme(x.opposi());
	}
	
	/**
	 * invers le num et le dem
	 * @return
	 */
	public Fraction invers() {
		Fraction r = new Fraction(this.dem, this.num);
		return r;
	}
	
	/**
	 * Simplifie une fraction
	 * @param a
	 * @return
	 */
	public Fraction simplification(Fraction a)
	{
		return new Fraction(Fonctions.pgcd(this.num, a.num), Fonctions.pgcd(this.dem,a.dem));
	}
	
	/**
	 * division de deux fraction
	 * @param a
	 * @return
	 */
	public Fraction division(Fraction a)
	{
		return this.produit(a.invers());
	}
	
	
	/**
	 * Methode to String
	 */
	public String toString()
	{
		return "";
	}
	
	

}
