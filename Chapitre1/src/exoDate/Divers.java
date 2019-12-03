package exoDate;

public class Divers {
	
	/**
	 * 
	 * @param s
	 * @param t
	 * @return i + q s=t[i] ou -1 si s != t
	 */
	public static int position(String s, String t[])
	{
		int i;
		for(i=0;i<t.length;i++)
		{
			if(s.equalsIgnoreCase(t[i])) return i;
		}
		return -1;
	}
	
	public static boolean estBissextile(int a)
	{
		return a%400 == 0 || (a%4 == 0 && a%100!=0);
	}	
}
