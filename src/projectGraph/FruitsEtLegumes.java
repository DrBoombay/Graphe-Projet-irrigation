package src.projectGraph;


public class FruitsEtLegumes {

	protected String NomVege;
	protected String NomFamille;
	protected String NomType;
	protected double BesoinEauNord;
	protected double BesoinEauSud;
	
	
	
	//*****************************CREATION BUILDER ***********************************
	public FruitsEtLegumes() {
	}
	
	public FruitsEtLegumes(String NomVege, String NomFamille, String NomType, double BesoinEauNord,
			double BesoinEauSud) {
		super();
		this.NomVege = NomVege;
		this.NomFamille = NomFamille;
		this.NomType = NomType;
		this.BesoinEauNord = BesoinEauNord;
		this.BesoinEauSud = BesoinEauSud;
	}
	//******************************* GUETTERS******************************************
	String getNomVege() {
		return NomVege;
	}

	public String getNomFamille() {
		return NomFamille;
	}

	public String getNomType() {
		return NomType;
	}

	public double getBesoinEauNord() {
		return BesoinEauNord;
	}

	public double getBesoinEauSud() {
		return BesoinEauSud;
	}

	//**********************************SETTERS************************************************

	public void setNomVege(String nomVege) {
		NomVege = nomVege;
	}

	public void setNomFamille(String nomFamille) {
		NomFamille = nomFamille;
	}

	public void setNomType(String nomType) {
		NomType = nomType;
	}

	public void setBesoinEauNord(double besoinEauNord) {
		BesoinEauNord = besoinEauNord;
	}

	public void setBesoinEauSud(double besoinEauSud) {
		BesoinEauSud = besoinEauSud;
	}

	@Override
	public String toString() {
		return "FruitsEtLegumes [NomVege=" + NomVege + ", NomFamille=" + NomFamille + ", NomType=" + NomType
				+ ", BesoinEauNord=" + BesoinEauNord + ", BesoinEauSud=" + BesoinEauSud + "]";
	}

}
