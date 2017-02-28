package projectGraphe;

import java.util.ArrayList;

public class Graph {
	
//****************************************PARCOURS DU GRAPH ET RECUPERATION DU FLUX MAXIMUM***************************************************
	
		public static void flotMax(ArrayList<Canalisation> listeCanalisations, ArrayList<Canalisation> sources) {
			Canalisation source = new Canalisation();
			source.setCapacity(Double.MAX_VALUE);
			double temp;
			ArrayList<Canalisation> canaParcourues = new ArrayList<Canalisation>();
			ArrayList<Canalisation> canaInv = new ArrayList<Canalisation>();
			int i = 0;
			
			
			while (source.getCapacity()>0 && source.getFlag()==false) 
			{
				source = start(sources);
				System.out.println("Nouveau tour !");
				System.out.println();
				
				System.out.println("Canalisation de départ choisie : "+source);
				System.out.println();
				//canaParcourues.add(source);
				temp = grapheIntermediaire(listeCanalisations, source, canaParcourues);
				
				System.out.println();
				
				System.out.println("Liste des canalisations parcourues : ");
				for (Canalisation cana : canaParcourues)
				{
					System.out.println(cana);
				}
				System.out.println();
				
				System.out.println("Mise à jour des capacités : ");
				
			
				updateCapa(canaParcourues,temp);
				//System.out.println(source);
				for (Canalisation cana : canaParcourues)
				{
					System.out.println(cana);
				}
				System.out.println();
				
				System.out.println("Mise à jour des canalisations inverses : ");
				canaInv = getCanaInv(listeCanalisations, canaParcourues);

				updateFlux(canaInv, temp);
				
				for (Canalisation cana : canaInv)
				{
					System.out.println(cana);
					System.out.println();
				}
				System.out.println();
				
				canaParcourues.clear();
				canaInv.clear();

				updateFlag(listeCanalisations);
				//updateFlag(sources);
				
				//for (Canalisation cana : listeCanalisations)
					//System.out.println(cana);

				i++;
				System.out.println("Tour " +i+" terminé ! ");
				System.out.println();
				source = start(sources);
				System.out.println(sources);

			}
			
			System.out.println();
			System.out.println("FIN.");
		}
	
//******************************RECUPERATION DE LA SOURCE AVEC LA PLUS GRANDE CAPACITE RESTANTE**********************************************

	public static Canalisation start(ArrayList<Canalisation> sources) {
		Canalisation sourceMax = new Canalisation ();
		sourceMax.setFlag(true);
		
		for (Canalisation source : sources )
		{
			if (source.getCapacity() > sourceMax.getCapacity() && source.getFlag()==false)
			{
				sourceMax = source;
			}
		}
		
		System.out.println("Source choisie ! "+sourceMax.getId());

		return sourceMax;
	}
	

//*********************************************REALISATION D'UN TOUR********************************************************************
		public static double grapheIntermediaire(ArrayList<Canalisation> listeCanalisations, Canalisation flux, ArrayList<Canalisation> canaParcourues )
		{
			double capacity = Double.MAX_VALUE;
			int i = 0;
			Canalisation temp = new Canalisation(), canaInter = flux, sourceMax = flux;
			while (canaInter.getSommetSortie().getName()!=("P"))
			{
				System.out.println("La capacité intermédiaire est "+canaInter);
				i++;
				System.out.println("Recherche du parcours du graph n° "+i);
				if (canaInter.getFlag()==true){
					capacity = 0.0;
					break;
				}
				canaInter = parcoursArray(listeCanalisations, canaInter, canaParcourues);
				
				if (canaInter.equals(sourceMax))
				{
					sourceMax.setFlag(true);
					capacity = 0.0;
					System.out.println("Source Flag !");
					System.out.println();
					break;
				}
				
				else if (!canaInter.equals(temp))
					temp = canaInter;
				
				
				
				else if(canaInter.getSommetSortie().getName()!="P") 
				{
					canaInter = sourceMax;
					canaParcourues.get(canaParcourues.size()-1).setFlag(true);
					System.out.println("Canalisation flag : "+canaParcourues.get(canaParcourues.size()-1));
					updateFlagSommets(canaParcourues);
					
					for (Canalisation cana : canaParcourues)
						System.out.println(cana);
					
					canaParcourues.clear();
					System.out.println("CLEAR CANA PACOURUES");
					for (Canalisation cana : canaParcourues)
						System.out.println(cana);
					System.out.println("Nouveau départ : "+canaInter);
					System.out.println();

				}
				
				if (canaInter.getSommetSortie().getName()=="P")
				{
					System.out.println("Chemin trouvé ! ");
					for (Canalisation cana : canaParcourues)
					{
						if (capacity > cana.getCapacity())
						{
							capacity = cana.getCapacity();
							System.out.println("Nouvelle cana de référence choisie pour la capacité ");
							System.out.println(cana);

						}

					}
					System.out.println();

				}
			}
		//	System.out.println(capacity);
			//System.out.println();
			return capacity;
		}
//*********************************************PARCOURS DE LA LISTE DES CANALISATIONS *******************************************************************//
		
	public static Canalisation parcoursArray (ArrayList<Canalisation> listeCanalisations, Canalisation flux, ArrayList<Canalisation> canaParcourues )
	{
		Canalisation can = flux;
		if (!canaParcourues.contains(can))
		canaParcourues.add(flux);
		can.getSommetSortie().setFlag(true);
		
		for (Canalisation cana : listeCanalisations )
		{
			if (cana.getSommetSortie().getFlag() == false && cana.getFlag() == false &&
					can.getSommetSortie().equals(cana.getSommetEntree()) 
					&& cana.getCapacity()>0)
			{
				can = cana;
				cana.getSommetSortie().setFlag(true);
				canaParcourues.add(cana);

			}
		}
		
		//System.out.println(can);
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
			can.setFlux(can.getFlux()-update);
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
	
	
//************************************************RESET DES FLAG DES SOMMMETS*************************************************************************
	
		public static void updateFlagSommets(ArrayList<Canalisation> listeCanalisations)
		{
			for (Canalisation source : listeCanalisations )
			{
				source.getSommetEntree().setFlag(false);
				source.getSommetSortie().setFlag(false);
			}
		}
}
