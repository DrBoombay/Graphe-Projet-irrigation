package gui;

import javafx.scene.Parent;
import javafx.scene.control.TextArea;

public class TextGUI extends Parent {
	
	public TextGUI()
	{
		TextArea ta = new TextArea();
        ta.setLayoutX(200);
        ta.setLayoutY(40);
        ta.setPrefSize(550, 500);
        ta.setVisible(true);
        ta.setWrapText(true);
        ta.setEditable(false);
	}

}
