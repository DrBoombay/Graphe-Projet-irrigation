package gui;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import projectGraphe.Canalisation;
import projectGraphe.Sommet;

public class GraphGraphic extends Parent
{
	private ArrayList<Canalisation> reseau;
	private ArrayList<Sommet> sommets;

	public GraphGraphic(ArrayList<Canalisation> reseau, ArrayList<Sommet> sommets)
	{
		this.reseau=reseau;
		this.sommets=sommets;
		Path path = new Path();
		
		for (Canalisation can : reseau)
			
		{
			path.getElements().add(new MoveTo(can.getSommetEntree().getX()*20, can.getSommetEntree().getY()*5));
			path.getElements().add(new LineTo(can.getSommetSortie().getX()*20, can.getSommetSortie().getY()*5));
		}
			
		for (Sommet sommet : sommets)
			this.getChildren().add(new SommetGUI(sommet));
			
//		path.maxHeight(300);
//		path.maxWidth(300);
		path.setLayoutX(800);
		this.getChildren().add(path);
		

	}
	
}
