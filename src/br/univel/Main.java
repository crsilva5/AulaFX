package br.univel;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) { //primaryStage é o nome da tela
		try {
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("TelaPrincipal.fxml")); //Lendo arquivo TelaPrincipal.xml e instanciando a variavel root.
			Scene scene = new Scene(root,740,840); //Tela
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); //Aplica os parametros css a tela.
			primaryStage.setScene(scene); //Cria a janela
			primaryStage.show(); //Mostra a janela
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
