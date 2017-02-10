package projectGraphe;

class Parcelle {
//****************************************DEFINITION DES PARAMETRES**********************
	protected String idParcelle;
	protected double besoinEau;
	protected double surfaceParcelle;
	
//*****************************************BUILDER : DEFAULT*****************************
	public Parcelle()
	{
		idParcelle = "unknown";
		besoinEau = 0.0;
		surfaceParcelle = 0.0;
	}
	
//******************************************BUILDER : SETTINGS***************************
	public Parcelle(String idParcelleBuild, double besoinEauBuild, double surfaceParcelleBuild)
	{
		idParcelle = idParcelleBuild;
		besoinEau = besoinEauBuild;
		surfaceParcelle = surfaceParcelleBuild;
	}
	
//*****************************************GETTERS******************************************
	public String getIdParcelle()
	{
		return idParcelle;
	}
	
	public double getBesoinEau()
	{
		return besoinEau;
	}
	
	public double getSurfaceParcelle()
	{
		return surfaceParcelle;
	}
	
//******************************************SETTERS********************************************
	public void setIdParcelle(String idParcelleSet)
	{
		idParcelle = idParcelleSet;
	}
	
	public void setBesoinEau(double besoinEauSet)
	{
		besoinEau = besoinEauSet;
	}
	
	public void setSurfaceParcelle(double surfaceParcelleSet)
	{
		surfaceParcelle = surfaceParcelleSet;
	}
}
