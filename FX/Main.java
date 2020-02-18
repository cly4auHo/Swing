package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Main extends Application {
	Stage primaryStage;
	PasswordField passwordField = new PasswordField();
	TextField loginField = new TextField("");
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		try {			
			Button ok = new Button("OK");
			ok.setId("myId");
			Label login = new Label("Login");
			Label password = new Label("Password");
			// BorderPane root = new BorderPane();
			GridPane root = new GridPane();
			root.setAlignment(Pos.CENTER);
			root.setHgap(10);
			root.setVgap(10);
			root.setPadding(new Insets(25, 25, 25, 25));
			root.add(login, 0, 0);
			root.add(loginField, 1, 0);
			root.add(password, 0, 1);
			root.add(passwordField, 1, 1);
			HBox hBox = new HBox();
			hBox.getChildren().add(ok);
			hBox.setAlignment(Pos.BASELINE_RIGHT);
			root.add(hBox, 1, 2);
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().
		getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
//			ok.setOnAction((event) -> {
//				if (loginField.getText().equals("admin") && passwordField.getText().equals("123")) {
//					System.out.println("Access Granted");
//				} else {
//					System.out.println("Access Denied");
//				}
//			});
//		} catch (Exception e) {
//
//		}
			ok.setOnAction((event) -> {
				//nextScene();
				nextSceneFullScreen();
			});
		} catch (Exception e) {

		}
	}

	private void nextScene() {
		Label result; 
		if (loginField.getText().equals("admin") && passwordField.getText().equals("123")) {
			result=new Label("Access Granted");
			result.setId("Green");
		} else {
			result=new Label("Access Denied");
			result.setId("Red");
		}
		BorderPane root = new BorderPane();
		root.setCenter(result);
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().
	getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	private void nextSceneFullScreen() {
		
		BorderPane root = new BorderPane();
		
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().
	getResource("application_f.css").toExternalForm());
		
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setFullScreen(true);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
