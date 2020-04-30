import javafx.fxml.FXMLLoader;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Global {

    public static void open(String sceneName) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        switch (sceneName){
            case "ProfilesStage":
                loader.setLocation(new File("src/main/java/ProfilesStage.fxml").toURI().toURL());
                Frame.changeScene(loader);
                break;
            case "HomeStage":
                loader.setLocation(new File("src/main/java/HomeStage.fxml").toURI().toURL());
                Frame.changeScene(loader);
            break;
            case "EngineCalculatorStage":
                loader.setLocation(new File("src/main/java/EngineCalculatorStage.fxml").toURI().toURL());

                Frame.changeScene(loader);
                break;
            case "ProfilesEditStage":
                loader.setLocation(new File("src/main/java/ProfilesEditStage.fxml").toURI().toURL());
                Frame.changeScene(loader);
                break;
        }

    }
    public static void exit(){
        Frame.close();
    }
}
