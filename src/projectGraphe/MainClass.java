package projectGraphe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		Cannalisation ad = new Cannalisation ("AD", 30.0, 0.00, a, d);
		Cannalisation ae = new Cannalisation ("AE", 15.0, 0.00, a, e);
		Cannalisation ag = new Cannalisation ("AG", 20.0, 0.00, a, g);
		Cannalisation bd = new Cannalisation ("BD", 20.0, 0.00, b, d);
		Cannalisation be = new Cannalisation ("BE", 05.0, 0.00, b, e);
		Cannalisation bf = new Cannalisation ("BF", 15.0, 0.00, b, f);
		Cannalisation cf = new Cannalisation ("CF", 0.0, 0.00, c, f);
		Cannalisation cg = new Cannalisation ("CG", 10.0, 0.00, c, g);
		
// Cannalisations Supersource / Sources
		
		Cannalisation sa = new Cannalisation ("SA", 45.0, 0.00, s, a);
		Cannalisation sb = new Cannalisation ("SB", 25.0, 0.00, s, b);
		Cannalisation sc = new Cannalisation ("SC", 70.0, 0.00, s, c);
		
// Cannalisations Puits / Superpuits
		
		Cannalisation dp = new Cannalisation ("DP", 30.0, 0.00, d, p);
		Cannalisation ep = new Cannalisation ("EP", 10.0, 0.00, e, p);
		Cannalisation fp = new Cannalisation ("FP", 20.0, 0.00, f, p);
		Cannalisation gp = new Cannalisation ("GP", 30.0, 0.00, g, p);

		
//*************************TEST*******************************************
		ArrayList<Cannalisation> sources = new ArrayList <Cannalisation>();
		ArrayList<Cannalisation> can = new ArrayList <Cannalisation>();
		
		sources.add(sa);
		sources.add(sb);
		sources.add(sc);
		
		can.add(ad);
		can.add(ae);
		can.add(bd);
		can.add(be);
		can.add(bf);
		can.add(cf);
		can.add(cg);
		can.add(dp);
		can.add(ep);
		can.add(fp);
		can.add(gp);

		System.out.println(Graph.start(sources).getId());
		System.out.println(c.getFlag());
		Graph.flotMax(can, Graph.start(sources));
		System.out.println(p.getFlag());
		
	}

}
