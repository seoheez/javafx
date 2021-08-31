package Imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01_Img extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/SmileReRe.png");
//		iv.setImage(new Image("/img/calendar.png"));
		
//		iv.setFitHeight(100); //세로크기
		iv.setFitWidth(50); //가로크기
		iv.setPreserveRatio(true); //세로 또는 가로 둘중 하나만 설정하면 기준에 맞춰줌.
		iv.setRotate(45); //이미지 회전 각도
		
		ap.getChildren().add(iv);
		
		arg0.setScene(new Scene(ap, 300, 200));
		
		arg0.show();
	}

}
