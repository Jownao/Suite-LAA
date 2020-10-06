package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	private static Scene fxmlMain;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load((getClass().getResource("view/Principal.fxml")));
			fxmlMain = new Scene(root,400,250);
			primaryStage.setScene(fxmlMain);
			primaryStage.setTitle("Suite de ordenação");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
