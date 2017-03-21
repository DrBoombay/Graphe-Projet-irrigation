package gui;

import java.beans.EventHandler;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


public class StartButton extends Parent {
	
	public StartButton()
	{
		Button start = new Button();
		start.setPrefWidth(100);
		start.setPrefHeight(50);
		start.setText("Cliquer ici");
		start.setLayoutX(100);
		start.setLayoutY(50);

		
		this.getChildren().add(start);
	}
	
}
