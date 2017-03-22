package projectGraphe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FruitsEtLegumesDAO {

	String url = "jdbc:mysql://localhost:3306/Culture";
	String user = "root";
	String password = "cn9s&c-gwaYa";
	String driver = "com.mysql.jdbc.Driver";


	public List<FruitsEtLegumes> retrieveAllfruitsEtLegumesList(){
		List<FruitsEtLegumes> fruitsEtLegumesList = new ArrayList<FruitsEtLegumes>();


		try {
			Class.forName(this.driver);
			//Etablissement de la connection entre la base de donnée et le
			Connection conn = DriverManager.getConnection(this.url,this.user,this.password);
			//créé un accès à la base
			Statement state = conn.createStatement();
			//requette sql =créer colonne  pour chaque attributs de la table... ( chaque attribut pour chaque paramettre de class )
			ResultSet	result = state.executeQuery("SELECT * FROM FruitsEtLegumes");

			while(result.next()){
				
				// attribution des paramettres d'objets
				FruitsEtLegumes fruitsEtLegumes = new FruitsEtLegumes();
				fruitsEtLegumes.setNomVege(result.getString("NomVege"));
				fruitsEtLegumes.setNomType(result.getString("NomType"));
				fruitsEtLegumes.setNomFamille(result.getString("NomFamille"));
				fruitsEtLegumes.setBesoinEauNord(result.getDouble("BesoinEauNord"));
				fruitsEtLegumes.setBesoinEauSud(result.getDouble("BesoinEauSud"));
				fruitsEtLegumesList.add(fruitsEtLegumes);
			}

			state.close();
			result.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}      

		return fruitsEtLegumesList;


	}
}
