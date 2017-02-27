package projectGraphe;

import java.util.ArrayList;

public class Graph {
	
//****************************************PARCOURS DU GRAPH ET RECUPERATION DU FLUX MAXIMUM***************************************************
	
		public static void flotMax(ArrayList<Canalisation> listeCanalisations, ArrayList<Canalisation> sources) {
			Canalisation flux = new Canalisation();
			flux.setCapacity(Double.MAX_VALUE);
			double temp;
			ArrayList<Canalisation> canaParcourues = new ArrayList<Canalisation>();
			ArrayList<Canalisation> canaInv = new ArrayList<Canalisation>();
			
			while (flux.getCapacity()>0 && flux.getFlag()==false) 
			{
				
				flux = start(sources);
				canaParcourues.add(flux);
				temp = grapheIntermediaire(listeCanalisations, flux, start(sources), canaParcourues);
				
				for (Canalisation cana : canaParcourues)
				System.out.println(cana);
				System.out.println();
				updateCapa(canaParcourues,temp);
				
				canaInv = getCanaInv(listeCanalisations, canaParcourues);
				
				updateFlux(canaInv, temp);
				
				for (Canalisation test : sources)
				canaParcourues.clear();				

				updateFlag(listeCanalisations);
				
				//for (Canalisation cana : listeCanalisations)
					//System.out.println(cana);
				
			}
		}
	
//******************************RECUPERATION DE LA SOURCE AVEC LA PLUS GRANDE CAPACITE RESTANTE**********************************************

	public static Canalisation start(ArrayList<Canalisation> sources) {
		Canalisation sourceMax = new Canalisation ();																																																													
		
		for (Canalisation source : sources )
		{
			if (source.getCapacity() > sourceMax.getCapacity() && source.getFlag()==false)
			{
				sourceMax = source;
			}
		}
		return sourceMax;
	}
	

//*********************************************REALISATION D'UN TOUR********************************************************************
		public static double grapheIntermediaire(ArrayList<Canalisation> listeCanalisations, Canalisation flux, Canalisation sourceMax, ArrayList<Canalisation> canaParcourues )
		{
			double capacity = Double.MAX_VALUE;
			Canalisation temp = new Canalisation(), canaInter = flux;
			while (canaInter.getSommetSortie().getName()!=("P"))
			{
				if (canaInter.getFlag()==true){
					capacity = 0.0;
					break;
				}
				
				canaInter = parcoursArray(listeCanalisations, flux, canaParcourues);
				
				if (canaInter.equals(sourceMax))
				{
					sourceMax.setFlag(true);
					capacity = 0.0;
					break;
				}
				
				else if (!canaInter.equals(temp))
					temp = canaInter;
				
				
				
				else if(canaInter.getSommetSortie().getName()!="P") 
				{
					canaInter = sourceMax;
					canaParcourues.get(canaParcourues.size()-1).setFlag(true);
					canaParcourues.clear();
				}
				
				if (canaInter.getSommetSortie().getName()=="P")
				{
					for (Canalisation cana : canaParcourues)
					if (capacity > cana.getCapacity())
					{
						capacity = cana.getCapacity();
						System.out.println(cana);
						System.out.println();
					}
				}
			}
			System.out.println(capacity);
			System.out.println();
			return capacity;
		}
//*********************************************PARCOURS DE LA LISTE DES CANALISATIONS *******************************************************************//
		
	public static Canalisation parcoursArray (ArrayList<Canalisation> listeCanalisations, Canalisation flux, ArrayList<Canalisation> canaParcourues )
	{
		Canalisation can = flux;
		for (Canalisation cana : listeCanalisations )
		{
			if (cana.getSommetSortie().getFlag() == false &&
					can.getSommetSortie().equals(cana.getSommetEntree()) 
					&& cana.getCapacity()>0)
			{
				can = cana;
				cana.getSommetSortie().setFlag(true);
				canaParcourues.add(cana);

			}
		}
		return can;
	}

//********************************************MISE A JOUR DES CAPACITES*************************************************************************
	
	public static void updateCapa(ArrayList<Canalisation> canaStock, double update)
	{
		for (Canalisation can : canaStock)
		{
			can.setCapacity(can.getCapacity()-update);
			can.setFlux(can.getFlux()+update);
		}
	}
	
//*******************************************MISE A JOUR DES FLUX******************************************************************************
	public static void updateFlux (ArrayList<Canalisation> canaInv, double update)
	{
		for (Canalisation can : canaInv)
		{
			can.setCapacity(can.getCapacity()+update);
			can.setFlux(can.getCapacity()-update);
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
