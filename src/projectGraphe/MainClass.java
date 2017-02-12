package projectGraphe;

public class MainClass {

	public static void main(String[] args) {
		Sommet S = new Sommet("S");
		Sommet A = new Sommet ("A");
		Sommet B = new Sommet("B");
		Source C = new Source("C", "Village 3", 20.0, 600.02);
		Parcelle D = new Parcelle("D", 30.0, 900);
		Parcelle E = new Parcelle("E", 10.0, 900);
		Parcelle F = new Parcelle("F", 20.0, 900);
		Parcelle G = new Parcelle("G", 30.0, 900);

		Parcelle P = new Parcelle("P", 0.0, 0.0);
		Cannalisation C1 = new Cannalisation ("AD", 30.0, 12.13, 0.00, A, D);
		Cannalisation C2 = new Cannalisation ("AE", 15.0, 12.13, 0.00);
		Cannalisation C3 = new Cannalisation ("AG", 20.0, 12.13, 0.00);
		Cannalisation C4 = new Cannalisation ("BD", 20.0, 12.13, 0.00);
		Cannalisation C5 = new Cannalisation ("BE", 05.0, 12.13, 0.00);
		Cannalisation C6 = new Cannalisation ("BF", 15.0, 12.13, 0.00);
		Cannalisation C7 = new Cannalisation ("CF", 10.0, 12.13, 0.00);
		Cannalisation C8 = new Cannalisation ("CG", 10.0, 12.13, 0.00);
		
		Cannalisation SA = new Cannalisation ("SA", 45.0, 12.13, 0.00, S, A);
		Cannalisation SB = new Cannalisation ("SB", 25.0, 12.13, 0.00);
		Cannalisation SC = new Cannalisation ("SC", 20.0, 12.13, 0.00);
		Cannalisation DP = new Cannalisation ("DP", 30.0, 12.13, 0.00);
		Cannalisation EP = new Cannalisation ("EP", 10.0, 12.13, 0.00);
		Cannalisation FP = new Cannalisation ("FP", 20.0, 12.13, 0.00);
		Cannalisation GP = new Cannalisation ("GP", 30.0, 12.13, 0.00);
		VERGE
		
//*************************TEST*******************************************


		
	}

}
