package gui;

import java.util.ArrayList;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import src.projectGraph.Sommet;

public class SommetGUI extends Parent {
	private Sommet sommet;
	
	public SommetGUI(Sommet sommet)
	{
		this.sommet=sommet;
		Circle point = new Circle();
		Text text = new Text(sommet.getName());
		point.setCenterX(sommet.getX()*20);
		point.setCenterY(sommet.getY()*5);
		point.setRadius(7);
		point.setFill(Color.BLACK);
		point.setStroke(Color.BLACK);
		point.setLayoutX(800);
		
		text.setLayoutX(sommet.getX()*20+800);
		text.setLayoutY(sommet.getY()*5+20);
		
		
		
		this.getChildren().add(point);
		this.getChildren().add(text);

	}

}
