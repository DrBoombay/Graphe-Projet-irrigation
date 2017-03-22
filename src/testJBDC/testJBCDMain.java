package testJBDC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import projectGraphe.FruitsEtLegumes;

public class testJBCDMain {

	public static void main(String[] args)
	{	



		
		ArrayList<FruitsEtLegumes> VegeList= new ArrayList<FruitsEtLegumes>();
		String url = "jdbc:mysql://localhost:3306/Culture";
		String user = "root";
		String password = "cn9s&c-gwaYa";

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connexion effective !");         



			System.out.println("OK");
			
			
			//création d' objet statement
			Statement state = conn.createStatement();
			Statement stVege = conn.createStatement();
			
			
			//L'objet ResultSet contient le résultat de la requête SQL
			ResultSet result = state.executeQuery("SELECT * FROM FruitsEtLegumes ");
			ResultSet rsVege =stVege.executeQuery("SELECT NomVege FROM FruitsEtLegumes ");

			
			//On récupère les MetaData
			ResultSetMetaData resultMeta = result.getMetaData();
			
			//test afficher que les nom de Fruits et Légumes
			ResultSetMetaData resultMetaVege = rsVege.getMetaData();

			
			
			
			//
			System.out.println("\n*********************************************************************************");


			//On affiche le nom des colonnes
			for(int i = 1; i <= resultMeta.getColumnCount(); i++)
				System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

			System.out.println("\n");

			List<FruitsEtLegumes> fruitsEtLegumesList = new ArrayList<FruitsEtLegumes>();
			while(result.next()){         
				FruitsEtLegumes fruitsEtLegumes = new FruitsEtLegumes();
				fruitsEtLegumes.setNomVege(result.getString("NomVege"));
				fruitsEtLegumes.setNomType(result.getString("NomType"));
				fruitsEtLegumes.setNomFamille(result.getString("NomFamille"));
				fruitsEtLegumes.setBesoinEauNord(result.getDouble("BesoinEauNord"));
				fruitsEtLegumes.setBesoinEauSud(result.getDouble("BesoinEauSud"));
//				for(int i = 1; i <= resultMeta.getColumnCount(); i++)
//					System.out.print("\t" + result.getObject(i).toString() + "\t |");
//				FruitsEtLegumes fruitsEtLegumes = new FruitsEtLegumes();
//				System.out.println("\n---------------------------------");
				fruitsEtLegumesList.add(fruitsEtLegumes);
				
			}
			state.close();
			result.close();
			
			
			fruitsEtLegumesList.size();
			for (FruitsEtLegumes fruitsEtLegumes : fruitsEtLegumesList) {
				fruitsEtLegumes.getClass();
			}
			while(rsVege.next()){
				for(int i=1; i<=resultMetaVege.getColumnCount(); i++){
					System.out.println(rsVege.getObject(i).toString());
					
					
				}
					
			}
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}      
	}
	// ***************************RECUPERATION DE LA BASE DE DONNE DANS UNE ARRAY LISTE ************************$

	public static  ArrayList<FruitsEtLegumes> getDataFruitsEtLegumes (ResultSetMetaData resultMeta) throws SQLException{
		ArrayList<FruitsEtLegumes> ListeLegumes= new ArrayList<FruitsEtLegumes>();

		for(int i=1, j=0; i<=resultMeta.getColumnCount(); i++,j++){

		}

		return ListeLegumes;
	}



}
