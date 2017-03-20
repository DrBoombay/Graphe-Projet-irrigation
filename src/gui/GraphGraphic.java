package gui;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import projectGraphe.Canalisation;

public class GraphGraphic extends Parent
{
	private ArrayList<Canalisation> reseau;
	
	public GraphGraphic(ArrayList<Canalisation> reseau)
	{
		this.reseau=reseau;
		Path path = new Path();
		
		for (Canalisation can : reseau)
		{
			path.getElements().add(new MoveTo(can.getSommetEntree().getX()*10, can.getSommetEntree().getY()*10));
			path.getElements().add(new LineTo(can.getSommetSortie().getX()*10, can.getSommetSortie().getY()*10));
		}
		
		this.getChildren().add(path);

	}
	
}
