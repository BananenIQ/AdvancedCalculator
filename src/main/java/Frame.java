import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Frame {

    private boolean b = true;
    private static Stage homeStage;

    public Frame(){

    }

    public Frame(Stage homeStage) throws IOException {

        Frame.homeStage = homeStage;

        URL location = getClass().getResource("HomeStage.fxml");

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(location);

        changeScene(loader);



    }
    public static void changeScene(FXMLLoader loader) throws IOException {


        VBox vbox = loader.load();

        Scene scene = new Scene(vbox);

        homeStage.setResizable(false);

        homeStage.setScene(scene);

        homeStage.show();
    }

    public static void close(){
        homeStage.close();
    }



}
