import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class HomeStageController {


    public void OpenEngineCalculator(ActionEvent actionEvent) throws IOException {
        Global.open("EngineCalculatorStage");
}

    public void OnExit(ActionEvent actionEvent) {
        Global.exit();

    }
}
