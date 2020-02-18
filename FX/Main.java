package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class Main extends Application {

    Stage setPrimacy;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button buttonAccept = new Button("OK");
        Label login = new Label("Log");
        Label password = new Label("Pas");
        TextField loginField = new TextField();
        PasswordField passwordField = new PasswordField();

        //BorderPane bp = new BorderPane();
        //bp.setCenter(buttonAccept);
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane gp = new GridPane();
        Scene scene = new Scene(gp, 300, 275);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));

        //gp.add(buttonAccept, 2, 2);
        gp.add(login, 1, 0);
        gp.add(password, 1, 1);
        gp.add(loginField, 2, 0);
        gp.add(passwordField, 2, 1);

        HBox hBox = new HBox();
        hBox.getChildren().add(buttonAccept);
        hBox.setAlignment(Pos.BASELINE_RIGHT);
        gp.add(hBox, 2, 2);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();

        buttonAccept.setOnAction((event) -> {
            if (loginField.getText().equals("Admin") && passwordField.getText().equals("123")) {
                System.out.println("Access");
            } else {
                System.out.println("Access denied");
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }


}
