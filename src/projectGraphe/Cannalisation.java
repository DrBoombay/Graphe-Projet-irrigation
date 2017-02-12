package projectGraphe;

public class Cannalisation {
	protected double capacity;
	protected double length;
	protected String id;
	protected double flux;
	protected Sommet sommetEntree;
	protected Sommet sommetSortie;
	
	
	//***********************CREATION CONSTRUCTEUR*****************************//
	public Cannalisation(){
		capacity = 0.0;
		length = 0.0;
		id = "incoonu";
		flux = 0.0;
		sommetEntree = null;
		sommetSortie = null;
		
	}
	
	public Cannalisation( String idP ,double capacityP, double lengthP, double fluxP, Sommet sommetEntreeP, Sommet sommetSortieP){
		id = idP;
		capacity = capacityP;
		length = lengthP;
		flux = fluxP;
		sommetEntree = sommetEntreeP;
		sommetSortie = sommetSortieP;

	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public double getCapacity(){
		return this.capacity;
	}
	
	public void setNom(double capacity){
		this.capacity = capacity;
	}
	
	
	public double getLength(){
		return this.length;
	}
	
	public void setLength(double length){
		this.length = length;
	}

	public double getFlux(){
		return this.flux;
	}
	
	public void setFlux(double flux){
		this.flux = flux;
	}

}
