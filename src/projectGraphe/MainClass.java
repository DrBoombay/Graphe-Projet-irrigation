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
		
		Cannalisation ad = new Cannalisation ("AD", 30.0, 0.00, a, d, true);
		Cannalisation ae = new Cannalisation ("AE", 15.0, 0.00, a, e, true);
		Cannalisation ag = new Cannalisation ("AG", 20.0, 0.00, a, g, true);
		Cannalisation bd = new Cannalisation ("BD", 20.0, 0.00, b, d, true);
		Cannalisation be = new Cannalisation ("BE", 05.0, 0.00, b, e, true);
		Cannalisation bf = new Cannalisation ("BF", 15.0, 0.00, b, f, true);
		Cannalisation cf = new Cannalisation ("CF", 10.0, 0.00, c, f, true);
		Cannalisation cg = new Cannalisation ("CG", 10.0, 0.00, c, g, true);
		
		Cannalisation da = new Cannalisation ("AD", 0.00, 30.00, d, a, true);
		Cannalisation ea = new Cannalisation ("AE", 0.00, 15.00, a, e, true);
		Cannalisation ga = new Cannalisation ("AG", 0.00, 20.00, a, g, true);
		Cannalisation db = new Cannalisation ("BD", 0.00, 20.00, b, d, true);
		Cannalisation eb = new Cannalisation ("BE", 0.00, 05.0, b, e, true);
		Cannalisation fb = new Cannalisation ("BF", 0.00, 15.00, b, f, true);
		Cannalisation fc = new Cannalisation ("CF", 0.00, 10.00, c, f, true);
		Cannalisation gc = new Cannalisation ("CG", 0.00, 10.00, c, g, true);
		
// Cannalisations Supersource / Sources
		
		Cannalisation sa = new Cannalisation ("SA", 45.0, 0.00, s, a, true);
		Cannalisation sb = new Cannalisation ("SB", 25.0, 0.00, s, b, true);
		Cannalisation sc = new Cannalisation ("SC", 70.0, 0.00, s, c, true);
		
// Cannalisations Puits / Superpuits
		
		Cannalisation dp = new Cannalisation ("DP", 30.0, 0.00, d, p, true);
		Cannalisation ep = new Cannalisation ("EP", 10.0, 0.00, e, p, true);
		Cannalisation fp = new Cannalisation ("FP", 20.0, 0.00, f, p, true);
		Cannalisation gp = new Cannalisation ("GP", 30.0, 0.00, g, p, true);
		
		
//*************************LISTES CANNALISATIONS*********************************************************
		ArrayList<Cannalisation> sources = new ArrayList <Cannalisation>();
		ArrayList<Cannalisation> can = new ArrayList <Cannalisation>();
//		ArrayList<Cannalisation> 
		
		
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
		
		System.out.println(Graph.start(sources).getId());
		System.out.println(c.getFlag());
		Graph.flotMax(can, Graph.start(sources));
		System.out.println(p.getFlag());
		
	}

}
