package projectGraphe;

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
	public Cannalisation( String id ,double capacity, double length, double flux,int order){
		
		this.id=id;
		this.capacity=capacity;
		//this.length=length;
		this.flux=flux;
		this.order=order;
	}
	
	/*****************G U E T T E R S *********************/
	public int getOrder() {
		return order;
	}
	public String getId(){
		return this.id;
	}
	
	public double getCapacity(){
		return this.capacity;
	}
	
//	public double getLength(){
//		return this.length;
//	}
	
	public double getFlux(){
		return this.flux;
	}
	
	/********************* S E T T E R S ****************************/
	public void setFlux(double flux){
		this.flux=flux;
		
	}
	
//	public void setLength(double length){
//		this.length=length;
//	}
	
	public void setNom(double capacity){
		this.capacity=capacity;
	}
	
	public void setId(String id){
		this.id=id;
	}
	public void setOrder(int order) {
		this.order = order;
	}

}
