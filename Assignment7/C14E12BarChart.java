import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class C14E12BarChart extends Application {
	@Override
	 public void start(Stage primaryStage) {	 
		Pane pane = new Pane();
	
		Rectangle project = new Rectangle(16, 180, 80, 150);
		project.setFill(Color.RED);
		pane.getChildren().add(new Text(16, 160, "Project -- 20%"));
		pane.getChildren().add(project);
		
		Rectangle quiz = new Rectangle(112, 265, 80, 75);
		quiz.setFill(Color.BLUE);
		pane.getChildren().add(new Text(112, 245, "Quiz -- 10%"));
		pane.getChildren().add(quiz);
		
		Rectangle midterm = new Rectangle(208, 105, 80, 225);
		midterm.setFill(Color.GREEN);
		pane.getChildren().add(new Text(208, 85, "Midterm -- 30%"));
		pane.getChildren().add(midterm);
		
		
		Rectangle final_exam = new Rectangle(304, 80, 80, 300);
		final_exam.setFill(Color.ORANGE);
		pane.getChildren().add(new Text(304, 60, "Final -- 40%"));
		pane.getChildren().add(final_exam);
		
		Scene scene = new Scene(pane, 400, 330);
		primaryStage.setTitle("Exrecise14_12 - Bar Chart");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
    } 
}