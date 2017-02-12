package projectGraphe;

class Graph {
	
	public boolean resteDebit(Cannalisation C)
	{
		
		return C.getCapacity() > 0;
	}
	
	public double compare (double capacite, double flux)
	{
		double fluxR = flux;
		
		if (fluxR > capacite)
			fluxR = capacite;
		
		return fluxR;
	}
	
	
}
