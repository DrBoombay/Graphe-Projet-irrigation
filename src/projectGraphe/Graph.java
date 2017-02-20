package projectGraphe;

import java.util.ArrayList;

public class Graph {
	
	public static boolean resteCapa(Cannalisation c)
	{
		
		return c.getCapacity() > 0;
	}
	
	public static boolean restCapaBack(Cannalisation b){
		
		return b.getFlux() >0;
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
	
	public static Cannalisation flotMax(ArrayList<Cannalisation> listeCannas, Cannalisation sourceMax) {
		Cannalisation flux = sourceMax;
		Cannalisation temp = new Cannalisation();
		double capacity = Double.MAX_VALUE;
		ArrayList<Cannalisation> cannaParcourues = new ArrayList<Cannalisation>();
		cannaParcourues.add(flux);
		
		while (flux.getSommetSortie().getName().equals("P"))
		{
//*********************************************PARCOURS DU TABLEAU***********************************************************************
			for (Cannalisation source : listeCannas )
			{
				if (source.getSommetSortie().getFlag() == false &&
						flux.getSommetSortie().equals(source.getSommetEntree()) 
						&& resteCapa(source) == true)
				{
					flux = source;
					source.getSommetSortie().setFlag(true);
					cannaParcourues.add(source);
					
					if (capacity > flux.getCapacity())
					{
						capacity = flux.getCapacity();
					}
				}
			}
			
//*********************************************TEST DU PARCOURS DE L'ARRAYLIST**********************************************************			
			if (!flux.equals(temp) && !flux.equals(sourceMax))
				temp = flux;
			
			else
				cannaParcourues.get(cannaParcourues.size()-1).setFlag(true);
				break;
		}
		
		
		flux.setCapacity(capacity);
		return flux;
	}
	
//**
	
//**********************************************************************************************************************************************//
//*********************************************PARCOURS DU GRAPHE A L'ENVERS *******************************************************************//
//**********************************************************************************************************************************************//
	
	/*public static Cannalisation backFlux(ArrayList<Cannalisation> canna, Cannalisation can){
		
		Cannalisation backFlux = can;
		double back= Double.MAX_VALUE;
		
		for(Cannalisation flux : canna){
			if(can.getSommetSortie().getFlag() ==false &&
					can.getSommetSortie().getFlag()==false &&
					backFlux.getSommetSortie().equals(flux.getSommetSortie())&&
					restCapaBack(can)==true){
				
				backFlux=flux;
				can.getSommetEntree().setFlag(true);
				System.out.println(backFlux.getId());
				
				if(back > backFlux.getFlux()){
					back = backFlux.getFlux();
					
				}
				
			}
		}
		backFlux.setFlux(back);
		return backFlux; 
	}*/
	
	
//********************************************MISE A JOUR DES CAPACITES*************************************************************************
	
	public static void updateCapa(ArrayList<Cannalisation> cannaStock, Cannalisation update){
		
		for (Cannalisation can : cannaStock)
		{
			can.setCapacity(can.getCapacity()-update.getCapacity());
		}
	}
	
}

