package championship.main;

import championship.controller.ChampionshipController;
import championship.model.ChampionshipManager;
import championship.view.ChampionshipView;
import javafx.application.Application;
import javafx.stage.Stage;

// Submitted by Roi Markovitz 

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		ChampionshipManager theModel = new ChampionshipManager();
		ChampionshipView theView = new ChampionshipView(primaryStage);
		ChampionshipController controller = new ChampionshipController(theModel, theView);		
	}
		
}
