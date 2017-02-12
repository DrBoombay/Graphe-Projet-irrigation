package projectGraphe;

import java.util.ArrayList;

public class Cannalisation {
	protected double capacity;
	protected double length;
	protected String id;
	protected double flux;
	protected int order;
	
	
	//***********************CREATION CONSTRUCTEUR*****************************//
	public Cannalisation(){
		capacity =0.0;
		//length =0.0;
		id="incoonu";
		flux=0.0;
		order =0;
		
	}
	public Cannalisation( String _id ,double _capacity, double _length, double _flux,int _order){
		
		id=_id;
		capacity=_capacity;
		flux=_flux;
		order=_order;
	}
	
	/*****************G U E T T E R S *********************/
	public int getOrder() {
		return this.order;
	}
	public String getId(){
		return this.id;
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
	
	public void setId(String id){
		this.id=id;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	
	/************************ Tableaux Capacité ************************/
	
	
	ArrayList<Cannalisation> canaSortedByOrder=new ArrayList<Cannalisation>();
	
}
