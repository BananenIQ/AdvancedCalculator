import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

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

    private boolean block;

    public void OpenEngineCalculator(ActionEvent actionEvent) throws IOException {
        Global.open("EngineCalculatorStage");
    }

    public void OnExit(ActionEvent actionEvent) {
        Global.exit();
    }

    public void OnSave(ActionEvent actionEvent) {
            Profile profile = new Profile(tfName.getText(), Double.parseDouble(tfVdc.getText()), Double.parseDouble(tfCrs.getText()), Double.parseDouble(tfCrt.getText()), Double.parseDouble(tfCc.getText()), Double.parseDouble(tfSt.getText()), Double.parseDouble(tfSc.getText()), Double.parseDouble(tfNls.getText()), Double.parseDouble(tfNlc.getText()), Double.parseDouble(tfRi.getText()), Double.parseDouble(tfWoe.getText()));
            ProfileList profileList = new ProfileList();
            profileList.add(profile);
            profileList.save();
    }

    ArrayList<TextField> tFList = new ArrayList<TextField>();

    public boolean isEmpty(){
        boolean b = true;
        for(TextField tf : tFList){
            if(!tf.getText().isEmpty()){

                b = false;
                break;
            }
        }
        return b;
    }

    public void OnClear(ActionEvent actionEvent) {
        update();
        btnSave.setDisable(true);
        btnClear.setDisable(true);
        for(TextField tF : tFList){
            tF.clear();
            tF.setStyle("");
        }
    }

    public void update(){
        if(isEmpty()){
            btnClear.setDisable(true);
        }
        if(tFList.isEmpty()){
            tFList.addAll(Arrays.asList(tfName,tfVdc,tfCrs,tfCrt,tfCc,tfSt,tfSc,tfNls,tfNlc,tfRi,tfWoe));
        }
    }
    public void update(TextField tF){

        block = false;
        if(!tfName.getText().isEmpty() && !block){
            btnSave.setDisable(false);
        }
        btnClear.setDisable(false);
        update();
        tF.setStyle("");
        if (tF.getText().isEmpty()) {
            tF.setStyle("");
        } else {
            try {
                Double.parseDouble(tF.getText());
            } catch (Exception e) {
                tF.setStyle("-fx-border-color: red; -fx-background-color: rgba(255,0,0,0.5)");
                block = true;
                btnSave.setDisable(true);

            }
        }

    }

    public void nameOnChange(KeyEvent keyEvent) {
        update();
        for(Profile profile : ProfileList.profileArrayList){

            if(tfName.getText().equals(profile.getName())){
                tfName.setStyle("-fx-border-color: red; -fx-background-color: rgba(255,0,0,0.5)");
                block = true;
                btnSave.setDisable(true);
                break;
            }else{
                tfName.setStyle("");
                block = false;
                btnSave.setDisable(false);
            }
        }

        if(tfName.getText().isEmpty()){
            btnSave.setDisable(true);
        }else if(!block){
            btnClear.setDisable(false);
            btnSave.setDisable(false);
        }

    }

    public void OnRemove(ActionEvent actionEvent) {

    }

    public void OnClicked(MouseEvent mouseEvent) {
    }

    public void OnTyped(KeyEvent keyEvent) {

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

    public void OnChange(ActionEvent actionEvent) {
    }
}
