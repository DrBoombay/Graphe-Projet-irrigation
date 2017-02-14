package projectGraphe;

import java.util.ArrayList;

public class Cannalisation {
	protected double capacity;
	protected String id;
	protected double flux;
	protected Sommet sommetEntree;
	protected Sommet sommetSortie;


	
	
//***********************CREATION BUILDER*****************************//
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
	
	public void setFlux(double _flux){
		this.flux = _flux;
	}		

	public void setCapacity(double _capacity){
		this.capacity = _capacity;
	}

	public void setId(String _id){
		this.id = _id;
	}
	
	public void setSommetEnt(Sommet _sommetEntree){
		this.sommetEntree = _sommetEntree;
	}
	
	public void setSommetSort(Sommet _sommetSortie){
		this.sommetSortie = _sommetSortie;
	}
	
}
	
	

