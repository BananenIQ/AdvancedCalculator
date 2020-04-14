import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;

public class Global {

    public static void open(String sceneName) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        switch (sceneName){
            case "ProfilesStage":
                loader.setLocation(new URL("file:///C:/Users/kryst/git/AdvancedCalculator/src/main/java/ProfilesStage.fxml"));
                Frame.changeScene(loader);
                break;
            case "HomeStage":
                loader.setLocation(new URL("file:///C:/Users/kryst/git/AdvancedCalculator/src/main/java/HomeStage.fxml"));
                Frame.changeScene(loader);
            break;
            case "EngineCalculatorStage":
                loader.setLocation(new URL("file:///C:/Users/kryst/git/AdvancedCalculator/src/main/java/EngineCalculatorStage.fxml"));
                Frame.changeScene(loader);
                break;
            case "ProfilesEditStage":
                loader.setLocation(new URL("file:///C:/Users/kryst/git/AdvancedCalculator/src/main/java/ProfilesEditStage.fxml"));
                Frame.changeScene(loader);
                break;
        }

    }
    public static void exit(){
        Frame.close();
    }
}
