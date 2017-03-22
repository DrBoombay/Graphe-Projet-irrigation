package projectGraphe;

import java.util.ArrayList;

public class CanalisationBuilder {

	public static ArrayList<Canalisation> generateSource(){
		ArrayList<Canalisation> sources = new ArrayList<Canalisation>();
		sources.add(new Canalisation ("SA", 45.0, 0.00, new Sommet("S"), new Sommet("A")));
		sources.add(new Canalisation ("SB", 45.0, 0.00, new Sommet("S"), new Sommet("B")));
		sources.add(new Canalisation ("SC", 45.0, 0.00, new Sommet("S"), new Sommet("C")));
		return sources;
	}
}