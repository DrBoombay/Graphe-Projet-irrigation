package projectGraphe;

class Source 
{
//*******************************DEFINITION DES PARAMETRES********************************
	protected double debitSource;
	protected String idSource;
	protected String typeSource;
	protected double waterIn;
	
//***********************************BUILDER : DEFAULT**********************************************
	public Source()
	{
		idSource = "Unknown";
		typeSource = "Unknown";
		debitSource = 0.0;
		waterIn = 0.0;
		
	}
	
//************************************BUILDER : SETTINGS*****************************************
	
	public Source (String idSourceBuild, String typeBuild, double debitBuild, double waterInBuild)
	{
		idSource = idSourceBuild;
		typeSource = typeBuild;
		debitSource = debitBuild;
		waterIn = waterInBuild;
	}
	
//*************************************GETTERS***************************************************
	
	public String getIdSource()
	{
		return idSource;
	}
	
	public String getTypeSource()
	{
		return typeSource;
	}
	
	public double getDebitSource()
	{
		return debitSource;
	}
	
	public double getwaterIn()
	{
		return waterIn;
	}
	
//************************************SETTERS****************************************************
	
	public void setIdSource(String IdSourceSet)
	{
		idSource = IdSourceSet;
	}
	
	public void setTypeSource(String typeSourceSet)
	{
		typeSource = typeSourceSet;
	}
	
	public void setDebitSource(double debitSourceSet)
	{
		debitSource = debitSourceSet;
	}
	
	public void setWaterIn(double waterInSet)
	{
		waterIn = waterInSet;
	}
}
