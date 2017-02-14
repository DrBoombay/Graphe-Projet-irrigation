package projectGraphe;

import java.util.List;

public class Graph {
	
	public boolean resteDebit(Cannalisation C)
	{
		
		return C.getCapacity() > 0;
	}
	
	public double compare (double capacite, double flux)
	{
		double fluxR = flux;
		
		if (fluxR > capacite)
			fluxR = capacite;
		
		return fluxR;
	}
	
//******************************RECUPERATION DE LA SOURCE AVEC LA PLUS GRANDE CAPACITE RESTANTE**********************************************

	
	public static Cannalisation start(List<Cannalisation> sources) {
		Cannalisation sourceMax = new Cannalisation ();
		
		for (Cannalisation source : sources )
		{
			if (source.getCapacity() > sourceMax.getCapacity())
			{
				sourceMax = source;
			}
		}
		return sourceMax;
	}
	
//****************************************PARCOURS DU GRAPH ET RECUPERATION DU FLUX MAXIMUM***************************************************
	
	/*public static Cannalisation flotMax(List<Cannalisation> sources) {
		Cannalisation sourceMax = new Cannalisation ();
		
		for (Cannalisation source : sources )
		{
			if (source.getCapacity() > sourceMax.getCapacity())
			{
				sourceMax = source;
			}
		}
		return sourceMax;
	}*/
	

}
