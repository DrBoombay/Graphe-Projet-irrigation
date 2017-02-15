package projectGraphe;

import java.util.ArrayList;

public class Graph {
	
	public static boolean resteCapa(Cannalisation c)
	{
		
		return c.getCapacity() > 0;
	}
	
	
//******************************RECUPERATION DE LA SOURCE AVEC LA PLUS GRANDE CAPACITE RESTANTE**********************************************

	
	public static Cannalisation start(ArrayList<Cannalisation> sources) {
		Cannalisation sourceMax = new Cannalisation ();																																																													
		
		for (Cannalisation source : sources )
		{
			if (source.getCapacity() > sourceMax.getCapacity())
			{
				sourceMax = source;
			}
		}
		sourceMax.getSommetSortie().setFlag(true);
		return sourceMax;
	}
	
//****************************************PARCOURS DU GRAPH ET RECUPERATION DU FLUX MAXIMUM***************************************************
	
	public static Cannalisation flotMax(ArrayList<Cannalisation> canna, Cannalisation sourceMax) {
		Cannalisation flux = sourceMax;
		double capacity = Double.MAX_VALUE;
		
		for (Cannalisation source : canna )
		{
			if (source.getSommetSortie().getFlag() == false &&
					flux.getSommetSortie().equals(source.getSommetEntree()) 
					&& resteCapa(source) == true)
			{
				flux = source;
				source.getSommetSortie().setFlag(true);
				System.out.println(flux.getId());
				
				if (capacity > flux.getCapacity())
				{
					capacity = flux.getCapacity();
				}
			}
		}
		flux.setCapacity(capacity);
		return flux;
	}
	

}
