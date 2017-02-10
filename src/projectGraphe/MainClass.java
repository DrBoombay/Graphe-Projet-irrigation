package projectGraphe;

public class MainClass {

	public static void main(String[] args) {
		Source S1 = new Source("S1", "Lac", 250.15, 600.02);
		Parcelle P1 = new Parcelle("P1", 250.15, 900);
	
//*************************TEST*******************************************
		System.out.print("La source "+S1.getIdSource()+" est de type "+S1.getTypeSource()+". Son débit actuelle en sortie est de ");
		System.out.println(S1.getDebitSource()+" et est alimentée par un débit de "+S1.getwaterIn()+".");
		System.out.print("La parcelle "+P1.getIdParcelle()+" a un besoin en eau de "+P1.getBesoinEau()+".");
		System.out.println(" Sa surface est de "+P1.getSurfaceParcelle()+".");

	}

}
