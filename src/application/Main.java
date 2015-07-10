package application;
	
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Sphere;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group group = new Group();
			Sphere sphere = new Sphere(20);
			
			
			TranslateTransition translateTransitionX = new TranslateTransition(Duration.millis(2000), sphere);
			    translateTransitionX.setFromX(50);
			    translateTransitionX.setToX(350);
			    translateTransitionX.setCycleCount(1);
			    translateTransitionX.setAutoReverse(false);
			
		    TranslateTransition translateTransitionY = new TranslateTransition(Duration.millis(2000), sphere);
			    translateTransitionY.setFromY(50);
			    translateTransitionY.setToY(350);
			    translateTransitionY.setCycleCount(1);
			    translateTransitionY.setAutoReverse(false);
			
			    
		    ParallelTransition parallelTransition = new ParallelTransition();
		    parallelTransition.getChildren().addAll(translateTransitionX, translateTransitionY);
		    parallelTransition.setCycleCount(1);
		    parallelTransition.play();

		    group.getChildren().add(sphere);
			
		    Scene scene = new Scene(group, 400, 400);
		    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		    primaryStage.setScene(scene);
		    primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
