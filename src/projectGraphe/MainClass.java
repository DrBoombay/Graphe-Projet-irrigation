package projectGraphe;

public class MainClass {

	public static void main(String[] args) {
		Source S1 = new Source ("S1", "Lac", 250.15, 600.02);
		
//*************************TEST*******************************************
		System.out.print("La source "+S1.getIdSource()+" est de type "+S1.getTypeSource()+". Son d�bit actuelle en sortie est de ");
		System.out.print(S1.getDebitSource()+" et est aliment�e par un d�bit de "+S1.getwaterIn()+".");
	}

}
