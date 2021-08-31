package Listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01_lv extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane ap = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		
		listView.getItems().addAll("item1", "item2", "item3");
		listView.setPrefSize(100, 100);
		listView.setLayoutX(20);
		listView.setLayoutY(20);
		
		ap.getChildren().add(listView);
		ap.setPrefSize(300, 300);
		arg0.setScene(new Scene(ap));
		
		arg0.show();
		
	}

}
