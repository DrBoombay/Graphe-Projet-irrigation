package src.projectGraph;

import java.util.ArrayList;

public class Canalisation {
	protected double capacity;
	protected String id;
	protected double flux;
	protected Sommet sommetEntree;
	protected Sommet sommetSortie;
	protected boolean flagCanna;


	
	
//***********************CREATION BUILDER*****************************//
	public Canalisation(){

		capacity = 0.0;
		id = "inconnu";
		flux = 0.0;
		sommetEntree = null;
		sommetSortie = null;
		flagCanna = false;
		
	}

	public Canalisation( String _id ,double _capacity, double _flux, Sommet _sommetEntree, Sommet _sommetSortie){
		id = _id;
		capacity = _capacity;
		flux = _flux;
		sommetEntree = _sommetEntree;
		sommetSortie = _sommetSortie;
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
	
	public boolean getFlag(){
		return this.flagCanna;
	}
	
	//********************* S E T T E R S ****************************/
	
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
	
	public void setFlag (boolean _flagCanna){
		this.flagCanna = _flagCanna;
	}
	
	public String toString()
	{
		return this.id+" de capacite : "+this.capacity+". Flux : "+this.flux+".";
	}
	
}
	
	

