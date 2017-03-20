package projectGraphe;

import java.util.ArrayList;

import javax.swing.SwingUtilities;

import gui.LinesEx;


public class MainClass {

	public static void main(String[] args) {

	
 //Sources et Supersource
		
		Sommet s = new Sommet("S", 10, 40);
		Sommet a = new Sommet("A", 20, 60);
		Sommet b = new Sommet("B", 20, 40);
		Sommet c = new Sommet("C", 20, 20);
		
		//Sommet li = new Sommet("Li");
		
// Puits et Superpuits 
		
		Sommet d = new Sommet("D", 30, 70);
		Sommet e = new Sommet("E", 30, 50);
		Sommet f = new Sommet("F", 30, 30);
		Sommet g = new Sommet("G", 30, 10);	
		Sommet p = new Sommet("P", 40, 40);
		
		/*Sommet pa = new Sommet ("Pa");
		Sommet ro = new Sommet ("Ro");
		Sommet ca = new Sommet ("Ca");
		Sommet ry = new Sommet ("Ry");
		Sommet sa = new Sommet ("Sa");*/
		
// Cannalisations Sources / Puits
		
		Canalisation ad = new Canalisation ("AD", 10.0, 0.00, a, d);
		Canalisation ae = new Canalisation ("AE", 15.0, 0.00, a, e);
		Canalisation ag = new Canalisation ("AG", 20.0, 0.00, a, g);
		Canalisation bd = new Canalisation ("BD", 20.0, 0.00, b, d);
		Canalisation be = new Canalisation ("BE", 05.0, 0.00, b, e);
		Canalisation bf = new Canalisation ("BF", 15.0, 0.00, b, f);
		Canalisation cf = new Canalisation ("CF", 10.0, 0.00, c, f);
		Canalisation cg = new Canalisation ("CG", 10.0, 0.00, c, g);
		
		Canalisation da = new Canalisation ("AD", 0.00, 15.00, d, a);
		Canalisation ea = new Canalisation ("AE", 0.00, 15.00, e, a);
		Canalisation ga = new Canalisation ("AG", 0.00, 20.00, g, a);
		Canalisation db = new Canalisation ("BD", 0.00, 20.00, d, b);
		Canalisation eb = new Canalisation ("BE", 0.00, 05.00, e, b);
		Canalisation fb = new Canalisation ("BF", 0.00, 15.00, f, b);
		Canalisation fc = new Canalisation ("CF", 0.00, 10.00, f, c);
		Canalisation gc = new Canalisation ("CG", 0.00, 10.00, g, c);
		
		/*Canalisation lp = new Canalisation ("LiP", 15.0, 0.00, li, pa);
		Canalisation lr = new Canalisation ("LiR", 22.0, 0.00, li, ro);
		Canalisation lc = new Canalisation ("LiC", 30.0, 0.00, li, ca);
		Canalisation paro = new Canalisation ("PaRo", 30.0, 0.00, pa, ro);
		Canalisation pary = new Canalisation ("PaRy", 12.0, 0.00, pa, ry);
		Canalisation roc = new Canalisation ("RoC", 20.0, 0.00, ro, ca);
		Canalisation rory = new Canalisation ("RoRy", 10.0, 0.00, ro, ry);
		Canalisation rosa = new Canalisation ("RoSa", 10.0, 0.00, ro, sa);
		Canalisation cary = new Canalisation ("CaRy", 10.0, 0.00, ca, ry);
		Canalisation casa = new Canalisation ("CaSa", 10.0, 0.00, ca, sa);
		Canalisation rysa = new Canalisation ("RySa", 40.0, 0.00, ry, sa);
		
		Canalisation pl = new Canalisation ("LiP", 0.00, 15.0, pa, li);
		Canalisation rl = new Canalisation ("LiR", 0.00, 22.00, ro, li);
		Canalisation cl = new Canalisation ("LiC", 0.00, 30.0, ca, li);
		Canalisation ropa = new Canalisation ("PaRo", 0.00, 30.0, ro, pa);
		Canalisation rypa = new Canalisation ("PaRy", 0.00, 12.00, ry, pa);
		Canalisation cor = new Canalisation ("RoC", 0.00, 20.0, ca, ro);
		Canalisation ryro = new Canalisation ("RoRy", 0.00, 10.00, ry, ro);
		//Canalisation saro = new Canalisation ("RoSa", 0.00, 10.0, sa, ro);
		Canalisation ryca = new Canalisation ("CaRy", 0.00, 10.0, ry, ca);
		//Canalisation saca = new Canalisation ("CaSa", 0.00, 10.0, sa, ca);
		//Canalisation sary = new Canalisation ("RySa", 0.00, 40.0, sa, ry);*/
		
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
		ArrayList<Sommet> sommets = new ArrayList<Sommet>();
		
//***************************AJOUT DES SOURCES**********************************************************
		sommets.add(s);
		sommets.add(a);
		sommets.add(b);
		sommets.add(c);
		sommets.add(d);
		sommets.add(e);
		sommets.add(f);
		sommets.add(g);
		sommets.add(p);

		
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
		
		/*can.add(paro);
		can.add(pary);
		can.add(roc);
		can.add(rory);
		can.add(rosa);
		can.add(cary);
		can.add(casa);
		can.add(rysa);
		can.add(ropa);
		can.add(rypa);
		can.add(cor);
		can.add(ryro);
		can.add(ryca);*/
		
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
		
		can.clear();
		can.add(ad);
		can.add(ae);
		can.add(ag);
		can.add(bd);
		can.add(be);
		can.add(bf);
		can.add(cf);
		can.add(cg);
		can.add(dp);
		can.add(ep);
		can.add(fp);
		can.add(gp);
		
		for (Canalisation cana : sources)
			can.add(cana);
		
		System.out.println("Résultat : ");
		for (Canalisation cana : sources)
			System.out.println(cana);
		
		System.out.println();
		
		for (Canalisation cana : can)
			System.out.println(cana);
		
        SwingUtilities.invokeLater(() -> {
            LinesEx ex = new LinesEx(can, sommets);
            ex.setVisible(true);
        });
    }
}
