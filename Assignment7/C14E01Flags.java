import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class C14E01Flags extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5));
		pane.setHgap(5);
		pane.setVgap(5);
		
		Image image1 = new Image("flag1.gif");
		ImageView firstFlag = new ImageView(image1);
		firstFlag.setFitHeight(200);
		firstFlag.setFitWidth(300);
		pane.add(firstFlag, 0, 0);

		Image image2 = new Image("flag2.gif");
		ImageView secondFlag = new ImageView(image2);
		secondFlag.setFitHeight(200);
		secondFlag.setFitWidth(380);
		pane.add(secondFlag, 1, 0);

		Image image3 = new Image("flag3.gif");
		ImageView thirdFlag = new ImageView(image3);
		thirdFlag.setFitHeight(200);
		thirdFlag.setFitWidth(333);
		pane.add(thirdFlag, 0, 1);

		Image image4 = new Image("flag4.gif");
		ImageView fourthFlag = new ImageView(image4);		
		fourthFlag.setFitHeight(200);
		fourthFlag.setFitWidth(300);		
		pane.add(fourthFlag, 1, 1);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_01 - Flags");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}