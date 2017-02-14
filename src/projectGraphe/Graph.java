package projectGraphe;

import java.util.List;

public class Graph {
	
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
	
//******************************RECUPERATION DE LA SOURCE AVEC LA PLUS GRANDE CAPACITE RESTANTE**********************************************
	
	public static Cannalisation start(List<Cannalisation> _source) {
		Cannalisation source = new Cannalisation ();
		
		for (int i = 0; i < _source.size(); i++)
		{
			if (_source.get(i).getCapacity() > source.getCapacity())
			{
				source = _source.get(i);
			}
		}
		return source;
	}
}
