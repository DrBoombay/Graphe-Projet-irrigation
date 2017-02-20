package projectGraphe;

import java.util.ArrayList;

public class Cannalisation {
	protected double capacity;
	protected String id;
	protected double flux;
	protected Sommet sommetEntree;
	protected Sommet sommetSortie;
	protected boolean flagCanna;


	
	
//***********************CREATION BUILDER*****************************//
	public Cannalisation(){

		capacity = 0.0;
		id = "inconnu";
		flux = 0.0;
		sommetEntree = null;
		sommetSortie = null;
		flagCanna = true;
		
	}

	public Cannalisation( String _id ,double _capacity, double _flux, Sommet _sommetEntree, Sommet _sommetSortie, boolean _flagCanna){
		id = _id;
		capacity = _capacity;
		flux = _flux;
		sommetEntree = _sommetEntree;
		sommetSortie = _sommetSortie;
		flagCanna = _flagCanna;
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
	
	public boolean getSens(){
		return this.flagCanna;
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
	
	public void setSens (boolean _flagCanna){
		this.flagCanna = _flagCanna;
	}
	
}
	
	

