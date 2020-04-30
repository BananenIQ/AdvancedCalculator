import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Global {

    public static void open(String sceneName) throws IOException {
        Parent pane;
        switch (sceneName){

            case "ProfilesStage":
                pane = FXMLLoader.load(Global.class.getResource("ProfilesStage.fxml"));
                Frame.changeScene(pane);
                break;
            case "HomeStage":
                pane = FXMLLoader.load(Global.class.getResource("HomeStage.fxml"));
                Frame.changeScene(pane);
            break;
            case "EngineCalculatorStage":
                pane = FXMLLoader.load(Global.class.getResource("EngineCalculatorStage.fxml"));
                Frame.changeScene(pane);
                break;
            case "ProfilesEditStage":
                pane = FXMLLoader.load(Global.class.getResource("ProfilesEditStage.fxml"));
                Frame.changeScene(pane);
                break;
        }

    }
    public static void exit(){
        Frame.close();
    }
}
