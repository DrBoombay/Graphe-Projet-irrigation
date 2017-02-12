package projectGraphe;

import java.util.ArrayList;

public class Cannalisation {
	protected double capacity;
	protected String id;
	protected double flux;
	protected Sommet sommetEntree;
	protected Sommet sommetSortie;


	
	
	//***********************CREATION CONSTRUCTEUR*****************************//
	public Cannalisation(){

		capacity = 0.0;
		id = "inconnu";
		flux = 0.0;
		sommetEntree = null;
		sommetSortie = null;
		
	}
	
	public Cannalisation( String idP ,double capacityP, double fluxP, Sommet sommetEntreeP, Sommet sommetSortieP){
		id = idP;
		capacity = capacityP;
		flux = fluxP;
		sommetEntree = sommetEntreeP;
		sommetSortie = sommetSortieP;
	}

//************************************G E T T E R S **************************************
	public String getId(){
		return this.id;
	}
	
	public Sommet getSommetEntree(){
		return this.sommetEntree;
	}
	
	public Sommet getSommetSortie(){
		return this.sommetSortie;
	}
	
	public double getCapacity(){
		return this.capacity;
	}
	
	public double getFlux(){
		return this.flux;
	}
	
	/********************* S E T T E R S ****************************/
	
	public void setFlux(double flux){
		this.flux=flux;
	}		

	public void setNom(double capacity){
		this.capacity=capacity;
	}
	
	public void setCapacity(double capacity){
		this.capacity = capacity;
	}

	public void setId(String _id){
		this.id = _id;
	}
	
	
	/************************ Tableaux Capacité ************************/
	
	
	ArrayList<Cannalisation> canaSortedByOrder=new ArrayList<Cannalisation>();
	
}
