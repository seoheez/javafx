package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{


	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Label lb = new Label("Hello World!!");
		lb.setFont(new Font(20));
		
		Scene scene = new Scene(lb,200,100); //Scene은 하나만 등록 가능. container에 필요한 것을 쌓아야 함.
		
		arg0.setScene(scene);
		arg0.setTitle("연습중");
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
