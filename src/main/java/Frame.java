import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;


public class Frame {

    private boolean b = true;
    private static Stage homeStage;

    public Frame(){

    }

    public Frame(Stage homeStage) throws IOException {

        Frame.homeStage = homeStage;

        Parent pane = FXMLLoader.load(getClass().getResource("HomeStage.fxml"));

        changeScene(pane);
    }
    public static void changeScene(Parent pane) throws IOException {

        VBox vbox = new VBox(pane);

        Scene scene = new Scene(vbox);


        homeStage.setResizable(false);
        homeStage.setScene(scene);
        homeStage.show();
    }

    public static void close(){
        homeStage.close();
    }



}
