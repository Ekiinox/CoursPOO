package ConjugaisonVerbes;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Verbe> liste1 = new ArrayList<Verbe>();
		
		Verbe v1 = new Verbe1Groupe("manger");
		Verbe v2 = new Verbe2Groupe("frémir");
		Verbe v3 = new Verbe2Groupe("finir");
		Verbe v4 = new Verbe1Groupe("chanter");
		Verbe v5 = new Verbe2Groupe("nourrir");
		Verbe v6 = new Verbe1Groupe("parler");
		Verbe v7 = new Verbe1Groupe("planter");
		Verbe v8 = new Verbe1Groupe("porter");
		Verbe v9 = new Verbe2Groupe("rugir");
		Verbe v10 = new Verbe2Groupe("ralentir");
		
		liste1.add(v1);
		liste1.add(v2);
		liste1.add(v3);
		liste1.add(v4);
		liste1.add(v5);
		liste1.add(v6);
		liste1.add(v7);
		liste1.add(v8);
		liste1.add(v9);
		liste1.add(v10);
		
		ListeVerbes listeTest = new ListeVerbes(liste1);
		
		System.out.println("PP");
		System.out.println(listeTest.conjuge1erePersonnePluriel());
		System.out.println("PS");
		System.out.println(listeTest.conjugue1erePersonnesSingulier());
		System.out.println("PPassée");
		System.out.println(listeTest.conjugeParticipePasse());
		System.out.println("Participe présent");
		System.out.println(listeTest.conjugeParticipePresent());
		
	}

}
