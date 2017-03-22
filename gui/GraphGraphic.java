package gui;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import src.projectGraph.Canalisation;
import src.projectGraph.Sommet;
import javafx.scene.paint.*;

public class GraphGraphic extends Parent
{
	private ArrayList<Canalisation> reseau;
	private ArrayList<Sommet> sommets;
	private ArrayList<Canalisation> sources;


	public GraphGraphic(ArrayList<Canalisation> reseau,ArrayList<Canalisation> sources, ArrayList<Sommet> sommets)
	{
		this.reseau=reseau;
		this.sommets=sommets;
		this.sources=sources;
		Path path = new Path();

		for (Canalisation can : sources)
		{
			path.getElements().add(new MoveTo(can.getSommetEntree().getX()*20, can.getSommetEntree().getY()*5));
			path.getElements().add(new LineTo(can.getSommetSortie().getX()*20, can.getSommetSortie().getY()*5));
		}

		for (Canalisation can : reseau)
		{
			if(can.getSommetSortie().getName()!="P")
			{
				path.getElements().add(new MoveTo(can.getSommetEntree().getX()*20, can.getSommetEntree().getY()*5));
				path.getElements().add(new LineTo(can.getSommetSortie().getX()*20, can.getSommetSortie().getY()*5));
			}
		}

		for (Sommet sommet : sommets)
			this.getChildren().add(new SommetGUI(sommet));

		//		path.maxHeight(300);
		//		path.maxWidth(300);
		path.setLayoutX(800);
		path.setStrokeWidth(3);
		path.setStroke(Color.CORNFLOWERBLUE);
		this.getChildren().add(path);


	}

}
