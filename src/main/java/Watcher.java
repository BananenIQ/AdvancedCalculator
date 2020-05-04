import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;

public class Watcher {

    private boolean block = false;

    public Watcher() {

    }

    public Watcher(Stage homeStage) {

    }

    public void setBlockTextFields(boolean bl) {
        block = bl;
    }

    public boolean getBlockStatus() {
        return block;
    }

    public void addTextField(TextField tF) {
        String id = tF.getId();
        switch (id) {
            case "tfnM":
                TorqueMotor(tF);
                break;
            case "tfMM":
                TorqueMotor(tF);
                Gear(tF);
                break;
            case "tfPab":
                PowerLossMotor(tF);
                TorqueMotor(tF);
                ETAMotor(tF);
                GearPowerLoss(tF);
                break;
            case "tfPvmech":
                MechPowerLoss(tF);
                break;
            case "tfPvel":
                ElePowerLoss(tF);
                MechPowerLoss(tF);
                break;
            case "tfi":
            case "tfEtaG":
                Gear(tF);
                break;
            case "tfnG":
                GearPower(tF);
                break;
            case "tfMG":
                GearPower(tF);
                Gear(tF);
                break;
            case "tfPG":
                GearPower(tF);
                GearPowerLoss(tF);
                break;
            case "tfEtaM":
                ETAMotor(tF);
                break;
            case "tfR":
            case "tfI":
                URI(tF);
                PowerMotor(tF);
                ElePowerLoss(tF);
                break;
            case "tfU":
                URI(tF);
                PowerMotor(tF);
                break;
            case "tfPzu":
                PowerMotor(tF);
                PowerLossMotor(tF);
                ETAMotor(tF);
                break;
            case "tfPvG":
                GearPowerLoss(tF);
                break;
            case "tfPvM":
                MechPowerLoss(tF);
                PowerLossMotor(tF);
                break;
        }
    }
// Zu erst müssen die Profile funktionieren
// Verlustleistung muss aus Profil berechnet werden
// Man braucht Motor Profile: Um Ampere und andere Einheiten zu speichern


    static HashMap<String, TextField> tfList = new HashMap<>();

    ArrayList<String> dTextFields = new ArrayList<>();
    public ArrayList<String> aTextFields = new ArrayList<>();

    public ArrayList<String> getDTextFields() {
        return dTextFields;
    }

    public ArrayList<String> getATextFields() {
        return aTextFields;
    }

    public void statusSwitchTextFields(String tFId, boolean status) { // true means disable

        if (status) {
            if(!dTextFields.contains(tFId)){
                dTextFields.add(tFId);
            }
            aTextFields.remove(tFId);
        } else {
            if(!aTextFields.contains(tFId)) { // UPS da kommt nicht das richtige Text Feld an!
                aTextFields.add(tFId);

            }
            dTextFields.remove(tFId);
        }
    }

    public void removeTextField(TextField tF) {
        statusSwitchTextFields(tF.getId(), false);
        tfList.remove(tF.getId());
    }

    public void URI(TextField tF) {


        tfList.put(tF.getId(), tF);

        if (tfList.containsKey("tfU") && tfList.containsKey("tfI")) {
            statusSwitchTextFields("tfR", true);
        }
        if (tfList.containsKey("tfU") && tfList.containsKey("tfR")) {
            statusSwitchTextFields("tfI", true);
        }
        if (tfList.containsKey("tfI") && tfList.containsKey("tfR")) {
            statusSwitchTextFields("tfU", true);
        }
    }

    public void PowerMotor(TextField tF) {

    }

    public void ElePowerLoss(TextField tF) {

    }

    public void MechPowerLoss(TextField tF) {

    }

    public void PowerLossMotor(TextField tF) {

    }

    public void TorqueMotor(TextField tF) {

    }

    public void ETAMotor(TextField tF) {

    }

    public void GearPower(TextField tF) {

    }

    public void Gear(TextField tF) {// min: 3

    }

    public void GearPowerLoss(TextField tF) {

    }
}
