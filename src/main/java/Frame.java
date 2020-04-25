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

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(new File("src/main/java/HomeStage.fxml").toURI().toURL());

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
