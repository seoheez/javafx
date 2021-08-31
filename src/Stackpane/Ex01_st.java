package Stackpane;

//Stackpane은 중첩해서 만드는 것.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex01_st extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		StackPane sp = new StackPane();
		sp.getChildren().addAll(new Rectangle(100, 100, Color.WHITE), new Label("Go!"));
		arg0.setScene(new Scene(sp, 300, 250));
		arg0.show();
		
	}

}
