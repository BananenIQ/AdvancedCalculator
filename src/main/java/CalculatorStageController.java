import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;


public class CalculatorStageController implements Initializable {

    @FXML
    public TextField tfnM;
    @FXML
    public TextField tfMM;
    @FXML
    public TextField tfPab;
    @FXML
    public TextField tfPvmech;
    @FXML
    public TextField tfPvel;
    @FXML
    public TextField tfi;
    @FXML
    public TextField tfEtaG;
    @FXML
    public TextField tfnG;
    @FXML
    public TextField tfMG;
    @FXML
    public TextField tfPG;
    @FXML
    public TextField tfEtaM;
    @FXML
    public TextField tfR;
    @FXML
    public TextField tfU;
    @FXML
    public TextField tfPzu;
    @FXML
    public TextField tfI;
    @FXML
    public TextField tfPvG;
    @FXML
    public TextField tfPvM;

    ArrayList<TextField> tFList = new ArrayList<>();

    @FXML
    public void initialize() {
        if (tFList.isEmpty()) {
            tFList.addAll(Arrays.asList(tfnM, tfMM, tfPab, tfPvmech, tfPvel, tfi, tfEtaG, tfnG, tfMG, tfPG, tfEtaM, tfR, tfU, tfPzu, tfI, tfPvG, tfPvM));
        }
    }

    public void c(boolean b){
        tfMM.setDisable(b);
    }

    public void OnClear(ActionEvent actionEvent) {
        for (TextField tF : tFList) {
            tF.clear();
            tF.setStyle("");
        }
    }

    Watcher w = new Watcher();


    public void update(TextField tF) {

        tF.setStyle("");

        w.setBlockTextFields(false);

        if (tF.getText().isEmpty()) {

            tF.setStyle("");
            w.setBlockTextFields(false);

        } else {
            try {
                Double.parseDouble(tF.getText());
            } catch (Exception e) {
                tF.setStyle("-fx-border-color: #ff0000; -fx-background-color: rgba(255,0,0,0.5)");
                w.setBlockTextFields(true);
            }
        }
        if (!w.getBlockStatus() && tF.getText().length() >= 1) {
            w.addTextField(tF);
        }
    }

    public void setDisable(TextField tF, boolean b) {
        tF.setDisable(b);
    }

    public void nMOnChange(KeyEvent keyEvent) {
        update(tfnM);
    }

    public void MMOnChange(KeyEvent keyEvent) {
        update(tfMM);
    }

    public void PabOnChange(KeyEvent keyEvent) {
        update(tfPab);
    }

    public void PvmechOnChange(KeyEvent keyEvent) {
        update(tfPvmech);
    }

    public void PvelOnChange(KeyEvent keyEvent) {
        update(tfPvel);
    }

    public void EtaGOnChange(KeyEvent keyEvent) {
        update(tfEtaG);
    }

    public void iOnChange(KeyEvent keyEvent) {
        update(tfi);
    }

    public void nGOnChange(KeyEvent keyEvent) {
        update(tfnG);
    }

    public void MGOnChange(KeyEvent keyEvent) {
        update(tfMG);
    }

    public void PGOnChange(KeyEvent keyEvent) {
        update(tfPG);
    }

    public void EtaMOnChange(KeyEvent keyEvent) {
        update(tfEtaM);
    }

    public void ROnChange(KeyEvent keyEvent) {
        update(tfR);
    }

    public void OnChange(KeyEvent keyEvent) {
        update(tfU);
    }

    public void PzuOnChange(KeyEvent keyEvent) {
        update(tfPzu);
    }

    public void IOnChange(KeyEvent keyEvent) {
        update(tfI);
    }

    public void PvMOnChange(KeyEvent keyEvent) {
        update(tfPvM);
    }

    public void PvGOnChange(KeyEvent keyEvent) {
        update(tfPvG);
    }

    public void newFileOnAction(ActionEvent actionEvent) {
    }

    public void OnCreateProfile(ActionEvent actionEvent) throws IOException {
        Global.open("ProfilesStage");
    }

    public void OnExit(ActionEvent actionEvent) {
        Global.exit();
    }

    public void OnEdit(ActionEvent actionEvent) throws IOException {
        Global.open("ProfilesEditStage");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}