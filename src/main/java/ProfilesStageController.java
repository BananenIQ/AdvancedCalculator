import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class ProfilesStageController {
    @FXML
    public Button btnSave;
    @FXML
    public Button btnClear;
    @FXML
    public TextField tfName;
    @FXML
    public TextField tfVdc;
    @FXML
    public TextField tfCrs;
    @FXML
    public TextField tfCrt;
    @FXML
    public TextField tfCc;
    @FXML
    public TextField tfSt;
    @FXML
    public TextField tfSc;
    @FXML
    public TextField tfNls;
    @FXML
    public TextField tfNlc;
    @FXML
    public TextField tfRi;
    @FXML
    public TextField tfWoe;


    ArrayList<TextField> tFList = new ArrayList<>();

    @FXML
    public void initialize() {

        btnSave.setDisable(true);
        btnClear.setDisable(true);

        if (tFList.isEmpty()) {
            tFList.addAll(Arrays.asList(tfName, tfVdc, tfCrs, tfCrt, tfCc, tfSt, tfSc, tfNls, tfNlc, tfRi, tfWoe));
        }
    }

    public void OnSave(ActionEvent actionEvent) {
        Profile profile = new Profile(tfName.getText(), Double.parseDouble(tfVdc.getText()), Double.parseDouble(tfCrs.getText()), Double.parseDouble(tfCrt.getText()), Double.parseDouble(tfCc.getText()), Double.parseDouble(tfSt.getText()), Double.parseDouble(tfSc.getText()), Double.parseDouble(tfNls.getText()), Double.parseDouble(tfNlc.getText()), Double.parseDouble(tfRi.getText()), Double.parseDouble(tfWoe.getText()));
        ProfileList profileList = new ProfileList();
        profileList.add(profile);
        profileList.save();
    }

    public void OnClear(ActionEvent actionEvent) {

        btnSave.setDisable(true);
        btnClear.setDisable(true);
        for (TextField tF : tFList) {
            tF.clear();
            tF.setStyle("");
        }
    }

    boolean nameFilled;
    boolean block;
    boolean otherFilled;

    public void update(TextField tF) {

        if (tF.getId().equals("tfName")) {
            if (!tF.getText().isEmpty()) {
                btnClear.setDisable(false);
                nameFilled = true;
                if (!ProfileList.profileArrayList.isEmpty()) {
                    for (Profile profile : ProfileList.profileArrayList) {
                        if (tfName.getText().equals(profile.getName())) {
                            tfName.setStyle("-fx-border-color: red; -fx-background-color: rgba(255,0,0,0.5)");
                            btnSave.setDisable(true);
                            break;
                        } else {
                            if (!block) {
                                btnSave.setDisable(false);
                            }
                        }
                    }
                } else {
                    if (!block) {
                        btnSave.setDisable(false);
                    }
                }
            } else {
                if(!otherFilled){
                    btnClear.setDisable(true);
                }
                nameFilled = false;
                btnSave.setDisable(true);
            }
        } else {
            if (!tF.getText().isEmpty()) {
                otherFilled = true;
                btnClear.setDisable(false);
                try {
                    tF.setStyle("");
                    Double.parseDouble(tF.getText());
                    if (nameFilled) {
                        btnSave.setDisable(false);
                    }
                    block = false;

                } catch (Exception e) {
                    tF.setStyle("-fx-border-color: red; -fx-background-color: rgba(255,0,0,0.5)");
                    btnSave.setDisable(true);
                    block = true;
                }
            } else {
                otherFilled = false;
                if(nameFilled){
                    btnSave.setDisable(false);
                }else{
                    btnClear.setDisable(true);
                }
                block = false;
                tF.setStyle("");
            }
        }
    }

    public void nameOnChange(KeyEvent keyEvent) {
        update(tfName);
    }

    public void vdcOnChange(KeyEvent keyEvent) {
        update(tfVdc);
    }

    public void crsOnChange(KeyEvent keyEvent) {
        update(tfCrs);
    }

    public void crtOnChange(KeyEvent keyEvent) {
        update(tfCrt);
    }

    public void ccOnChange(KeyEvent keyEvent) {
        update(tfCc);
    }

    public void stOnChange(KeyEvent keyEvent) {
        update(tfSt);
    }

    public void scOnChange(KeyEvent keyEvent) {
        update(tfSc);
    }

    public void nlsOnChange(KeyEvent keyEvent) {
        update(tfNls);
    }

    public void nlcOnChange(KeyEvent keyEvent) {
        update(tfNlc);
    }

    public void riOnChange(KeyEvent keyEvent) {
        update(tfRi);
    }

    public void woeOnChange(KeyEvent keyEvent) {
        update(tfWoe);
    }

    public void OpenEngineCalculator(ActionEvent actionEvent) throws IOException {
        Global.open("EngineCalculatorStage");
    }

    public void OnExit(ActionEvent actionEvent) {
        Global.exit();
    }
}
