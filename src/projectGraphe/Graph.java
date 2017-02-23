package projectGraphe;

import java.util.ArrayList;

public class Graph {
	
//******************************RECUPERATION DE LA SOURCE AVEC LA PLUS GRANDE CAPACITE RESTANTE**********************************************

	
	public static Cannalisation start(ArrayList<Cannalisation> sources) {
		Cannalisation sourceMax = new Cannalisation ();																																																													
		
		for (Cannalisation source : sources )
		{
			if (source.getCapacity() > sourceMax.getCapacity() && !source.flagCanna)
			{
				sourceMax = source;
			}
		}
		sourceMax.getSommetSortie().setFlag(true);
		return sourceMax;
	}
	
//****************************************PARCOURS DU GRAPH ET RECUPERATION DU FLUX MAXIMUM***************************************************
	
	public static void flotMax(ArrayList<Cannalisation> listeCannas, Cannalisation sourceMax) {
		Cannalisation flux = sourceMax;
		Cannalisation temp = new Cannalisation();
		double capacity = Double.MAX_VALUE;
		ArrayList<Cannalisation> cannaParcourues = new ArrayList<Cannalisation>();
		cannaParcourues.add(flux);
		
		while (flux.getCapacity()>0) 
			{
			while (!flux.getSommetSortie().getName().equals("P"))
			{
				if (flux.getFlag())
					break;
	//*********************************************PARCOURS DU TABLEAU***********************************************************************
				for (Cannalisation source : listeCannas )
				{
					if (source.getSommetSortie().getFlag() == false &&
							flux.getSommetSortie().equals(source.getSommetEntree()) 
							&& source.getCapacity()>0)
					{
						flux = source;
						source.getSommetSortie().setFlag(true);
						cannaParcourues.add(source);
						System.out.println(source.getId());
						
						if (capacity > flux.getCapacity())
						{
							capacity = flux.getCapacity();
						}
					}
				}
				
				if (flux.equals(sourceMax))
				{
					sourceMax.setFlag(true);
					break;
				}
	//*********************************************TEST DU PARCOURS DE L'ARRAYLIST**********************************************************			
				else if (!flux.equals(temp))
					temp = flux;
				
				else if(flux.getSommetSortie().getName()!="P") {
					flux = sourceMax;
					cannaParcourues.get(cannaParcourues.size()-1).setFlag(true);
					cannaParcourues.clear();
					}
			}
			
			
			flux.setCapacity(capacity);
			updateCapa(cannaParcourues,flux);
			cannaParcourues.clear();
			//****************METHODE POUR RESET LES FLAG DES CANNA / SOMMETS***************
			for (Cannalisation source : listeCannas )
			{
				source.setFlag(false);
				source.getSommetSortie().setFlag(false);
			}
			
		}
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