package src.projectGraph;

import java.util.ArrayList;
import java.util.List;

public class FruitsEtLegumesByPuits {

	private List<FruitsEtLegumes> fruitsEtLegumes;
	private Canalisation canalisation;

	public FruitsEtLegumesByPuits() {
	}

	public FruitsEtLegumesByPuits(List<FruitsEtLegumes> fruitsEtLegumes, Canalisation canalisation) {
		this.fruitsEtLegumes = fruitsEtLegumes;
		this.canalisation = canalisation;
	}
	@Override
	public String toString() {
		return "FruitsEtLegumesByPuits [fruitsEtLegumes=" + fruitsEtLegumes + ", canalisation=" + canalisation + "]";
	}

	public List<FruitsEtLegumes> getFruitsEtLegumes() {
		return fruitsEtLegumes;
	}
	public Canalisation getCanalisation() {
		return canalisation;
	}
	public void setFruitsEtLegumes(List<FruitsEtLegumes> fruitsEtLegumes) {
		this.fruitsEtLegumes = fruitsEtLegumes;
	}
	public void setCanalisation(Canalisation canalisation) {
		this.canalisation = canalisation;
	}

	public String displayFruitsEtLegumesByCanalisation(){
		String display = new String();
		display ="Le champs " + this.canalisation.getId() + " peut subvenir aux besoins des produits suivants : \n";
		for (FruitsEtLegumes fruitsEtLegumes2 : fruitsEtLegumes) {
			display = display + fruitsEtLegumes2.getNomVege() +"; ";
		}
		return display+"\n";
	}
	public static List<FruitsEtLegumesByPuits> compareNeedAndCapacity(List<FruitsEtLegumes> fruitsEtLegumesList,  List<Canalisation> lastCapacity){


		List<FruitsEtLegumesByPuits> fruitsEtLegumesByPuits = new ArrayList<FruitsEtLegumesByPuits>();
		List<FruitsEtLegumes> vegeNonValable = new ArrayList<FruitsEtLegumes>();
		for (Canalisation canalisation : lastCapacity) {
			//reset de la Liste 
			vegeNonValable = new ArrayList<FruitsEtLegumes>();
			for (FruitsEtLegumes fruitsEtLegumes : fruitsEtLegumesList) {			
				if(canalisation.getFlux()>=fruitsEtLegumes.getBesoinEauSud()){
					vegeNonValable.add(fruitsEtLegumes);
				}
			}
			fruitsEtLegumesByPuits.add(new FruitsEtLegumesByPuits(vegeNonValable, canalisation));
		}

		return fruitsEtLegumesByPuits;
	}




}
