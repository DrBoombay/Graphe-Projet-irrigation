package projectGraphe;

public class Cannalisation {
	protected double capacity;
	protected double length;
	protected String id;
	protected double flux;
	
	
	//***********************CREATION CONSTRUCTEUR*****************************//
	public Cannalisation(){
		capacity =0.0;
		length =0.0;
		id="incoonu";
		flux=0.0;
		
	}
	public Cannalisation( String idP ,double capacityP, double lengthP, double fluxP){
		
		id=idP;
		capacity=capacityP;
		length=lengthP;
		flux=fluxP;
		
		
	}

}
