package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

  // Icon is from freepik on flaticons.com

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.getIcons()
        .add(new Image(getClass().getClassLoader().getResourceAsStream("speech.png")));
    primaryStage.setTitle("Learn how to say! by Shash");
    primaryStage.setMinHeight(500);
    primaryStage.setMinWidth(600);
    Parent root = FXMLLoader.load(getClass().getResource("DictView.fxml"));
    Scene scene = new Scene(root);
    scene.getStylesheets().add(getClass().getResource("StyleSheets/font24.css").toExternalForm());
    scene.getStylesheets()
        .add(getClass().getResource("StyleSheets/basicSettings.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }
}
