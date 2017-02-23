package projectGraphe;

import java.util.ArrayList;


public class MainClass {

	public static void main(String[] args) {

	
// Sources et Supersource
		
		Sommet s = new Sommet("S");
		Sommet a = new Sommet("A");
		Sommet b = new Sommet("B");
		Sommet c = new Sommet("C");
		
// Puits et Superpuits 
		
		Sommet d = new Sommet("D");
		Sommet e = new Sommet("E");
		Sommet f = new Sommet("F");
		Sommet g = new Sommet("G");	
		Sommet p = new Sommet("P");
		
// Cannalisations Sources / Puits
		
		Canalisation ad = new Canalisation ("AD", 30.0, 0.00, a, d);
		Canalisation ae = new Canalisation ("AE", 15.0, 0.00, a, e);
		Canalisation ag = new Canalisation ("AG", 20.0, 0.00, a, g);
		Canalisation bd = new Canalisation ("BD", 20.0, 0.00, b, d);
		Canalisation be = new Canalisation ("BE", 05.0, 0.00, b, e);
		Canalisation bf = new Canalisation ("BF", 15.0, 0.00, b, f);
		Canalisation cf = new Canalisation ("CF", 10.0, 0.00, c, f);
		Canalisation cg = new Canalisation ("CG", 10.0, 0.00, c, g);
		
		Canalisation da = new Canalisation ("AD", 0.00, 30.00, d, a);
		Canalisation ea = new Canalisation ("AE", 0.00, 15.00, a, e);
		Canalisation ga = new Canalisation ("AG", 0.00, 20.00, a, g);
		Canalisation db = new Canalisation ("BD", 0.00, 20.00, b, d);
		Canalisation eb = new Canalisation ("BE", 0.00, 05.0, b, e);
		Canalisation fb = new Canalisation ("BF", 0.00, 15.00, b, f);
		Canalisation fc = new Canalisation ("CF", 0.00, 10.00, c, f);
		Canalisation gc = new Canalisation ("CG", 0.00, 10.00, c, g);
		
// Cannalisations Supersource / Sources
		
		Canalisation sa = new Canalisation ("SA", 45.0, 0.00, s, a);
		Canalisation sb = new Canalisation ("SB", 25.0, 0.00, s, b);
		Canalisation sc = new Canalisation ("SC", 20.0, 0.00, s, c);
		
// Cannalisations Puits / Superpuits
		
		Canalisation dp = new Canalisation ("DP", 30.0, 0.00, d, p);
		Canalisation ep = new Canalisation ("EP", 10.0, 0.00, e, p);
		Canalisation fp = new Canalisation ("FP", 20.0, 0.00, f, p);
		Canalisation gp = new Canalisation ("GP", 30.0, 0.00, g, p);
		
		
//*************************LISTES CANNALISATIONS*********************************************************
		ArrayList<Canalisation> sources = new ArrayList <Canalisation>();
		ArrayList<Canalisation> can = new ArrayList <Canalisation>();
//		ArrayList<Canalisation> 
		
		
//***************************AJOUT DES SOURCES**********************************************************
		sources.add(sa);
		sources.add(sb);
		sources.add(sc);

//******************************AJOUT DES CANA SENS POSITF**********************************************
		can.add(ad);
		can.add(ae);
		can.add(ag);
		can.add(bd);
		can.add(be);
		can.add(bf);
		can.add(cf);
		can.add(cg);
		
//******************************AJOUT DES CANA SENS NEGATIF**********************************************
		can.add(da);
		can.add(ea);
		can.add(ga);
		can.add(db);
		can.add(eb);
		can.add(fb);
		can.add(fc);
		can.add(gc);

//*******************************AJOUT DES PUITS********************************************************
		can.add(dp);
		can.add(ep);
		can.add(fp);
		can.add(gp);

		
//****************************TEST**************************************************************************		
		Graph.flotMax(can, sources);
		/*for (Canalisation cana : sources)
			System.out.println(cana);
		for (Canalisation cana : can)
			System.out.println(cana);
		/*System.out.println(sc.getCapacity());
		System.out.println(sb);*/
	}

}
