package Gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex01_gp extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		GridPane gridPane = new GridPane();
		Button btn = new Button("Button");
		GridPane.setConstraints(btn,0,0); //가로, 세로
		
		Label label = new Label("label");
		Label label02 = new Label("label02");
		
		GridPane.setConstraints(label,0,2); //가로, 세로
		GridPane.setConstraints(label02,1,1); //가로, 세로
		
		gridPane.getChildren().addAll(btn, label, label02);
		
		arg0.setScene(new Scene(gridPane, 300, 100));
		
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
