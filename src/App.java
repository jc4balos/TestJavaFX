import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class App extends Application {

     
    @Override
    public void start(Stage primaryStage) throws IOException {
        try{
           
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
    
            primaryStage.setTitle("Home");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch(Exception e){
            e.printStackTrace();
        }
      
    }
 
 public static void main(String[] args) {
        launch(args);
    }
}