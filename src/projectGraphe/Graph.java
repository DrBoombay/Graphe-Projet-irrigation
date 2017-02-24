package projectGraphe;

import java.util.ArrayList;

public class Graph {
	
//******************************RECUPERATION DE LA SOURCE AVEC LA PLUS GRANDE CAPACITE RESTANTE**********************************************

	
	public static Canalisation start(ArrayList<Canalisation> sources) {
		Canalisation sourceMax = new Canalisation ();																																																													
		
		for (Canalisation source : sources )
		{
			if (source.getCapacity() > sourceMax.getCapacity() && !source.getFlag())
			{
				sourceMax = source;
			}
		}
		//sourceMax.getSommetSortie().setFlag(true);
		return sourceMax;
	}
	
//****************************************PARCOURS DU GRAPH ET RECUPERATION DU FLUX MAXIMUM***************************************************
	
	public static void flotMax(ArrayList<Canalisation> listeCanalisations, ArrayList<Canalisation> sources) {
		Canalisation flux = new Canalisation();
		flux.setCapacity(Double.MAX_VALUE);
		Canalisation temp = new Canalisation();
		//double capacity = Double.MAX_VALUE;
		ArrayList<Canalisation> canaParcourues = new ArrayList<Canalisation>();
		ArrayList<Canalisation> canaInv = new ArrayList<Canalisation>();
		//canaParcourues.add(flux);
		
		//while (flux.getCapacity()>0) 
		//	{
			
			flux = start(sources);
			//System.out.println(flux);
			canaParcourues.add(flux);
			temp = grapheIntermediaire(listeCanalisations, flux, start(sources), canaParcourues);
			//System.out.println(temp);
			//System.out.println();
			
			//for (Canalisation test : canaParcourues)
				//System.out.println(test);
			updateCapa(canaParcourues,temp);
			//System.out.println();
			
			//for (Canalisation test : canaParcourues)
				//System.out.println(test);
			//System.out.println();
			
			canaInv = getCanaInv(listeCanalisations, canaParcourues);
			//for (Canalisation test : canaInv)
				//System.out.println(test);
			//System.out.println();
			
			//System.out.println(temp);
			
			updateFlux(canaInv, temp);
			//for (Canalisation test : canaInv)
				//System.out.println(test);
			//System.out.println();
			
			/*for (Canalisation test : sources)
				System.out.println(test);
			canaParcourues.clear();
			System.out.println();
			
			for (Canalisation test : canaParcourues)
				System.out.println(test);
			System.out.println();
			
			//System.out.println(flux);
			updateFlag(listeCanalisations);
			//System.out.println(flux);*/
			
		//}
	}
	
//**
	
//**********************************************************************************************************************************************//
//*********************************************PARCOURS DE LA LISTE DES CANALISATIONS *******************************************************************//
//**********************************************************************************************************************************************//
	public static Canalisation parcoursArray (ArrayList<Canalisation> listeCanalisations, Canalisation flux, ArrayList<Canalisation> canaParcourues )
	{
		//double capacity = Double.MAX_VALUE;
		for (Canalisation source : listeCanalisations )
		{
			if (source.getSommetSortie().getFlag() == false &&
					flux.getSommetSortie().equals(source.getSommetEntree()) 
					&& source.getCapacity()>0)
			{
				flux = source;
				source.getSommetSortie().setFlag(true);
				canaParcourues.add(source);
				//System.out.println(flux);
				//System.out.println(source.getId());
				
				/*if (capacity > flux.getCapacity())
				{
					capacity = flux.getCapacity();
				}*/
			}
		}
		return flux;
	}

//*********************************************REALISATION D'UN TOUR********************************************************************
	public static Canalisation grapheIntermediaire(ArrayList<Canalisation> listeCanalisations, Canalisation flux, Canalisation sourceMax, ArrayList<Canalisation> canaParcourues )
	{
		int compt=0;
		Canalisation temp = new Canalisation();
		while (!flux.getSommetSortie().getName().equals("P"))
		{
			compt ++;
			//System.out.println(compt);
			if (flux.getFlag())
				break;
			
			flux = parcoursArray(listeCanalisations, flux, canaParcourues);
			//System.out.println(flux);
			if (flux.equals(sourceMax))
			{
				sourceMax.setFlag(true);
				break;
			}
			
			else if (!flux.equals(temp))
				temp = flux;
			
			else if(!flux.getSommetSortie().equals("P")) 
			{
				flux = sourceMax;
				canaParcourues.get(canaParcourues.size()-1).setFlag(true);
				canaParcourues.clear();
			}
		}
		//System.out.println(flux);
		//System.out.println(sourceMax);
		return flux;
	}
	
//********************************************MISE A JOUR DES CAPACITES*************************************************************************
	
	public static void updateCapa(ArrayList<Canalisation> canaStock, Canalisation update)
	{
		double temp = update.getCapacity();
		for (Canalisation can : canaStock)
		{
			can.setCapacity(can.getCapacity()-temp);
			can.setFlux(can.getFlux()+temp);
		}
	}
	
//*******************************************MISE A JOUR DES FLUX******************************************************************************
	public static void updateFlux (ArrayList<Canalisation> canaInv, Canalisation update)
	{
		double temp = update.getFlux();
		for (Canalisation can : canaInv)
		{
			can.setCapacity(can.getCapacity()+temp);
			can.setFlux(can.getCapacity()-temp);
		}
	}
//************************************************RESET DES FLAG*************************************************************************
	
	public static void updateFlag(ArrayList<Canalisation> listeCanalisations)
	{
		for (Canalisation source : listeCanalisations )
		{
			source.setFlag(false);
			source.getSommetSortie().setFlag(false);
		}
	}
	
//********************************************RECUPERATION DES CANALISATIONS CONTRAIRES*******************************************************
	public static ArrayList<Canalisation> getCanaInv(ArrayList<Canalisation> listeCana, ArrayList<Canalisation> canaParcourues)
	{
		ArrayList<Canalisation> canaInv = new ArrayList<Canalisation>();
		
		for (Canalisation cana : canaParcourues)
		{
			for (Canalisation cana1 : listeCana)
			if (cana.getId().equals(cana1.getId()) && !cana.getSommetEntree().equals(cana1.getSommetEntree())) 
				canaInv.add(cana1);
		}
		
		return canaInv;
	}
}
