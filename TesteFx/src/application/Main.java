package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	private static Stage stage;
	@Override
	public void start(Stage primaryStage) {
		  stage = primaryStage;
		try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("/View/PIBIC.fxml"));
			Scene scene = new Scene(root,608,500);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		Main.stage = stage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
