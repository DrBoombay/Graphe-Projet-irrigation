package gui;

import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class Logo extends Parent{
	
	public Logo()
	{
		ImageView logo = new ImageView();
		logo.setLayoutX(200);
		logo.setLayoutY(200);
		
		this.getChildren().add(logo);
	}

}
